package com.logical.jan_06;

public class StringMethods 
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
	  	
	  	
	  	/*
	  	 * By default string literals comes under String pooling
	  	 * [Every String literal are by default intern ]
	  	 */
	  	
	  	String s = "abc";
	  	for(int i=0; i<10; i++)
	  	{
	  		s = s.concat(""+("c"+i));
	  	}
	  	System.out.println(s);
	  	
	  	/*
	  	 * String is immutable thats why we can not change
	  	 * for every update we have to create new string object
	  	 * and performance will decrease
	  	 * this is the major draw back of string
	  	 */
	  	
	  	/*
	  	 * Class : StringBuffer
	  	 * To solve draw back of string
	  	 * default capacity is 16 
	  	 * 
	  	 */
	  	
	  	//Default capacity is 16
	  	StringBuffer sb = new StringBuffer();	// 16
	  	System.out.println("Capacity :"+sb.capacity());//16
	  	System.out.println("Size :"+sb.length());//0
	  	
	  	// If we call String parameterize constructor of 
	  	// StringBuffer class it will create 16 + String length array
	  	StringBuffer sb1 = new StringBuffer("Vik"); // 16+3
	  	System.out.println("Capacity :"+sb1.capacity());//19
	  	System.out.println("Size :"+sb1.length());//3
	  	
	  	// StringBuffer have buffer locations [ empty 16 locations ]
	  	sb1.append("ram");
	  	System.out.println(sb1);	//Vikram
	  	System.out.println("Capacity :"+sb1.capacity());//19
	  	System.out.println("Size :"+sb1.length());//6
	  	
	  	
	  	// After filled up all locations 
	  	// it will create [size * 2 + 2] array
	  	sb1.append("123456789123456");
	  	System.out.println(sb1);	//Vikram
	  	System.out.println("Capacity :"+sb1.capacity());// [19*2+2 = 40]
	  	System.out.println("Size :"+sb1.length());//21
	  	
	  	/*
	  	 * In StringBuffer we are having byte[] value variable
	  	 * as non final variable that why we can change 
	  	 * and its mutable unlike String and its grow able also
	  	 * newCapacity = oldCapacity * 2 + 2;
	  	 */
	  	
	  	/*
	  	 * StringBuffer is having all methods Synchronize
	  	 * Thats why it is having Thread safe object
	  	 * Every method need object lock to execute change on resource
	  	 * StringBuffer is used in Multy Threaded applications 
	  	 * But is slow in single threaded envarament because unnecesery 
	  	 * locking by synchronized methods 
	  	 * When more modifications are needed
	  	 */
	  	
	  	/*
	  	 * String is also Thread safe object class 
	  	 * It is not having Synchronized methods
	  	 * Every immutable object is default Thread safe 
	  	 * because it dose not change data 
	  	 * at every update it create new object
	  	 */
	  	
	  	
	  	/*
	  	 * StringBuilder 
	  	 * Mutable and Non ThreadSafe
	  	 */
	  	
	  	/*
	  	 * String Pool
	  	 * String pool do not store duplicate objects
	  	 * While creating String via [=] operator and [" "]Every 
	  	 * time from string pool equals method calls and check is there 
	  	 * any object having same data if there is available it will 
	  	 * not create new object it will store location of previous
	  	 * New key word created objects are not part of String Pool
	  	 */
	  	
	  	/*
	  	 * Per heap area there is only one 
	  	 * String Constant Pool Area
	  	 * if we create in one class / different class / difference package 
	  	 * Same contained String new string will not created reference will
	  	 * be shared by every duplicate
	  	 */
	  	
	  	/*
	  	 * Object created in Heap area 
	  	 * String pool will store references of String Object
	  	 */
	  	
	  	
	  	
	}

}


