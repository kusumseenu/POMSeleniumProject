package OverloadingConcept;

public class ChildClassExtendsParentClass {

	public void add(int a,int b){
		System.out.println(a+b+6);
	}
	public static void main(String[] args){
		ChildClassExtendsParentClass obj = new ChildClassExtendsParentClass();
		obj.add(8,5);
		obj.add(2,1);
		
		

	}

}
