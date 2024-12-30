package com.logical.dec_21;

public class PrintMajorityElement 
{
	public static void printMajorityElement(int[] arr)
	{
		
		for(int i = 0; i<arr.length-1;i++)
		{
			int count = 1;
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count>(arr.length/2))
				System.out.println("Majority element is : "+arr[i]+" which came "+count+" times");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {3, 3, 3, 2, 4, 3, 2, 4, 3};
		printMajorityElement(arr);

	}

}
