package com.logical.jan_06;

public class StringNotes 
{

	/*
	 
	  String is a collection of characters 
	  string literal
	  => zero or multiple character placed inside " " is known as STRING LITERAL 

	  String
	  => It is a class present in java.util package.
	 
	  // Original way to store multiple characters
	 	char[] array = {'v','i','k','r','a','m'}  
	 	
	 But it has some problems
	 	1. FIX IN SIZE
	 	2. NO READABILITY
	 	3. NO PRE-DEFINED METHOD SUPPORT
	 	4. STORING PROBLEM
	 
	 Solution for these problems	
	    java.util.String [ String class ]
	 	String is not having readability problem
	 	It has multiple pre-defined methods 
	 	can store any size inside " "
	  
	  We can store string data in StringBuffer and StringBuilder also. 
	  	
	  String do not store data directly it String variable stores the
	  location of Character array that store the data
	  
	  public final String ()
	  {
	  	// value is a reference type variable stores location of byte array 
	  	private final byte[] value; // Changed from char[] to byte[]
	  	
	  	// 15  Constructor 
	  	// 65+ Methods
	  
	  }
	  
	  String s = "Java";
	  s - 1000x -> value 2000x -> char[] 3000x
	  	  value          char[]          continues locations 
	  	  
	  1. concat  
	  => Return addition of two strings
	  	 String fname = "Vikram";
	  	 String lname = " Gujar";
	  	 String fullName = fname.concat(lname); // Vikram Gujar
	  	 
	  
	  
	  
	  
	  
	  
	  
	 
	 */
}
