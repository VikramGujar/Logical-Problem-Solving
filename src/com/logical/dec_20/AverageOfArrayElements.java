package com.logical.dec_20;

public class AverageOfArrayElements 
{

	public static void averageOfArray(int[] arr)
	{
		int sum=0;
		for(int n : arr)
		{
			sum+=n;
		}
		System.out.println("Average is : "+(sum/arr.length));
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {3, 5, 7, 8, 3, 7};
		averageOfArray(arr);

	}

}
