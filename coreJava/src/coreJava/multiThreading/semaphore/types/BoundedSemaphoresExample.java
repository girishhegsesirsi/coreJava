package coreJava.multiThreading.semaphore.types;

public class BoundedSemaphoresExample {  
	private int signals = 0;  
	private int bound = 0;  
	public BoundedSemaphoresExample(int upperBound)  
	{  
	this.bound = upperBound;  
	}  
	public synchronized void  take() throws InterruptedException  
	{  
	while(this.signals == bound)  
	wait();  
	this.signals++;  
	this.bound++;  
	}  
	public synchronized void  release() throws InterruptedException  
	{  
	while(this.signals == 0)  
	wait();  
	this.signals--;  
	}  
	}  