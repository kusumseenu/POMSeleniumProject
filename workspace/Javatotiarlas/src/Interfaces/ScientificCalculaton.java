package Interfaces;

public class ScientificCalculaton {

	public void Addition(int one, int two){
		System.out.println(one+two);
			
		}

	public void Subtraction(int one, int two){
		System.out.println(one-two);
		
	}

	public void Division(int one, int two){
		System.out.println(one/two);
		
	}

	public static void main(String[] args){
		
		ScientificCalculaton obj = new ScientificCalculaton();
		obj.Addition(1, 2);
		obj.Subtraction(6,4);
		obj.Division(9,9);
		
		
	}

	}


