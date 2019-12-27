package com.oca.suresh.questions;

public class Q1 
 {
    private char var;
    
	public static void main(String[] args) 
	{
      char var1='a';
      char var2=var1;
      var2='o';
      
      Q1 q1 = new Q1();
      
      Q1 q2 = new Q1();
      q1.var='i';
      q2.var='o';
      System.out.println(var1+ " "+var2);
      System.out.println(q1.var+ " "+q2.var);
      
	}

}
