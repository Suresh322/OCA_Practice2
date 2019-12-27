package com.oca.suresh.practices;

import java.io.IOException;

class Demo3
{
	void demo3() throws IOException
	{
		System.out.println("demo3()");
		throw new IOException();
	}
}
class Demo2
{
	void demo2() 
	{
		System.out.println("demo2()");

	}
}
class Demo1
{
	void demo1() 
	{
		System.out.println("demo1()");

	}
}
public class CheckedExceptions 
{
	public static void main(String[] args) 
	{
		new Demo1().demo1();
		
	}
	

}
