package com.logical.jan_22;

public class GetFirstUniqueChar 
{

	public static char getFirstUniqueChar(String s)
	{
		if(s.isEmpty()) return '-';
		
		char[] arr = s.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			int c = 1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
					c++;
			}
			if(c==1)
				return arr[i];
		}
		return '-';
	}
	public static void main(String[] args) 
	{
		String s = "JJJaava";
		System.out.println(getFirstUniqueChar(s));
	}
	

}
