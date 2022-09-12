package com.task;




public class  ConstructorTask  <Constructor > {
	
	public ConstructorTask () {
		
		System.out.println("       Staff Details");
		
	}
	
    public ConstructorTask (String name) {
    	this();
     System.out.println("Staff Name is:"+name);
		
	}    	
    
   public ConstructorTask (String dept,int id) {
	   this("Vel");
	   System.out.println("Staff Dept is:"+dept+"\n"+"Staff Id is:"+id);
	
}
   
   public ConstructorTask (int salary) {
	   this("ECE",565464);
	   
	   System.out.println("Staff salary :"+salary);
	
}
   public ConstructorTask(long mobile) {
	   this(45000);
	   
	   System.out.println("Staff Num is:"+mobile);
   }
   
   public ConstructorTask(char gender) {
	   this(9546254838l);
	   System.out.println("Staff Gender:"+gender);
   }
   
   public ConstructorTask (float yearofsalary) {
	   this('M');
	   
	   System.out.println("Year of Salary"+yearofsalary);
	
}
   public static void main(String[] args) {
	
//	  ConstructorTask2 c=new ConstructorTask2(105000.528f);
	//  ConstructorTask c2=new ConstructorTask(142588.f);
} 
  
	

}
