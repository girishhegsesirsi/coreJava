package coreJava.multiThreading.atomic.atomicInteger;

public class JavaAtomic {
//	 always output count value as 8 because AtomicInteger method incrementAndGet() atomically increments the current value by one.
    public static void main(String[] args) throws InterruptedException {

        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Processing count=" + pt.getCount());
    }
}
