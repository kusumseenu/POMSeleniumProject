package FlowControl;

public class NestedIfStatement {

public void NestedIf(int value){
		
		
		if(value>10){
			System.out.println("Value is > 10 : "+ value);
			
		}
		else if(value<4){
			System.out.println("Value is < 4: "+ value);
			
		}
		else if(value!=6){
			System.out.println("Value is !=6 : "+ value);
			
		}
		else{
			System.out.println("Value is in else statement: "+ value);
		}
	}

	public static void main(String[] args ){
		NestedIfStatement obj = new NestedIfStatement();
		obj.NestedIf(5);
		obj.NestedIf(4);
		obj.NestedIf(8);
	
		
		
		
		
		
	}
}

	 
 


     
