package coreJava.multiThreading.threadLocal;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoTask demo= new DemoTask();
		List<Thread> list = new ArrayList<Thread>();
		for (int i=0;i<3;i++) {
			list.add(new Thread(demo));
		}
		
for(int i=0;i<3;i++)
		list.get(i).start();
	}

}
