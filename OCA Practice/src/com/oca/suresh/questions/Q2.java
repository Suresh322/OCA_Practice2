package com.oca.suresh.questions;

class A 
{
	public void test()
	{
		System.out.println("test() in Class A");
	}
}
class B extends A 
{
	public void test()
	{
		System.out.println("test() in Class B");
	}
}
class C extends B
{
	public void test()
	{
		System.out.println("test() in Class C");
	}
}
public class Q2 
{

	public static void main(String[] args) 
	{
		A b1 = new A();
		A b2 = new C();
		
		//b1 = (A) b2;
		
		A b3 = (B)b2;
		//A b4 = (B)b2;
		
		b1.test();
	    b3.test();
		
	}

}
