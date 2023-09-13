package Abstraction;

public class ChildClassExtendsParentClass {

    public void Add(int a, int b){
    	System.out.println(a+b+8);
    	
    }
    
    public void Add(char a){
    	System.out.println('a');
    	
    	
    }
    
    public void Add(String abc){
    	System.out.println("my name is seenu");
    	
    }
    public static void main(String[] args){
    	ChildClassExtendsParentClass obj =new ChildClassExtendsParentClass();
    	obj.Add(6,8);
    	obj.Add(8,7);
    	obj.Add('a');
    	obj.Add("my name is seenu");
    	
    	
    	

	}

}
