package week8.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	


	@Test(priority=2)
	public void login() {
		System.out.println("login");

	}
	@Test(priority = 1)
	public void search() {
		System.out.println("Search");

	}
	@Test(priority=3, enabled=false)
	public void payment() {
		System.out.println("Payment");

	}
}
