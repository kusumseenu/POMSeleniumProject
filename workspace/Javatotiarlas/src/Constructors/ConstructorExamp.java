package Constructors;

public class ConstructorExamp {

	 public  ConstructorExamp(){
		 
	 }
	 
	 public ConstructorExamp(int a){
		 System.out.println("1");
	 }
	 public ConstructorExamp(char a ){
		 System.out.println(a);
		 
	 }
	 
	 public ConstructorExamp(String a){
		 System.out.println("abc");
	 }
	 public static void main(String[] args){
		
		 ConstructorExamp obj = new ConstructorExamp(1);
		 ConstructorExamp obj1 = new ConstructorExamp('a');
		 ConstructorExamp obj2 = new ConstructorExamp("b");
		 
		 
		 
	 }
		 
}