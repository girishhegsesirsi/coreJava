package coreJava.multiThreading.blockingQueue;

public class BlockingQueueRunner {

	public static void main(String[] args) {
        BlockingQueue queue = new BlockingQueue();
        new Thread(() -> {
            try {
                queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                queue.put(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
	
}
