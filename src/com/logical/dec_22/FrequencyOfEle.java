package com.logical.dec_22;

public class FrequencyOfEle 
{
	public static void frequencyOfEle(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int frequencyCount = 0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j]&& i<j)
					frequencyCount++;
			}
			if(frequencyCount!=0)
			System.out.println("Frequency of "+arr[i]+" is "+frequencyCount);
		}
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {2,3,4,5,6,43,2,3,3,1,12,2,3,34,4,4};
		frequencyOfEle(arr);

	}

}
