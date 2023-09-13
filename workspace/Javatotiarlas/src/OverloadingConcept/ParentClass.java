package OverloadingConcept;

public class ParentClass {

	public void Add(int a,int b){
		System.out.println(a+b);
		

	}
 public static void main(String[] args){
	 ParentClass obj = new ParentClass();
	 obj.Add(10,5);
 }
}
