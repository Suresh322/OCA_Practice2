package com.oca.suresh.questions;

public class Q38 
{

	public static void main(String[] args) 
	{
      int x = 100;
      int a = x++;
     
      int b = ++x;
      
      int c = x++;
     
      int d =(a<b) ? (a<c) ? a: (b<c)? b:c:x;
    
      int e = ++x;
    
	}

}
