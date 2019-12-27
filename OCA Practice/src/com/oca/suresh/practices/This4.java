package com.oca.suresh.practices;
class RR { 
    int first =222 ; 
    int second =333 ; 
   void garcia(int a, int b) 
    { 
        a = this.first; 
        b = this.second; 
        System.out.println(first); 
        System.out.println(second); 
        System.out.println(a); 
        System.out.println(b); 
    } 
   void louis(int m, int n) 
    { 
        this.first = m; 
        this.second = n; 
        System.out.println(first); 
        System.out.println(second); 
        System.out.println(m); 
        System.out.println(n); 
    }  
} 
public class This4 
{
	 public static void main(String[] args) 
	    { 
	        new RR().garcia(100, 200); 
	        new RR().louis(1, 2); 
	    } 

}
