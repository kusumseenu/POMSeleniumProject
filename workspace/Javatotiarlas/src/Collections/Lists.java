package Collections;

	import java.util.ArrayList;
	import java.util.List;
	
	public class Lists{
		
		public static void main(String[] args){
			List<String> ArrayList = new ArrayList <>();
		   
			ArrayList.add("name");
		
			ArrayList.add("class");
		
			ArrayList.add("hospital");
			
			
			for (int i=0; i<ArrayList.size(); i++)
			{
				System.out.println(ArrayList.get(i) +"");
			}
			
			List<Integer> ArrayList1 = new ArrayList<>();
			
			 ArrayList1.add(2);
			 ArrayList1.add(5);
			 
			 for (int i=0; i<ArrayList1.size(); i++)
			 {
				 System.out.println(ArrayList1.get(i) +"");
			 }
			
			 
			
			
		}
	}
	
	
	
	