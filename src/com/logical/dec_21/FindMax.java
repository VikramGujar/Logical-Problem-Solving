package com.logical.dec_21;

public class FindMax 
{
	public static int findMax(int[] arr)
	{
		int Max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(Max<arr[i])
				Max = arr[i];
		}
		return Max;
	}

	public static void main(String[] args) 
	{
		int[] arr = {9,3,5,7,4,2,9};
		System.out.println("Max element is :"+findMax(arr));
		

	}

}
