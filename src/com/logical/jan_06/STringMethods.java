package com.logical.jan_06;

public class STringMethods 
{

	public static void main(String[] args) 
	{
		 String fname = "Vikram";
	  	 String lname = " Gujar";
	  	 
	  	 // concat method to add two string
	  	 String fullName = fname.concat(lname); // Vikram Gujar
	  	 System.out.println(fname);
	  	 System.out.println(lname);
	  	 // we can not modified string 
	  	 // string is immutable
	  	 // It is having value variable which is final
	  	 System.out.println(fullName);
	  	 
	  	 
	  	 /*
	  	  * records are also final thats why we can't change its data 
	  	  * setter are not available
	  	  * if you want to update record data you have to create a new object 
	  	  * updated data and assign to new object
	  	  */
	  	 
	  	 /*
	  	  * Mutator method 
	  	  * method which are use to update the data
	  	  */
	  	 
	  	 String fnameUp = fname.toUpperCase();
	  	 System.out.println(fnameUp);

	  	 
	  	 /*
	  	  * All the wrapper classes are immutable
	  	  * the are having private final variable
	  	  * we can not change 
	  	  */
	  	 
	  	 // Ways to create String object
	  	 String me = "ME";	// 1 object created
	  	 String me1 = new String("ME");	// 2 object created
	  	 // Argument will evaluate fist 
	  	 // literal 1st object will be created as ME
	  	 // then new keyword will create 2nd object
	  	 
	  	 
	  	String me2 = "copy";
	  	String me3 = "copy";
	  	String me4 = new String("copy");
	  	
	  	/*
	  	 * if we create two object with same data using = operator
	  	 * then new object will not be created it will refer to old only
	  	 */
	  	System.out.println(System.identityHashCode(me2));	//1554547125
	  	System.out.println(System.identityHashCode(me3));	//1554547125
	  	System.out.println(System.identityHashCode(me4));	//617901222
	  	
	  /*
	   * by using string literal -> ""
	   * by using new keyword ->  String Constructor
	   * by using String class methods
	   * adding two double quotes ->[+ operator] "A"+"B"
	   * Scanner.next() and scanner.nextLine() 
	   */
	  	
	  	
	}

}


