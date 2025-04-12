package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		//String Literal
		String str1="TestLeaf";
	    String str3="TestLeaf";
		
		//String Instantiation
		String str2=new String("TestLeaf");
		String str4=new String("TestLeaf");
		
		//==      - Compare the reference address of the 2 Strings
	    //.equal  - Compare the Exact value of 2 Strings
		
		System.out.println(str1==str3);   //001==001
		System.out.println(str1==str2);
		System.out.println(str2==str4);
		
		System.out.println("---------------");
		
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str3));
		
		//Length
		String batchName="March 2025";
		int lengthOfString = batchName.length();
		System.out.println("Length of String is: "+lengthOfString);
		
		//Contains - Partial value
		System.out.println(batchName.contains("Mar"));
		
		//toUpperCase - Convert the aplhabets of a String to uppercase
		//March 2025  - MARCH 2025
		String upperCase = batchName.toUpperCase();
		System.out.println(upperCase);
		
		//toLowerCase - Convert the aplhabets of a String to lowercase
		
		//charAt - To retrieve a particular Character at the particular index
		//           01234567
		String name="Selenium";
		char charAtIndex2 = name.charAt(2);
		System.out.println(charAtIndex2);
		
		//toCharArray - To convert the String into Character Array
		char[] charArray = name.toCharArray();
		// char[] charArray = {'S','e','l','e','n','i','u','m'};
		System.out.println(charArray[5]);
		
		
		//subString - Convert a String into another String to shorter
	             //   01234567
		String batch="Selenium";
	     
	     String substring = batch.substring(3);
	     System.out.println(batch);
	     System.out.println(substring);
	     
	     String substring2 = batch.substring(3, 5);
	     System.out.println(substring2);
	     
	     
	     //split - Convert 1 String into multiple Strings
	     String batches="Mar April 2025";
	     String[] split = batches.split(" ");
	    //                 0       1       2
	    //String[] split={"Mar","April","2025"}
	    System.out.println(split[1]);
	    
	    int rupee=100000;
	    System.out.println(rupee+5000);
	    String amount="100000";
	    System.out.println(amount+5000);
	    
	    
	    //replaceAll
	    String balance="Less Than 50000$";   //50000
	    String replaceAll = balance.replaceAll("[^0-9]", "");
	    System.out.println(replaceAll);
	    
	    //String into int
	    int parseInt = Integer.parseInt(replaceAll);
	    System.out.println(parseInt+89);
	    
	 }

}
