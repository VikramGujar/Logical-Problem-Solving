package com.logical.jan_20;

public class CountDuplicate 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,5,4};
		
		int countDuplicate=0;
		System.out.print("Duplicates : ");
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
		System.out.println("\nThere are "+countDuplicate+" Duplicate elements");

	}

}
