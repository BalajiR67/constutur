package com.task;

public class ConsturtorTask3 {
	
public  ConsturtorTask3() {
		
		
		System.out.println("        Student Details");
		
	}
		
    public  ConsturtorTask3(String name) {
    super();
		System.out.println("Student Name is:"+name);
    }
    
    
    public ConsturtorTask3 (int empId) {
  
    	System.out.println("Student Id is:"+empId);
		
	}
    
    
    public ConsturtorTask3(char gender) {
   
    	System.out.println("Gender is:"+ gender);
    
    }
    
    public ConsturtorTask3(String dept,int year) {
   
    	System.out.println("Student Dept is:"+dept+"\n"+"Year is:"+year);
    }
    
    public ConsturtorTask3(float fees) {
   
    	System.out.println("Student fees is:"+fees);
		
	}
    

}
