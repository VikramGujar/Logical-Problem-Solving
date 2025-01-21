package com.logical.jan_21;

public class CountOccurence {

	public static void main(String[] args) {
		String s = "java is pi, java is oop, java is mi";
		String word = "java";
		int c=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.indexOf(word)==0)
			{
				
				c++;
			}
		}
		System.out.println(c);

	}

}
