package com.logical.dec_20;

/**
 *  Create a program that accepts the size of an array from the user,
 	initializes the array with random numbers between 1 and 100, and 
 	prints the array.
 */

import java.util.Random;
import java.util.Scanner;

public class RandomArray 
{
	final static Scanner sc = new Scanner(System.in);
	
	public static int[] randomArray(int size, int min, int max)
	{
		if(size < 0)
		{
			throw new IllegalArgumentException("Array size can't be negative :"+size);
		}
		int[] arr = new int[size];
		Random randumValues = new Random();
		
		for(int i=0; i<size; i++)
		{
			arr[i] = randumValues.nextInt(min, max);
		}
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		System.out.println("Array elements are :");
		
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter size of random array :");
		int size = sc.nextInt();
		
		System.out.println("Enter range of random numbers ");
		System.out.print("Min :");
		int min = sc.nextInt();
		System.out.print("Max :");
		int max = sc.nextInt();
		
		int[] arr = randomArray(size, min, max);
		printArray(arr);
		

	}

}
