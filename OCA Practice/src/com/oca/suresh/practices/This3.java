package com.oca.suresh.practices;

class BB
{  	
   BB getB()
   {  
     return this;  
   }  
    void msg()
    {
    	System.out.println("Hello Big B -O -S -S");
    }  
}  
public class This3 
{

	public static void main(String[] args) 
	{
		new BB().getB().msg();  

	}

}
