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
		
		for(int n:evenArr)
			System.out.println(n);
	}
	public static void main(String[] args) 
	{
		

	}

}
