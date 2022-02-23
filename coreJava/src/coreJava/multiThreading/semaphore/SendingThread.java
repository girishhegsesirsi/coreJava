package coreJava.multiThreading.semaphore;

public class SendingThread {
	SimpleSemaphore semaphore = null;

	  public SendingThread(SimpleSemaphore semaphore){
	    this.semaphore = semaphore;
	  }

	  public void run(){
	    while(true){
	      //do something, then signal
	      this.semaphore.take();

	    }
	  }
	}