package com.logical.dec_20;

public class SumOfArrayElements 
{

	public static void sumOfArrayElements(int[] arr)
	{
		int sum=0;
		for(int n : arr)
		{
			sum+=n;
		}
		System.out.print("Sum of array elements is : "+sum);
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,5,7,3,8,9,2,4,6};
		sumOfArrayElements(arr);

	}

}
