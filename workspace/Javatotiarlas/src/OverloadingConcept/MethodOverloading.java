package OverloadingConcept;

public class MethodOverloading {
     
      public void Add(int a ,int b){
    	  System.out.println(a+b);
      }
    		  
    		  public void Add(Double a ,Double b){
    			  System.out.println(a+b);
    		  }
    		  
    		  public void Add(int a,int b,int c){
    			  System.out.println(a+b+c);
    		  }
    		  public void Add(int a ,int b,int c,int d){
    			  System.out.println(a+b+c+d);
    		  }
    		  
    		  public void Add(char a,char b){
    			  System.out.println(a+b);
    			  System.out.println("characters are: "+a+b);
    			  
    			  
    		  }
    	
    			   
    		   
    		  
    		  
    		  public static void main(String[] args){
    			  MethodOverloading obj = new MethodOverloading();
    			  obj.Add(5,6);
    			  obj.Add(5,3);
    			  obj.Add(7,5,2);
    			  obj.Add('m','n');
    			  obj.Add(4,5,2,7);
    			  
    			  
    		  
    			  
    		  
    		  
    		  }
    	  }
	
      
	

    
