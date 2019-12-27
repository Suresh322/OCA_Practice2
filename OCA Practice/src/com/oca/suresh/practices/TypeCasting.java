package com.oca.suresh.practices;
class A1
{
	void ma()
	{
		System.out.println(" m1() in A");
	}
}
class B extends A1 
{
	void mb()
	{
		System.out.println(" m2() in B");
	}
}

public class TypeCasting 
{
	public static void main(String[] args) {
		
	
	A1 a1 = new A1();
	a1.ma();
	A1 a2 = new B();

	a2.ma();
	//a2.mb();
     B b1 =(B)a2;
     b1.ma();
     b1.mb();
}
}
