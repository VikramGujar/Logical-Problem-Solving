package com.logical.dec_20;

public class PrintEvenAndOdd 
{

	public static void printEvenOdd(int[] arr)
	{
		System.out.print("Even elements are :");
		for(int a: arr)
		{
			if(a%2==0)
				System.out.print(a+" ");
		}
		
		System.out.println("\n---------------------");
		
		System.out.print("Odd elements are :");
		for(int a: arr)
		{
			if(a%2!=0)
				System.out.print(a+" ");
		}
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr = {1, 3, 8, 9, 3, 2};
		printEvenOdd(arr);
		

	}

}
