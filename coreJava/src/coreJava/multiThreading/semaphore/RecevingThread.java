package coreJava.multiThreading.semaphore;

public class RecevingThread {
	SimpleSemaphore semaphore = null;

	  public void ReceivingThread(SimpleSemaphore semaphore){
	    this.semaphore = semaphore;
	  }

	  public void run(){
	    while(true){
	    	try {
	      this.semaphore.release();
	      //receive signal, then do something...
	    }catch(Exception ex) {}
	    }
	  }
	}
