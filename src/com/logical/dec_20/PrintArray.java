package com.logical.dec_20;

/**
 *  Write a Java program to create an integer array of size 5.
 *  Initialize the array with the numbers 10, 20, 30, 40, and 50,
 *  and display all the elements using a for loop.
 */

import java.util.Scanner;

public class PrintArray 
{
	final static Scanner sc = new Scanner(System.in);
	
	public static int[] createArray(int size)
	{
		if(size < 0)
		{
			throw new IllegalArgumentException("Array size can't be negative :"+size);
		}
		int [] arr = {10, 20, 30, 40, 50};
		return arr;
	} 
		
	public static void printArray(int [] arr)
	{
		System.out.print("Array elements are :");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) 
	{
		 int[] arr = createArray(5);
		 printArray(arr);

	}

}
