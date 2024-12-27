package com.logical.dec_27;

import java.util.*;

public class InsertionSort 
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
		System.out.print("Array elements are :");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void insertionSort(int[] array)
	{
		int[] arr = array;
		for(int i=1; i<arr.length; i++)
		{
			int current = arr[i];
			int j = i-1;
			while(j>=0 && current <arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		printArray(arr);
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		
		int[] arr = createArray(size);
		printArray(arr);
		
		System.out.println("\nAfter sort");
		insertionSort(arr);
		sc.close();
	}

}
