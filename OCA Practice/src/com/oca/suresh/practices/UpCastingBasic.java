package com.oca.suresh.practices;

class Super 
{
	   void Sample() 
	   {
	     
		   System.out.println("method of super class");
		   
	   }
}

class Sub extends Super 
{
	   void Sample() 
	   {
		   
	      System.out.println("method of sub class");
	      
	   }
	   
	   
	}

public class UpCastingBasic 
{
	public static void main(String args[]) 
	{
	      Super obj =(Super) new Sub();
	      obj.Sample();
	 }

}
