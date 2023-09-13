package Loops;

public class NestedForLoop {

	 public void NestedForloop(){
		 for(int i=0; i<9; i++)
			 System.out.println("value of i is:"+i);
		 
    		 
		 {
    		 for(int k=0; k<9; k++)
    			 System.out.println("value of k is:"+k);
    	 }
    
	 }
	
    public static void main(String[] args){
    	NestedForLoop	 obj = new NestedForLoop();
    	//obj.NestedForloop();
    	obj.NestedForloop();
    	
    	
    }
}
