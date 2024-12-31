package com.logical.dec_21;

public class CountAndPrintDuplicate 
{
	
	public static int countAndPrintDuplicate(int[] arr)
	{
		System.out.print("Duplicate elements are :");
		int countDuplicate = 0;
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j = 0; j<arr.length; j++)
			{
				if(arr[i]==arr[j] && i<=j)
					count++;
			}
			if(count>1)
			{
				System.out.print(arr[i]+", ");
				countDuplicate++;
			}
			
		}
		return countDuplicate;
	}
	
	public static void main(String[] args) 
	{
		int []arr = {1,1,2,3,3,4,5,5,6,6};
		System.out.println("\nThere are "+countAndPrintDuplicate(arr)+" duplicate elements in array");

	}

}
