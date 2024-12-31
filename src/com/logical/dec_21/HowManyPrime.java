package com.logical.dec_21;

public class HowManyPrime 
{

	public static int howManyPrime(int[] arr)
	{
		int primeCount = 0;
		for(int i=0; i<arr.length; i++)
		{
			int Count = 0;
			for(int j=2; j<=arr[i]/2; j++)
			{
				if(arr[i]%j==0)
					Count++;
			}
			if(Count ==0)
				primeCount++;
		}
		return primeCount;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr = {10,50,7,11,2,4};
		int primeCount = howManyPrime(arr);
		System.out.println("There are "+primeCount+" prime elements in array");

	}

}
