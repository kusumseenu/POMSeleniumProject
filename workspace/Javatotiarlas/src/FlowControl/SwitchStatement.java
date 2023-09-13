package FlowControl;

public class SwitchStatement {

	public void SwitchStatementExample(String DayOfWeek){
		
		switch (DayOfWeek)
		
		{
			case "Monday":
				System.out.println("Day is : "+DayOfWeek);
		break;
			case "Tuesday":
				System.out.println("Day is : "+DayOfWeek);
		break;
			case "Wednesday":
				System.out.println("Day is : "+DayOfWeek);
		break;
			case "Thursday":
				System.out.println("Day is : "+DayOfWeek);
		break;
			case "Friday":
				System.out.println("Day is : "+DayOfWeek);
		break;
			case "Saturday":
				System.out.println("Day is : "+DayOfWeek);
		break;
			case "Sunday":
				System.out.println("Day is : "+DayOfWeek);
		break;
			default:
				System.out.println("Invalid day : "+DayOfWeek);	
		}
		
	}
	
	
	public void EvenOddNumber(int number){
		
		if(number%2==0)
		{
			System.out.println("Even Number");
		}
		else{
			
			System.out.println("Odd number");
		}
		
	}
	
	public static void main(String[] args){
		
		SwitchStatement obj = new SwitchStatement();
		obj.SwitchStatementExample("Wednesday");
		//obj.SwitchStatementExample("abc");
		//obj.EvenOddNumber(4);
		obj.EvenOddNumber(5);
	}
}	                  	                             		                  