package week8.day2;

public class LearnThrowKeyword {

	public static void main(String[] args) {
		int age=-18;
		if(age>=18) {
			System.out.println("eligible for voting");
		}
		else {
			System.out.println("Not eligible");
		}
		
		if(age<=0) {
			throw new ArithmeticException("Age is negative");
		}

	}
	
	
	
	

}
