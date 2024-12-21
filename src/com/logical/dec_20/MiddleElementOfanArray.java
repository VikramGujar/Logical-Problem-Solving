package com.logical.dec_20;

/**
 * Write a java program to find the middle elements of a given array. 
   If array is odd then print only the middle element, if array is even then
   print both the middle elements.
 */
import java.util.Scanner;

public class MiddleElementOfanArray 
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
	
	public static void printMiddleElement(int[] arr)
	{
		if(arr.length % 2 != 0)
			System.out.print("Middle element is :"+arr[arr.length/2]);
		else
			System.out.print("Middle element are :"+arr[arr.length/2]+" "+arr[arr.length/2-1]);			
	}

	public static void main(String[] args) 
	{
		 System.out.println("Enter size of array :");
		 int size = sc.nextInt();
		 
		 int[] arr = createArray(size);
		 printArray(arr);
		 printMiddleElement(arr);

	}

}
