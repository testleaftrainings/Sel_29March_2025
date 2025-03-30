package week1.day2;

public class LearnBreak {
	//Break - Breaks the loop and Comes out of loop

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			if(i==5) {
				break;
			}
			
			System.out.println(i);
		}
	}

}
