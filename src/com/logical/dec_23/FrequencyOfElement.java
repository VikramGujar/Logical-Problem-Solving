package com.logical.dec_23;

public class FrequencyOfElement 
{
	public static void getFrequency(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int count = 1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j]) 
				{
					count++;
					arr[i]='*';
				}
					
			}
			if(arr[i]!='*')
			System.out.println(arr[i]+" is present "+count+" times in array");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {1, 3, 5, 1, 3, 9, 1};
		getFrequency(arr);

	}

}
