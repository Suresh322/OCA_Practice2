package com.oca.suresh.questions;

import java.io.IOException;

class X 
{
	 void print() throws IOException 
	 {
		System.out.println("print() in X class");
		throw new IOException(); 
	 }
}
public class Q47 
{
  public static void main(String[] args) 
	{


		X x =  new X();
		try {
			 x.print();
		    }
		catch (Exception e)
		{
			System.out.println("Catch block");
		}
		
	}

}
