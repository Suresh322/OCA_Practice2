package com.oca.suresh.practices;
class Animal
{
	public void eat()
	{
		System.out.println("eat () in Animal Class");
	}
}
class Tiger extends Animal
{
	public void eat()
	{
		System.out.println("eat () in Tiger Class");
	}
	public void roar()
	{
		System.out.println("roar() in Tiger Class");
	}
	
	
}

class Dog extends  Animal
{
//	public void eat()
//	{
//		System.out.println("eat () in Dog Class");
//	}
	
	public void bark()
	{
		System.out.println("bark() in Dog Class");
	}
	
	
}

public class DownCasting 
{

	public static void main(String[] args) 
	{
      Dog d1=new Dog();
      Animal a1=new Dog();
      Animal a2 = new Tiger();
    //Dog d2 = (Dog) a2;
      Animal a3 = new Animal();
      System.out.println("Check");
     //iger t1 = (Tiger)a3;
      Tiger t2= new Tiger();
      Animal a4= (Animal)t2;
     
     
	}

}
