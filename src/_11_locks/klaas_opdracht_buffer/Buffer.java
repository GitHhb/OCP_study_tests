package _11_locks.klaas_opdracht_buffer;

// Consumer (<- buffer) (tel tot 10 random sleep 0-3 sec)
// Producer (-> buffer) (tel tot 10 random sleep 0-1 sec)
// main -> new buffer
// thread(consumer)
// thread(producer)

public interface Buffer<T> {

    //place value into the buffer
    public void blockingPut(T value) throws InterruptedException;

    //get value from the buffer
    public T blockingGet() throws InterruptedException;
}