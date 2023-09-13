package operators;

 public class RelationalOperators {
	 
	 public void IsValueLessThen (int value){
		 
		 if (value < 5){
			 System.out.println("Value is less then");
			 
		 }
		 else
		 {
			 System.out.println("Value is not less then");
			 
		 }
	 }
 
 
	 public void IsValueGreaterThen(int value){
		 if (value > 5){
			 System.out.println("Value is greater then");
			 
		 }
		 else
		 {
			 System.out.println("Value is not greater then");
			 
		 }
			 
		 }
	   public void IsValueLessThenEqualTo(int value){
		   if (value <= 5){
			   System.out.println("value is less then equal to");
			   
		   }
		   else
		   {
			   
			   System.out.println("Value is not less then equal to");
		   }
	   
	   
	 }
	   public void IsValueGreaterThenEqualTo(int value){
		   if (value >= 5){
			   System.out.println("Value is greater then equal to");
			   
		   }
		   else
		   {
			   System.out.println("value is not greater then equal to");
			   
		   }
	   }
		 public void IsValueEqual(int value){
			 if (value == 5){
				 System.out.println("value is equal");
				 
				 
			 }
			 else
			 {
				 System.out.println("value is not equal");
				 
			 }
		 }
 
  public static void main(String[] args){
	  RelationalOperators obj =new RelationalOperators();
	  obj.IsValueLessThen(1);
		/*obj.IsValueLessThan(3);
		obj.IsValueLessThan(5);
		obj.IsValueLessThanEqualTo(5);
		obj.IsValueGreaterThan(6);
		obj.IsValueGreaterThan(5);
		obj.IsValueEqual(5);
		obj.IsValueEqual(4);*/

  }
 }
		 
	 
 
		 
	 
	 
	
	


	


