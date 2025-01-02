package com.logical.jan_02;

public class Institute 
{
	private Student[] students;
	private int capacity;
	private int size;
	
	public int getCapacity() {
		return capacity;
	}

	public int getSize() {
		return size;
	}

	public Institute(int capacity) 
	{
		super();
		this.capacity = capacity;
		this.students = new Student[capacity];
	}
	
	public void add(Student obj)
	{
		if(size<capacity)
			students[size++] = obj;
		else
			System.err.println("List is full");
		
	}
	
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
	
	public Student getByIndex(int index)
	{
		if(index<0 || index>capacity || index>size)
			System.err.println("Invalid Index!");
		
		return students[index];
	}
	
	
	
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
	
	 
	   public void removeByGender(String gender)
	   {
		   String g = gender;
		   
		   for(int i=0; i<size; i++)
		   {
			   
			   if(students[i].getGender().equalsIgnoreCase(gender))
			   for(int j=i; j<size-1; j++)
			   {
				   students[j] = students[j+1];
				   
			   }
			   students[size-1]=null;
			   size--;
			   i--;
		   }
	   }
	   
	   public void replaceStudentOnIndex(int index, Student st )
	   {
		   if(index<0 || index>capacity || index>size)
				System.err.println("Invalid Index!");
		   if(st==null)
			   System.err.println("Object refering to null");
		   
		   students[index] = st;
	   }
	 
	   
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
	   // 8. check the give student is present or not[contains(Student obj)]
	   
	   // 9. clear all the student list [clear()]
	   
	   // 10. Display the list of student
	
	public void display()
	{
		for(Object o: students)
			if(o!=null)
				System.out.println(o);
	}
	
	
	
}
