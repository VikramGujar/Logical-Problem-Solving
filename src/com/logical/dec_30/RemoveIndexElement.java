package com.logical.dec_30;

public class RemoveIndexElement 
{
	public static int[] removeIndexElement(int[] arr, int index)
	{
		int[] res = new int[arr.length-1];
		int n = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(i==index)
				continue;
			res[n++] = arr[i];
		}
		return res;
	}

	public static void main(String[] args) 
	{
		int []arr = {1,3,4,5,7,4,2};
		int[] nArr = removeIndexElement(arr, 4);
		System.out.print("After removing :");
		for(int n : nArr)
		{
			System.out.print(n+" ");
		}

	}

}
