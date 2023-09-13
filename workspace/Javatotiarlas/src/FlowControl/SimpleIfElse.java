package FlowControl;

public class SimpleIfElse  {


        public void IfStatement(int value) {
				if (value == 1) {

					System.out.println("Value is : " + value);
				}
				
			}

			public void IfElseStatement(int value) {
				if (value>5) {

					System.out.println("Value is grater then 5 : " + value);

				} else {
					System.out.println("Value is less then 5 : " + value);
				}

			}
			
			
			public static void main(String[] args){
				
				SimpleIfElse obj = new SimpleIfElse();
				//obj.IfStatement(2);
				obj.IfElseStatement(4);
				obj.IfElseStatement(12);
				
				

			}
		}
