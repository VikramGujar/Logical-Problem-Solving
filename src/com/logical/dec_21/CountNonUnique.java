package com.logical.dec_21;

public class CountNonUnique 
{

	public static int countUnique(int[] arr)
	{
		int countUnique = 0;
		System.out.print("Unique are : ");
		for(int i=0; i<arr.length; i++)
		{
			int count =0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count < 2)
			{
				System.out.print(arr[i]+", ");
				countUnique++;
			}
		}
		return countUnique;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,1,2,2,2,3,3,4,5,6,6,6};
		System.out.print("\nThre are "+countUnique(arr)+" unique elements in array");
		

	}

}
