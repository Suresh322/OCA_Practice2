package com.oca.suresh.practices;

public class Constructor3 
{
	static String name;
	int age ;
	Constructor3(String n, int a)
	{
		name=n;
		age =a;
	}
	public static void main(String[] args) 
	{
		Constructor3  c = new Constructor3("Sid",23);
		System.out.println(Constructor3.name);
		System.out.println(c.age);
		
		
	}
	
	

}
