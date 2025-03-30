package week1.day2;

public class LearnContinue {
//Continue Skips the current iteration and execute the remaining iteration
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}

	}

}
