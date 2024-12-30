package com.logical.dec_21;

public class CountElemetsGreaterThanAvg 
{

	public static void countGreaterThanAvrgElements(int[] arr)
	{
		int sum = 0, avgCount = 0;
		
		for(int n : arr)
		{
			sum+=n;
		}
		for(int n : arr)
		{
			if(n>(sum/arr.length))
				avgCount++;
		}
		System.out.println("There are "+avgCount+" elements grater than average");
	}
	
	public static void main(String[] args) 
	{
		int[] arr =  {10, 20, 30, 40, 50};
		countGreaterThanAvrgElements(arr);

	}

}
