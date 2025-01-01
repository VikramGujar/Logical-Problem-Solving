package com.logical.dec_22;

public class CopyOddAndEven 
{

	public static void copyOddAndEven(int arr[])
	{
		int[] evenArr = new int[arr.length];
		int[] oddArr = new int[arr.length];
		int evenArrIndex = 0;
		int oddArrIndex = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				evenArr[evenArrIndex++] = arr[i]; 
			else
				oddArr[oddArrIndex++] = arr[i];
		}
		
		System.out.print("Even elements :");
		for(int n:evenArr)
		{
			if(n!=0)
			System.out.print(n+", ");
		}
		
		System.out.print("\nOdd elements :");
		for(int n:oddArr)
		{
			if(n!=0)
			System.out.print(n+", ");
		}
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,23,5,6,8,5,3,5,6};
		copyOddAndEven(arr);

	}

}
