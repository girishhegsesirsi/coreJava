package coreJava.multiThreading.semaphore;

public class SimpleSemaphore {
	 private boolean signal = false;

	  public synchronized void take() {
	    this.signal = true;
	    this.notify();
	  }

	  public synchronized void release() throws InterruptedException{
	    while(!this.signal) wait();
	    this.signal = false;
	  }
}
