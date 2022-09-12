package com.task;

public class ConstructorTask2 {
	
	
	public  ConstructorTask2() {
		
		
		System.out.println("        Student Details");
		
	}
		
    public  ConstructorTask2(String name) {
    this();
		System.out.println("Student Name is:"+name);
    }
    
    
    public ConstructorTask2 (int empId) {
    	this("Balaji");
    	System.out.println("Student Id is:"+empId);
		
	}
    
    
    public ConstructorTask2(char gender) {
    	this(111899);
    	System.out.println("Gender is:"+ gender);
    
    }
    
    public ConstructorTask2(String dept,int year) {
    	this('M');
    	System.out.println("Student Dept is:"+dept+"\n"+"Year is:"+year);
    }
    
    public ConstructorTask2(float fees) {
    	this("ECE",2015);
    	System.out.println("Student fees is:"+fees);
		
	}
    

		}
		
	


