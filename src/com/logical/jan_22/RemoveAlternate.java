package com.logical.jan_22;

public class RemoveAlternate 
{

	public static void main(String[] args) 
	{
		StringBuilder s= new StringBuilder("Hello World");
		for(int i=0; i<s.length();i++)
		{
			if(i%2==0)
				s.deleteCharAt(i);
		}
		System.out.println(s);
				

	}

}
