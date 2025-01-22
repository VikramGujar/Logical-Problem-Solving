package com.logical.jan_22;

public class CompressToCount 
{

	public static void compressToCount(String s)
	{
		char[] arr = s.toCharArray();
		String res= "";
		int j = 0;
		for(int i=0; i<arr.length; i++)
		{
			int c =1;
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}else {
					break;
				}
				
			}
			if(c>1) {	
				i = j-1;
			res=res+arr[i]+c;
			}
			
			
		}
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		String s = "aaaaabsjjjaaahaaa";
		compressToCount(s);

	}
	

}
