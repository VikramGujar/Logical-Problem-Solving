package com.logical.jan_21;

import java.util.Scanner;

public class TakeInput 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.next();
		sc.close();
		
	}

}
