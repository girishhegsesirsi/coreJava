package coreJava.multiThreading.executor.types;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolMain {
	public static void main(String args[])
	{
		ExecutorService es=Executors.newSingleThreadExecutor();
		
		for (int i = 1; i <= 3; i++) {
			LoopTask loopTask=new LoopTask("LoopTask "+i);
			es.submit(loopTask);
		}
		es.shutdown();
	}
}

 class LoopTask implements Runnable {
	 
	private String loopTaskName;
	
	public LoopTask(String loopTaskName) {
		super();
		this.loopTaskName = loopTaskName;
	}
 
	@Override
	public void run() {
		System.out.println("Starting "+loopTaskName);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Executing "+loopTaskName+" with "+Thread.currentThread().getName()+"===="+i);
		}
		System.out.println("Ending "+loopTaskName);
	}
}