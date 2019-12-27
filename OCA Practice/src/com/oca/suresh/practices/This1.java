package com.oca.suresh.practices;

class Hello
{
	int a = 10 ;
	
	Hello()
	{
		    this(10);
			System.out.println(" default con");
	}
	
	Hello(int x)
	{
		System.out.println("  1 arg con");
	}
	
	void display()
	{
		
		System.out.println(this.a);
	}
}

class Hi extends Hello
{
	int a=20;
	Hi()
	{
		System.out.println(" default in Hi class");
	}

	void display()
	{
		
		System.out.println(super.a);
	}
	
}
public class This1 
{

	public static void main(String[] args) 
	{
		Hello h = new Hello();
		h.display();
		Hi i = new Hi();
		i.display();
		
	}

}
