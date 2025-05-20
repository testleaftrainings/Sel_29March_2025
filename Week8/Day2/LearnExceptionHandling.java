package week8.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		
		int number=7;
		
		
		try {
			System.out.println(number/0);
		}
		catch(ArithmeticException exp) {
			//System.out.println("The exception is: "+exp);
		}
		
		try {
			int[] arr=new int[-3];
			System.out.println(arr[3]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Code executed");

	}

}
