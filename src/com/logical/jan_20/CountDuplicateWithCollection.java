package com.logical.jan_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountDuplicateWithCollection 
{

	public static void main(String[] args) 
	{
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(2);
		ls.add(3);
		List<Integer> ls1 = new ArrayList<Integer>();
		System.out.println(ls1.equals(ls));
		
		
		Collections.replaceAll(ls, 2, 1);
		System.out.println(ls);
		
		

	}

}
