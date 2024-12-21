package com.logical.dec_20;

import java.util.Scanner;

/**
 * Write a Java program to retrieve the value at a specific index from an array.
   Use an array {100, 200, 300, 400, 500} and retrieve the value at index 3.

 */

public class RetriveSpecificIndex 
{
	final static Scanner sc = new Scanner(System.in);
	
	public static void retriveElementAtIndex(int index, int[] arr)
	{
	
		if(index < 0 || index > arr.length)
			throw new IndexOutOfBoundsException("Array index is out of limit "+index);
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[index] == arr[i])			
			System.out.println("At index "+index+" element "+arr[i]+" is present"); 		
		}
		
		
	}
	
	public static void printArray(int[] arr)
	{
		System.out.print("Array elements are :");
		
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr = {10, 20, 30, 40, 50, 60};
		printArray(arr);
		System.out.println("\n Enetr index to retrive the element :");
		int index = sc.nextInt();
		retriveElementAtIndex(index, arr);

	}

}
