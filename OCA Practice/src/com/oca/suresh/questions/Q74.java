package com.oca.suresh.questions;

public class Q74 {

	public static void main(String[] args) 
	{
		String n [] = {"Thomas", "Peter","Joseph"};
		String p [] = new String [3];
		int i = 0;
		try 
		{
			for (String nn: n) 
			{
				
			  p [i]=nn.substring(2,4);
		      i++;
				
			}
		}
		catch (Exception e)
		{
			System.out.println("Invalid name");
		}
		
//		for (String pp:p)
//		{
//			System.out.println(p[i]);
//		}
//		

	}

}
