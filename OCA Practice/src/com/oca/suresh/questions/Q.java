package com.oca.suresh.questions;


//public class Q {
//
//	public static void main(String[] args) {
//     int[] num1 = {1,2,3};
//     int[] num2 = {1,2,3,4,5};
//     num2 = num1;
//     System.out.println(num2.length);//
//     for(int a :num2) 
//     {
//     System.out.print(a+":");//
//	 }
// }
//}

class Animal
{
	public void eat()
	{
		System.out.println("Animals are Eating");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog is Eating");
	}
}
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("Cat is Eating");
	}
}

public class Q 
{

	public static void main (String[] args) 
	{
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new Cat();
	      a1 =(Animal)a3;
		a1.eat();
		a2.eat();
		a3.eat();
		//a4.eat();

	}

}