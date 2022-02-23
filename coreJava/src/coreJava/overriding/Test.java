package coreJava.overriding;

public class Test {
	public static void main(String[] varArgs )
	{
		A a = new B();
		a.print();
		
		
		B b = new B();
		b.print();
		//a.test();
		b.test();
		
	}
}

class B extends A {
	public void print()
	{
		super.print();
		System.out.println("B");
	}
	
	public void test()
	{
		System.out.println("test");
	}
}

class A{

	public void print()
	{
		System.out.println("a");
	}
	
}