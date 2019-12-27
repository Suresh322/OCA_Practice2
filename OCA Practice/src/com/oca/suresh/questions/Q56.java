package com.oca.suresh.questions;

abstract class Planet
{
	protected void revolve()
	{
		System.out.println("revolve() in Planet class ");
	}
	
	abstract void rotate();  //--> (Default Access Modifier)
}

class Earth extends Planet
{
	public void revolve()
	{
		System.out.println("rotate() in Earth Class ");
	}
	protected void rotate()   //(So Access Modifier Should be More Visible than a Default)
	{
		System.out.println("rotate() in Earth Class"); 
	}
}

public class Q56 
{

}
