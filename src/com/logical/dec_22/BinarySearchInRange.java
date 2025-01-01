package com.logical.dec_22;

public class BinarySearchInRange 
{

	public static int binarySearchInRange(int[] arr,int fromIndex,int toIndex, int ele)
	{
		int start = fromIndex;
		int end = toIndex;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			int midEle = arr[mid];
			if(ele>midEle)
				start = mid+1;
			else if(ele == arr[mid])
				return mid;
			else
				end = mid-1;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,5,6,7,8};
		int ele = 8;
		int from =2;
		int to = 5;
		for(int e : arr)
			System.out.print(e+", ");
		
		int index = binarySearchInRange(arr, from, to, ele);
		if (index != -1) 
		{
			System.out.println("\nElement found at index " + index);
		} else 
		{
			System.out.println("\nNot found");
		}

	}

}
