package com.logical.dec_21;


public class FindMedian 
{

	public static void findMedian(int[] arr)
	{
		int sum = 0;
		for(int e : arr)
			sum+=e;
		double median = sum/arr.length;
		System.out.println("\nMedian is : "+median);
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,1};
		for(int e : arr)
			System.out.print(e+", ");
		findMedian(arr);

	}

}
