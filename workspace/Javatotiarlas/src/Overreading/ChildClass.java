package Overreading;

import Abstraction.ParentClass;

public class ChildClass extends ParentClass{
	
   public void Add(int a, int b){
	  System.out.println(a+b+9);
	  
   }
   
   public static void main(String[] args){
	   
	   ChildClass obj = new ChildClass();
	   obj.Add(5,6);
	   
	   ParentClass obj1 = new ParentClass();
	    obj.Add(6,7);

   }
   
}	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	   
	   
	   

	
	
	
	
	
	

	    


