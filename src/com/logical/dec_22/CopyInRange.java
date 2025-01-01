package com.logical.dec_22;

import java.util.Scanner;

public class CopyInRange 
{
	public static void copyInRange(int[] arr, int start, int end)
	{
		int size = end - start;
		int[] copyArr = new int[size];
		for(int i=0; i<size; i++)
		{
			copyArr[i] = arr[start++];
		}
		System.out.println("Copyed array is :");
		for(int n:copyArr)
			System.out.print(n+" ");
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size of array");
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" Elements :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int n:arr)
			System.out.print(n+", ");
		
		System.out.println("\nEnter array rage to copy new array");
		System.out.print("Start : ");
		int start = sc.nextInt();
		System.out.print("End : ");
		int end = sc.nextInt();
		
		copyInRange(arr, start, end);
		

	}

}
