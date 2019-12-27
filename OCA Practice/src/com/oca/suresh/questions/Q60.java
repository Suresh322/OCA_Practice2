package com.oca.suresh.questions;

interface Phone
{
	void read();
	void set();	
}
abstract class FaceBook implements Phone
{
	public void read()
	{
		System.out.println("read() in Book Class");
	}
	
}
abstract class Notebook extends FaceBook
{
	public void read() 
	{
		
	}
}

public class Q60 
{

	public static void main(String[] args) 
	{

	}

}
