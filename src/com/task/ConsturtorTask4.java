package com.task;

public class ConsturtorTask4 extends ConsturtorTask3 {

public  ConsturtorTask4() {
		
		
		System.out.println("        Student Details");
		
	}
		
    public   ConsturtorTask4(String name) {
    super();
   
		System.out.println("Student Name is:"+name);
    }
    
    
    public ConsturtorTask4 (int empId) {
  super("balaji");
    	System.out.println("Student Id is:"+empId);
		
	}
    
    
    public  ConsturtorTask4(char gender) {
 super(111899);
    	System.out.println("Gender is:"+ gender);
    
    }
    
    public ConsturtorTask4(String dept,int year) {
   super('M');
    	System.out.println("Student Dept is:"+dept+"\n"+"Year is:"+year);
    }
    
    public ConsturtorTask4(float fees) {
   super("ece",2015);
    	System.out.println("Student fees is:"+fees);
		
	}
    
    public static void main(String[] args) {
    	
  //	  ConsturtorTask4 c =new ConsturtorTask4(105000.528f);
	
	
}
}
