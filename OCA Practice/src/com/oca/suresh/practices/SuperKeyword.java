package com.oca.suresh.practices;

class Company
{
	int i = 10;
	
    private Company()
	{
		System.out.println("Default Constructor in Company class");
	}
	Company(int k)
	{
		System.out.println("Default Constructor in Company class one arg");
	}
	
}
class CapG extends Company
{
	int i = 20;
	
	CapG()
	
	{
		super(20);
		System.out.println("Default Constructor in CapG class "+super.i);
	}
}
public class SuperKeyword 
{

	public static void main(String[] args) 
	{
		//Company cc = new Company();
		
		CapG c = new CapG();
	}

}
