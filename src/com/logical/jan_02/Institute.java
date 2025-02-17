package com.logical.jan_02;

import java.util.Arrays;
import java.util.Vector;
import java.util.function.Predicate;

public class Institute 
{
	private Student[] students;	// Student type array
	private int capacity;		// Initial capacity for array 
	private int size;			// size of array [ how many elements ]
	
	// getter for Capacity
	public int getCapacity() {
		return capacity;
	}
	// getter for Size
	public int getSize() {
		return size;
	}

	// Constructor for initialization
	public Institute(int capacity) 
	{
		super();
		this.capacity = capacity;
		
		// Assign new array with user defined capacity
		this.students = new Student[capacity];
	}
	
	 // To make array dinimically groable
	 public void grow() 
	 {
	       int newCapacity = capacity*2;
	       
	        Student[] newArray = Arrays.copyOf(students, newCapacity);
	       students = newArray;
	       capacity = newCapacity;
	   }
	
	// Add's student object in array
	 public void add(Student obj) 
	 {
	       if (size == capacity) 
	           grow();
	       students[size++] = obj;
	   }
	
	// Add student at specific index
	public void addToIndex(int index, Student obj)
	{
		if(index<0 || index>capacity || index>size)
			System.err.println("Invalid Index!");
		if(index==size)
			students[size++] = obj;
		else {
			for(int i=size; i>index; i--)
			{
				students[i] = students[i-1];
				
			}
			students[index] = obj;
			size++;
		}
	}
	
	// Get student by index
	public Student getByIndex(int index)
	{
		if(index<0 || index>capacity || index>size)
			System.err.println("Invalid Index!");
		
		return students[index];
	}
	
	
	// Remove Student object by index
	public void removeByIndex(int index)
	{
		if(index<0 || index>capacity || index>size)
			System.err.println("Invalid Index!");
		if(index==size)
			students[size--] = null;
		else {
			for(int i=index; i<size-1; i++)
			{
				students[i] = students[i+1];
				size--;
			}
			students[index] = null;
			
		}
	}
	
	   // Remove Student by gender
		public void removeByGender(String gender) 
		{
			for (int i = 0; i < size; i++) 
			{
				if (students[i] != null && students[i].getGender().equalsIgnoreCase(gender)) 
				{
					for (int j = i; j < size - 1; j++) 
					{
						students[j] = students[j + 1];
					}
					i--; 
					size--;
					students[size] = null;
	            }
	       }
	   }

	   
	   // Replace Student by index
	   public void replaceStudentOnIndex(int index, Student st )
	   {
		   if(index<0 || index>capacity || index>size)
				System.err.println("Invalid Index!");
		   if(st==null)
			   System.err.println("Object refering to null");
		   
		   students[index] = st;
	   }
	 
	   // Group Studen by gender 
	   public Student[] groupByGender(String gender)
	   {
		   Student[] genderGroup = new Student[size];
		   int start=0;
		   for(int i=0; i<size; i++)
		   {
			   if(students[i]!=null && students[i].getGender().equalsIgnoreCase(gender))
				   genderGroup[start++] = students[i];
		   }
		   
		   return genderGroup;
	   }
	   
	   // Check student is present or not
	   public boolean isPresent(Student std)
	   {
		   boolean present = false;
	        for(int i = 0;i<size;i++) {
	            if(students[i]!=null && students[i].equals(std)) {
	               present = true;
	               break;
	            }
	        }
	        return present;
	   }
	   
	   
	// Clear all Students
	   public void clearAll()
	   {	   
		   students = new Student[capacity];
	        size = 0;
	   }
	   
	   // Checks weather the list is empty or not
	   public boolean isEmpty()
	   {
		   return size==0;
	   }
	   
	   // Trims the array to the size 
	   public void trimToSize()
	   {
		  if(size<capacity)
		  {
			  students = Arrays.copyOf(students, size);
			  capacity = size;
		  }
	   }
	   
	   
	   
	// Display all Students
	public void display()
	{
		if(size==0)
			System.out.println("[]");
		else
		for(Object o: students)
			if(o!=null)
				System.out.println(o);
	}
	
	
	// Remove student by marks
    public boolean removeIf(Predicate<Double> predicate) 
    {
       boolean found = false;
       for(int i = 0;i<size;i++) {
           if(predicate.test(students[i].getMarks())) {
        	   removeByIndex(i);
               found = true;
               i--;
           }
       }
       return found;
    }
}
	
	

