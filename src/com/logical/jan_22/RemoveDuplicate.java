package com.logical.jan_22;

import java.util.LinkedHashSet;

public class RemoveDuplicate 
{

	public static void main(String[] args) 
	{
		String s = "hjadhhfgwegfyufgfgsh";
		
		char[] arr = s.toCharArray();
		
		LinkedHashSet<Character> uniqList = new LinkedHashSet<Character>();
		for(char c: arr)
		{
		uniqList.add(c);
		}
		String s1 = "";
		for(char c:uniqList)
		{
			s1 += ""+c;
		}

		System.out.println(s1);
		
	}

}
