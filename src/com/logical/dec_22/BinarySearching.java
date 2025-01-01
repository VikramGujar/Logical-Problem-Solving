package com.logical.dec_22;

public class BinarySearching 
{
	public static int binarySearch(int[] arr, int key) 
	{  
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			int midEle = arr[mid];
			
			if(key>midEle)
			{
				start = mid+1;
			}
			else if(key==midEle)
			{
				return mid;
			}
			else 
			{
				end = mid-1;
			}
		}
		return -1;
	}
	 public static void main(String[] args) 
	 {
			int[] arr = {1,2,3,5,6,7,8};
			int ele = 3;
			
			for(int e : arr)
				System.out.print(e+", ");
			
			int index = binarySearch(arr, ele);
			if (index != -1) 
			{
				System.out.println("\nElement found at index " + index);
			} else 
			{
				System.out.println("\nNot found");
			}
		}

}
