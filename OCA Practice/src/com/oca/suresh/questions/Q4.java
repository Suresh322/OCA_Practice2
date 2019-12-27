package com.oca.suresh.questions;

class C2
{
	public void display()
	{
		System.out.println("displayC2()");
	}
}
interface I
{
	public void display();
	
}

class C1 extends C2 implements I
{

	@Override
	public void display() 
	{
		System.out.println("display() implemented in Class C1");
	}
	
}
public class Q4 
{

	public static void main(String[] args) 
	{
		C2 o1 = new C1();
		I o2 = new C1();
		
		C2 s = (C2)o2 ;
		I t =(I) o1;
		
		o1.display();
		o2.display();
		//o3.display();
		s.display();
		t.display();
		
		
		
		

	}

}
