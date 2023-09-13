package Exception;

public class Exceptional {

	 public void Exceptional(){
		 int a=5;
		 int b=1;
		 try{
		 System.out.println(a/b);
		 }
		 catch(ArithmeticException e){
		        e.printStackTrace();
		       
		      }
		        catch(NumberFormatException  ex){
		        	ex.printStackTrace();
		        	
		        }
		        
		        finally{
		        	
		        	System.out.println("Reached in finally");
		        	
		        }
		      }
		public static void main(String[] args){
			Exceptional obj = new Exceptional();
			obj.Exceptional();
			
		}

	}
