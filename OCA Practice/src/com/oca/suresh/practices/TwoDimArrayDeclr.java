package com.oca.suresh.practices;

public class TwoDimArrayDeclr 
{

	public static void main(String[] args) 
	{
		int [][] arr ;
		//int arr2 [] [];
		//int [] arr3 [];
		
		arr = new int [4] [3];
		
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		
		arr[1][0] = 110;
		arr[1][1] = 210;
		arr[1][2] = 310;
		
		arr[2][0] = 120;
		arr[2][1] = 220;
		arr[2][2] = 320;
		
		arr[3][0] = 130;
		arr[3][1] = 230;
	    arr[3][2] = 330;
	
		int i = arr.length;
		int j = arr[3].length; 
		
		System.out.println("arry size "+i);
		System.out.println("arry  index size "+j);
		
		for(int k=0;k<i;k++)
		{
			for(int l=0;l<j;l++)
			{
				System.out.println(arr[k][l]);
			}
			
		}
		
		

	}

}
