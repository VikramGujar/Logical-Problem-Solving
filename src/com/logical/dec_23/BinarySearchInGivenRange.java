package com.logical.dec_23;
import java.util.Arrays;
public class BinarySearchInGivenRange 
{
	public static int BinarySearchInRage(int[] arr, int start, int end, int element)
	{
		while(start<=end)
		{
			int mid = ( start + end ) / 2;
			
			if(element == arr[mid]) return mid;
			else if(element > arr[mid]) start = mid + 1;
			else if(element < arr[mid]) end = mid - 1;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr = {1, 3, 5, 7, 9, 2};
		Arrays.sort(arr);
		int element = 9;
		int result = BinarySearchInRage(arr, 0, 5, element);
		if(result>0)
			System.out.println(element+" is available at position "+result);
		else
			System.out.println(element+" is not available in given rage");

	}

}
