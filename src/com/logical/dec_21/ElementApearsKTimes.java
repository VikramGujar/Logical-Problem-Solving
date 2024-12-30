package com.logical.dec_21;

public class ElementApearsKTimes 
{

	public static void printKTimesApearedElement(int[] arr, int k)
	{
		
		for(int i = 0; i<arr.length-1;i++)
		{
			int count = 1;
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count == k)
				System.out.println("K times apeared element is : "+arr[i]+" which came "+count+" times");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1, 3, 4, 6, 8, 9, 3, 3};
		int k = 3;
		printKTimesApearedElement(arr, k);
		

	}

}
