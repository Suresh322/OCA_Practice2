package com.oca.suresh.practices;

public class Constructor2 
{ 
	String name;
	int age ;
	
	Constructor2 ()
	{
		name= "Suresh";
		age = 24;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(new Constructor2().name);
		System.out.println(new Constructor2().age);
		
	}
	

}
