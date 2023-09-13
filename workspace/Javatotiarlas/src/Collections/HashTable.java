package Collections;


  import java.util.Hashtable;
  import java.util.Vector;
  
   public class HashTable {
	   
	   public static void main(String[] args){
		   
		   //createing instances of Array
		   //Hashtable and Vector
		   int arr[] = new int [] {12,45,31,21,14};
		   
		   Vector <Integer> v = new Vector();
		   Hashtable<Integer , String> hash = new Hashtable();
		   
		  // Adding the elemrnt into the Vector
		   
		   v.addElement(1);
		   v.addElement(5);
		   v.addElement(3);
		   
		   
		  // Adding the element into the Hashtable
		   
		   hash.put(1,"name");
		   hash.put(2,"subject");
		   
		   //Accessing the first element of the Array, Vector and Hashtable 
		   
		   System.out.println(arr[0]);
		   System.out.println(v.elementAt(0));
		   System.out.println(hash.get (1));
		   
		   
		   
		   
		   
	   }
	   
   }