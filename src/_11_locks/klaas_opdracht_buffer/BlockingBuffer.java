package _11_locks.klaas_opdracht_buffer;

public class BlockingBuffer<T> implements Buffer<T> {
    final int MAXBUFSIZE;
    // buftail = oldest element in buffer
    // bufhead - 1 = newest element in buffer
    // bufhead - buftail == # elements in buffer, or more precise:
    // ( (bufhead + MAXBUFSIZE) - buftail ) % MAXBUFSIZE == # elements in buffer
    // Buffer full ==> bufsize == MAXBUFSIZE
    private int bufhead = 0;   // index to head of buffer
    private int buftail = 0;   // index to tail of buffer
    private int bufsize = 0;    // current buffer size
    private T[] buf;

    public BlockingBuffer (int bufsize) {
        MAXBUFSIZE = Math.max(1, bufsize);  // min bufsize == 1
        buf = (T[]) new Object[MAXBUFSIZE];
    }

    private boolean bufIsFull() { return bufsize == MAXBUFSIZE; }
    private boolean bufIsEmpty() { return bufsize == 0; }

    private void printBuffer() {
        for (int i = 0; i < MAXBUFSIZE; i++) {
            System.out.printf("%3s ",
                    (buftail < bufhead && i>=buftail && i<bufhead) ||
                            (buftail > bufhead && (i<bufhead || i>=buftail)) ||
                            bufIsFull()
                    ? (T)buf[i] : "-");
        }
        System.out.printf("  | %2st %2sh %2ss%n", buftail, bufhead, bufsize);
    }

    //place value into the buffer
    public synchronized void blockingPut(T value) throws InterruptedException {
        while (bufIsFull()) {
            System.out.printf("PUT %3d WAIT\t\t%n", value);
            wait();}
        // STATE: at least 1 position is empty in buffer => safe to write
        buf[bufhead] = value;
        bufhead = ++bufhead % MAXBUFSIZE;   // advance head
        bufsize++;                          // increase bufsize
        notifyAll();                        // signal blockingGet methods in wait state, if any
        System.out.printf("\t\t\t %3d => ", value);
        printBuffer();
        }

    //get value from the buffer
    public synchronized T blockingGet() throws InterruptedException{
        while (bufIsEmpty()) {
            System.out.printf("GET %3s WAIT\t\t%n", (T)buf[buftail]);
            wait();}
        // STATE: buffer not empty => safe to read
        int index = buftail;
        buftail = ++buftail % MAXBUFSIZE;
        bufsize--;
        notifyAll();
        System.out.printf("\t\t\t %3s <= ", (T)buf[index]);
        printBuffer();
        System.out.println("Type: " + buf[index].getClass().getName());
        return  buf[index];
    }

}


class GenericTest<T> {
    T[] x = (T[]) new Object[2];
    void set(T value) { x[0] = value;}
    T get(){ return x[0];}
}
