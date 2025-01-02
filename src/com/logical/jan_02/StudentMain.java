package com.logical.jan_02;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student(111, "Vikram", 89.0, "Java", "Male");
		Student s2 = new Student(112, "Harun", 90.7, "Java", "Male");
		Student s3 = new Student(113, "Pratap", 91.4, "Core Java", "Male");
		Student s4 = new Student(114, "Ananya Iyer", 88.9, "Physics", "Female");
		Student s5 = new Student(115, "Vikram Singh", 74.2, "History", "Male");
		Student s6 = new Student(116, "Kavya Nair", 90.1, "English Literature", "Female");
		Student s7 = new Student(117, "Rohan Verma", 81.5, "Mechanical Engineering", "Male");
		Student s8 = new Student(118, "Priya Menon", 87.7, "Philosophy", "Female");
		Student s9 = new Student(119, "Arjun Reddy", 79.6, "Civil Engineering", "Male");
		Student s10 = new Student(120, "Sneha Joshi", 93.2, "Economics", "Female");
		
		Institute i = new Institute(10);
		i.add(s1);
		i.add(s2);
		i.addToIndex(0, s3);
		i.add(s4);
		i.add(s5);
		i.add(s6);
		i.add(s7);
		i.add(s8);
		i.add(s9);
		i.add(s10);
		i.display();
		System.out.println("\nStudent at index 1");
		System.out.println(i.getByIndex(1));
		i.removeByIndex(0);
		System.out.println("\nAfter remove!");
		i.display();
		
		
		i.removeByGender("Female");
		System.out.println("After remove gender");
		i.display();
		
		System.out.println("Group by gender Male");
		for(Object o: i.groupByGender("Male"))
			if(o!=null)
			System.out.println(o);
		
		System.out.println("Capacity : "+i.getCapacity());
		System.out.println("Size : "+i.getSize());
	}

}
