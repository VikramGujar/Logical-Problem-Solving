package com.logical.jan_21;

public class CheckWordPresenceInSentence 
{

	public static void main(String[] args) 
	{
		String s = "Java is the best programming language ";
		String toCheck = "best";
		boolean isPresent = s.contains(toCheck);
		System.out.println(isPresent?"String is present":"String is not present");

	}

}
