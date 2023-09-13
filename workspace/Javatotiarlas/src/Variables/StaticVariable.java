package Variables;

public class StaticVariable {
	
	int i =1;
	static int j =4;
	
	public void NormalGlobalVariable(){
		i++;
		System.out.println("value ofi;+i");
		
		
		
	}
	
	public void LocalVariable(){
		
		int k=5;
		k++;
		
		System.out.println("value of k;" +k);
		
	}
	
	public void staticVariable(){
		j++;
		
		System.out.println("value of j;"+j);
		
		
	}
	
		
		public static void main(String[] args){
			
			
			StaticVariable obj = new StaticVariable();
			StaticVariable obj1 = new StaticVariable();
			obj.NormalGlobalVariable();
			obj.LocalVariable();
			obj.staticVariable();
			obj1.NormalGlobalVariable();
			obj1.LocalVariable();
			obj1.staticVariable();
			
			
		}
		
}
		
	
