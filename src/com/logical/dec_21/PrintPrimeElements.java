package com.logical.dec_21;

public class PrintPrimeElements 
{
	public static void printPrime(int []arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=2; j<= arr[i]/2; j++)
			{
				if(arr[i]%j==0)
					count++;
			}
			if(count==0)
				System.out.print(arr[i]+", ");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {2,4,6,7,8,4,5,11,17};
		System.out.print("Prime elements are :");
		printPrime(arr);

	}

}
