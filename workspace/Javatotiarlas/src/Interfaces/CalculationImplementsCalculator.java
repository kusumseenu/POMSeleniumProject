package Interfaces;

public class CalculationImplementsCalculator {
 
	public void AdditionNumbers(int one, int two){
		System.out.println(one+two);
	}
	
	public void SubtractionNumbers(int one, int two){
		System.out.println(one-two);
	}
	
  public void DivisionNumbers(int one,int two){
	  System.out.println(one/two);
  }
  
  public static void main(String[] args){
	  CalculationImplementsCalculator obj = new  CalculationImplementsCalculator();
	  obj.AdditionNumbers(2,6);
	  obj.SubtractionNumbers(9,7);
	  obj.DivisionNumbers(8,4);
	  
  }
}  
