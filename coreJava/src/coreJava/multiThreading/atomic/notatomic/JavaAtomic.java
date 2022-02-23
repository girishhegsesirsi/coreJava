package coreJava.multiThreading.atomic.notatomic;

public class JavaAtomic {
//below program gives different outcome every time as count++ is not atomic
    public static void main(String[] args) throws InterruptedException {

        ProcessingThread pt = new ProcessingThread();
       // ProcessingThread pt1 = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Processing count=" + pt.getCount());
    }

}