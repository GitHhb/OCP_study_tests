package oca_casting;

public class SameMethodInSeparateInterfaces {
    public static void main(String[] args) {
        ThreadC1 x = new ThreadC1(new C2());
        x.start();
    }
}

interface RunnableI1 {
    void runit();
}

class ThreadC1 implements RunnableI1 {
    RunnableI1 run;
    ThreadC1(RunnableI1 r){run = r;}

    void start(){ run.runit();}
    public void runit(){
        System.out.println("Class C1");
    }
}

class C2 implements RunnableI1{
    public void runit(){
        System.out.println("Class C2");
    }
}
