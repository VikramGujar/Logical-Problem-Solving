package com.logical.dec_18;


import java.util.*;

public class SecondMaxWithoutArray 
{
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("How many number you want to enter : ");
     
     int num = sc.nextInt();
     int max = Integer.MIN_VALUE;
     int sec= Integer.MIN_VALUE;
     int number ;
     
     for(int i =0; i<num; i++)
     {
         number = sc.nextInt();
         if(number>max)
         {
             sec = max;
             max = number;
         }else if(number > sec && number!=max)
         {
             sec = number;
         }
     }
     System.out.println("Sec Larg : "+sec);
     sc.close();
 }
}