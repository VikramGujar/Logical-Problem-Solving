package com.logical.dec_20;

/**
 *  Write a program to store array dynamically by reading the size 
 	and elements from the user.
 	Input as: 
 	Enter size of the array:6
 	Enter 6 elements: 1 2 3 4 5 6
 	Output is: 
 	Array elements are: 1 2 3 4 5 6
 */

import java.util.Scanner;

public class DunamicArray 
{

	final static Scanner sc = new Scanner(System.in);
	
	public static int[] createArray(int size)
	{
		if(size<0)
		{
			throw new IllegalArgumentException("Array size can not be negative");
		}
		int[] arr = new int[size];
		System.out.print("Enter "+size+" elemets :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	} 
		
	public static void printArray(int [] arr)
	{
	
		if(arr == null)
		{
			throw new NullPointerException("Array can not be null");
		}
		
		System.out.print("Array elements are :");
		for(int element : arr)
		{
			System.out.print(element+" ");
		}
	}

	public static void main(String[] args) 
	{
		 System.out.println("Enter size of array :");
		 int size = sc.nextInt();
		 
		 int[] arr = createArray(size);
		 printArray(arr);
		

	}

}


