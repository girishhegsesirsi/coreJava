package coreJava.multiThreading.intrthrdComm.reentrantLock;

import java.util.concurrent.locks.Lock;

class Counter {
	private Lock lock;
	// Lock to protect our counter 
	private int count; 
	// Integer to hold count 
	public Counter(Lock myLock) { 
		this.lock = myLock; 
		} 
	public final int getCount() { 
		lock.lock();
		try { 
			count++; 
			return count; 
		} 
		finally { 
			lock.unlock(); 
			} 
		}
	}


