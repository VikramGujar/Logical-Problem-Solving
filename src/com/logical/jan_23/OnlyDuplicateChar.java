package com.logical.jan_23;

//Q. Print Only duplicate character
//	 count the duplicate character
public class OnlyDuplicateChar 
{
	
	public static void main(String[] args) 
	{
	String s = "AAbbccthkdjsdhalsd";
	
	String res = "";
	
	for(int i=0; i<s.length(); i++)
	{
		int count = 1;
		for(int j=i+1; j<s.length()-1;j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
				
			}
		}
		if(count>1)
		{
			res += res.charAt(i);
		}
	}
	
	System.out.println("Duplicates : "+res);

	}

}
/*

//Q. Print Only unique character/ count the unique character
//Q. Reverse the Given String.
//Q. Count vowels and consonant from a given
//Q. Remove a specific character all occurence.
//Q. Remove all digit from the String.
//Q. Remove all vowels from String
//Q. Reverse the words in its place.
//Q. Check the string is pallindrome or not.
//Q. Check the both Strings are Anagram or not
//Q. Sort the given String
*/