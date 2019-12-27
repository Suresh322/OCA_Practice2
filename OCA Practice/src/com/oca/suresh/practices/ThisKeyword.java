package com.oca.suresh.practices;

class A
{
	A()
	{
		System.out.println("Default Constr in Class A");
	}
	
	A(int i)
	{
		this();
		System.out.println("one arg Constr in Class A :"+i);
	}
	
	A(int i,int j)
	{
		this(i);
		System.out.println("one arg Constr in Class A :"+i);
	}
	
 }
public class ThisKeyword 
{

	public static void main(String[] args) 
	{
		A a = new A(10,20);

	}

}
