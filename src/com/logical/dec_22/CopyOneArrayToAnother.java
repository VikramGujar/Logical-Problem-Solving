package com.logical.dec_22;

public class CopyOneArrayToAnother 
{

	public static int[] copyOfArray(int[] arr)
	{
		int[] res = new int[arr.length];
		for(int i=0; i<arr.length; i++)
			res[i] = arr[i];
		return res;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6};
		int[] copyArr = copyOfArray(arr);
		
		for(int n:copyArr)
			System.out.print(n+", ");
	}

}
