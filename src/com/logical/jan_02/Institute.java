package com.logical.jan_02;

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
	
	// Add's student object in array
	public void add(Student obj)
	{
		if(size<capacity)
			students[size++] = obj;
		else
			System.err.println("List is full");
		
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
					students[size - 1] = null;
					size--;
					i--; 
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
		   for(int i=0; i<size; i++)
		   {
			   
			   if(students[i]!=null && students[i].equals(std))
				   return true;
		   }
		   return false;
	   }
	   
	   
	// Clear all Students
	   public void clearAll()
	   {
		   for(int i=0; i<size; i++)
		   {
			   students[i] = null;
		   }
		   size = 0;
	   }
	   
	   
	// Display all Students
	public void display()
	{
		for(Object o: students)
			if(o!=null)
				System.out.println(o);
	}
	
	
	
}
