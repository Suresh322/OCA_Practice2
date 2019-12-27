package com.oca.suresh.questions;

interface Downloadable
{ 
	int a=10;

	public void download();
	
}
interface Readable extends  Downloadable
{
	void read();
}

abstract class Book implements Readable
{
	public void read() 
	{
		System.out.println("read() in Book Class ");
		
	}
}
abstract class EBook extends Book
{
	public void read() 
	{
		System.out.println("read() in EBook Class ");
		
	}
	
	
//	public void download()
//	{
//		System.out.println("download() in EBook Class");
//	}
	
}
public class Q15 
{

	public static void main(String[] args) 
	{
		//Book b1 = new EBook(); -->(Object cannot be created for Abstract Classes and Interface Classes)
		//b.read();

	}

}
