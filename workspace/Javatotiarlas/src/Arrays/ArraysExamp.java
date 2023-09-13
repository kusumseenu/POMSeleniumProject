package Arrays;

     public class ArraysExamp {

		
		private String[] intArray;

		public void ArrayEx(){
			int[] intArray = new int[]{4,5,7,2,4,7,9,6,5,1,3};
			for (int a=0; a<intArray.length;++a)
				System.out.println("Element at index:" + a + " : " +intArray[a]);
		}
		
		public void ArrayEx1(){
			char[] intArray = new char[]{'a','b','c','d'};
			for (int a=0; a<intArray.length;++a)
				System.out.println("Element at index:" +a+ ":" +intArray[a]);
			
			
		}
		
	public void ArrayEx2(){
		String[] intArray = new String[] {"abc","ght","tyu"};
		for (int a=0; a<intArray.length;++a)
			System.out.println("Element at index:" +a+ ":" +intArray[a]);
	}
	
	
		public static void main(String[] args){
			ArraysExamp  obj = new ArraysExamp();
			obj. ArrayEx();
			obj.ArrayEx1();
			obj.ArrayEx2();
			
				
			
		}
     }
			
			
			
		
	
	