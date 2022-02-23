package coreJava.multiThreading.intrthrdComm.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/** * * Java Program to show how to use Locks in multi-threading * e.g. ReentrantLock, ReentrantReadWriteLock etc. * * @author Javin Paul */ 
public class LockDemo { 
	public static void main(String args[]) {
		
		// Let's create a counter and shared it between three threads 
		// Since Counter needs a lock to protect its getCount() method 
		// we are giving it a ReentrantLock. 
		final Counter myCounter = new Counter(new ReentrantLock()); 
		
		// Task to be executed by each thread 
		Runnable r = new Runnable() {
			
			@Override public void run() { 
				System.out.printf("Count at thread %s is %d %n", Thread.currentThread().getName(), myCounter.getCount());
				}
			
			}; 
			
		// Creating three threads 
			Thread t1 = new Thread(r, "T1"); 
			Thread t2 = new Thread(r, "T2"); 
			Thread t3 = new Thread(r, "T3"); 
			
			//starting all threads 
			t1.start(); 
			t2.start(); 
			t3.start(); 
			} 
	}
	

