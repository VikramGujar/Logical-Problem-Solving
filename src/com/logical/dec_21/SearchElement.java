package com.logical.dec_21;

import java.util.Scanner;
public class SearchElement 
{

	public static void searchElement(int[] arr, int element)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==element)
			{
				System.out.println(element+" found at Index "+i);
				System.exit(i);
			}
		}
		System.err.println("Element not fount!");
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.print("Array is :");
		for(int e : arr)
			System.out.print(e+", ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter element to search :");
		int ele = sc.nextInt();
		searchElement(arr, ele);
		sc.close();

	}

}
