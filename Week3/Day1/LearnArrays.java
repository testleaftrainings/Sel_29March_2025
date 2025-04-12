package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		//Array Declaration - Using Literal
		//To store 5 marks of a student
		
		//index        0  1  2  3   4
		int[] marks= {76,87,56,100,98};
		
		//To find the length
		int lengthOfArray = marks.length;
		System.out.println("The length is: "+lengthOfArray);
		
		//To retrieve a particular data - Use Index
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		System.out.println("-------------");
		
		//To retrieve a entire data
		//           0  1   2   3   4   5
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			//System.out.println(marks[0]) - 76
			//System.out.println(marks[1]) - 87
	        //System.out.println(marks[2]) - 56
			//System.out.println(marks[3]) - 100
			//System.out.println(marks[4]) -98
		  }
		
		//To find the lowest value
		//To sort the array
		Arrays.sort(marks);
		//{56,76,87,98,100}
		
		//To print the lowest value
		System.out.println("Lowest value is: "+marks[0]);
		
		//To print the highest value
		System.out.println(marks[marks.length-1]);
		
		//Array Instantiation
		//To store 3 Data of scores
		int[] scores=new int[3];   
		scores[0]=80;
		scores[1]=100;
		scores[2]=75;
	}
}