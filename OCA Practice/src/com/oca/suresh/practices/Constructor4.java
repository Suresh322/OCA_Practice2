package com.oca.suresh.practices;

public class Constructor4 
{
   String movie;
   int rating ;
   String desc;
   
   Constructor4( String m,int r, String d)
   {
	   movie=m;
	   rating=r;
	   desc=d;
   }
   
   public static void main(String[] args) 
   {
	   Constructor4 c = new Constructor4("ARJUNREDDY",10,"BlockBuster");
	   System.out.println(c.movie);
	   System.out.println(c.rating);
	   System.out.println(c.desc);
	   System.out.println();
	   Constructor4 c1 = new Constructor4("KGF",9,"GOOD");
	   System.out.println(c1.movie);
	   System.out.println(c1.rating);
	   System.out.println(c1.desc);
	
   }
   
}
