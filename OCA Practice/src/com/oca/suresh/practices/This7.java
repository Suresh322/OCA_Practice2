package com.oca.suresh.practices;

class Cars
{
	
  int speed;  
  String name;  
  
 
  Cars(int speed,String name)
  {  
    this.speed=speed;  
    this.name=name;  
 
  } 
}
class Honda extends Cars
{
	String trans;
	
	
	Honda(int speed,String name,String trans)
	{
		super(speed,name);
		this.trans=trans;
	    System.out.println(trans +" ,"+speed+" ,"+name);
		
	}
	
}

public class This7
{
	public static void main(String [] args)
	{
		Honda h = new Honda(200,"Etios","2W");
	
		
	}
}
