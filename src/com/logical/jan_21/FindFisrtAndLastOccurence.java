package com.logical.jan_21;

public class FindFisrtAndLastOccurence 
{
	public static void findFisrtAndLastOccurence(String s, char toCheck)
	{
		int fistOccurence = 0;
		int lastOccurence = 0;
		for(int i=0; i<s.length();i++)
		{
			if(fistOccurence<1 && s.charAt(i)== toCheck)
				fistOccurence = i;
			
			if(fistOccurence!=0 && s.charAt(i)== toCheck)
				lastOccurence = i;
				
		}
		
		System.out.println
		("FistOccurence = "+fistOccurence+" LastOccurence = "+lastOccurence+"");
	}

	public static void main(String[] args) 
	{
		String s = "Hello World";
		char occurenceToCheck = 'o';
		findFisrtAndLastOccurence(s, occurenceToCheck);
	}

}
