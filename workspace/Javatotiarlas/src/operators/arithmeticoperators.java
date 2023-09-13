package operators;

public class arithmeticoperators {

  public void AdditionTwoNumbers(int first , int second){
	  int addition = first + second;
	  System.out.println("Addtion of two numbers:" +addition);
  }
  
  public void SutractTwoNumbers(int first , int second){
	  int sutract = first - second;
	  System.out.println("Sutract of two numbers:" +sutract);
  }
  
  public void MultiplicationTwoNumbers(int first , int second){
	  int multiplication = first * second;
	  System.out.println("Multiplication of two numbers:" +multiplication);
  }
  public void DivisionTwoNumbers(int first , int second){
	  int division = first/second;
	  System.out.println("Division of two numbers:" +division);
  }
  public void ModulusTwoNumbers(int first,int second){
	  int modulus = first%second;
	  System.out.println("Modulus Two numbers:" +modulus);
  }
	  
	  public static void main(String[] args){
		  arithmeticoperators obj = new arithmeticoperators();
		  obj.AdditionTwoNumbers(5,4);
		  obj.SutractTwoNumbers(6,4);
		  obj.MultiplicationTwoNumbers(9,5);
		  obj.DivisionTwoNumbers(8,6);
		  obj.ModulusTwoNumbers(7,3);
		  
		  
	  }
	  
}	  