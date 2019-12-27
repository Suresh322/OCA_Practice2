package com.oca.suresh.screenshots;

public class QQ10 
{

	public static void main(String[] args) 
	{
	   StringBuilder sb = new StringBuilder(2);
	   String s = new String();
	   String b= "";
	   String s1=sb.toString();
	   String s2=b.toString();
	   String s3=s.toString();
	   System.out.println(s1 +" ,"+s2+" ,"+s3);
	   if(sb.equals(b))
	   {
		   System.out.println("Match_1");
	   }
	   else if (s1.equals(s2))
	   {
		   System.out.println("Match_2");  
	   }
	   else 
	   {
		   System.out.println("No Match");
	   }
	   

	}

}
 