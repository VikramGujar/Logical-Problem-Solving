package com.logical.dec_21;

public class CountEvenAndOdd 
{

	public static void countEvenAndOdd(int[] arr)
	{
		int evenCount = 0;
		int oddCount = 0;
		
		for(int n : arr)
		{
			if(n%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.print("Even count = "+evenCount);
		System.out.print("\nOdd count = "+oddCount);
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		countEvenAndOdd(arr);
	}

}
