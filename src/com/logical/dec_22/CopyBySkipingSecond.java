package com.logical.dec_22;

import java.util.Arrays;

public class CopyBySkipingSecond 
{

	public static int[] copyBySkipingSecondEle(int[] arr)
	{
		int[] copy = new int[arr.length/2];
		int copyStart=0;
		for(int i=0; i<arr.length-1;i++)
		{
			if(i!=1 && i%2==0 )
				copy[copyStart++] = arr[i]; 
		}
		return copy;
	}
	public static void main(String[] args) 
	{
		int[] arr = {2,4,5,6,3,2,6,8,9};
		int[] copy = copyBySkipingSecondEle(arr);
		System.out.println(Arrays.toString(copy));

	}

}
