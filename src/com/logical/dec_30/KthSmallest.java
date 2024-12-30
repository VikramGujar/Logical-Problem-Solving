package com.logical.dec_30;

import java.util.Arrays;

public class KthSmallest 
{

	public static int kthSmallest(int[] arr, int k)
	{
		Arrays.sort(arr);
		
		if(k == 1)
			return arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			int count = 0;
			for(int j=i+1; j<arr.length-1; j++)
			{
				if(arr[i]!=arr[j])
					count++;
			}
			if(k==count)
				return arr[i+1];
			
		}
		return -1;
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,3,5,6,2,1,1,5};
		int k = 4;
		System.out.println(k+"th smallest element is :"+kthSmallest(arr, k));
	}

}
