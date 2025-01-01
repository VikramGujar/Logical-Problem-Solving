package com.logical.dec_22;

public class FindEvenandOddPositionElement 
{
	public static void findEvenandOddPositionElement(int[] arr)
	{
		System.out.print("Even position Elements : ");
		for(int i=0; i<arr.length; i++)
			if(i%2==0)
				System.out.print(arr[i]+", ");
		
		System.out.print("\nOdd position Elements : ");
		for(int i=0; i<arr.length; i++)
			if(i%2!=0)
				System.out.print(arr[i]+", ");
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,5,6,8,5,3,2,1,1};
		findEvenandOddPositionElement(arr);

	}

}
