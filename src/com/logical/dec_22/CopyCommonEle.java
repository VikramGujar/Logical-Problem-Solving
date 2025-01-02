package com.logical.dec_22;

public class CopyCommonEle 
{
	public static int[] copyCommonEle(int[] arr1, int[] arr2)
	{
		int[] commonCopy = new int[arr1.length];
		int start=0;
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					commonCopy[start++] = arr1[i]; 
			}
	
		}
		return commonCopy;
	}
	public static void main(String[] args) 
	{
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {9,8,7,6,4,1,2};
		
		int[] commonCopy = copyCommonEle(arr1, arr2);
		System.out.print("Common elements are : ");
		for(int n:commonCopy)
			if(n!=0)
				System.out.print(n+", ");

	}

}
