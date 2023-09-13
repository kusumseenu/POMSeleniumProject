package Exception;

public class ThrowExcap {
 static void fun()
 {
	 try
	 {
		 throw new NullPointerException("software");
	 }
	 catch (NullPointerException e)
	 {
		 System.out.println("catch NullPointerException");
		 throw e; // rethrowing the  NullPointerException
	 }
 }
 
   public static void main(String[] args)
   {
	   try
	   {
		   fun();
	   }
	   catch (NullPointerException e)
	   {
		   System.out.println("catch in main.");
	   }
	   
	   
	   
	   
   }
}
