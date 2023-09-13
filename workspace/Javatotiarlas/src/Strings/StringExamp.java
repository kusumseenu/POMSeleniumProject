package Strings;

public class StringExamp {

	   public void StringFunction(){
		   String str = "Software develovement life cycle";
		   
		   char charAt = str.charAt(10);
		   System.out.println("10");
		   int compareTo = str.compareTo("abc");
		   System.out.println("abc");
		   String newstartTo = str.concat("seenu");
		   System.out.println("seenu");
		   boolean contains = str.contains("life");
		   System.out.println("life");
		   boolean contentequal = str.contentEquals("abcccn");
		   System.out.println("abcccn");
		   boolean EqualIgnoreCase = str.equalsIgnoreCase("kusum");
	       System.out.println("Software develovement life cycle");
		   boolean endsWith = str.endsWith("cycle");
		   System.out.println("cycle");
	   }
	   
	   public static void main(String [] args){
		    StringExamp obj = new StringExamp();
		   obj.StringFunction();
	}

 }


