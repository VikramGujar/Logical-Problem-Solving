package com.logical.jan_21;

import java.util.Scanner;

public class DisplayShortName 
{
	
    public static void displayShortName(String fullName) 
    {
        
        String[] nameParts = fullName.trim().split("\\s+");
        
        StringBuilder shortName = new StringBuilder();

        
        for (int i = 0; i < nameParts.length - 1; i++) {
            shortName.append(nameParts[i].charAt(0)).append(".");
        }

        shortName.append(nameParts[nameParts.length - 1]);
        
        System.out.println("Short name is: " + shortName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = sc.nextLine();
        
        // Call the function to display the short name
        displayShortName(fullName);

        sc.close();
    }
}
