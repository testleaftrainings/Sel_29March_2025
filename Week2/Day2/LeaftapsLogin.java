package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps");
		// Maximize the browser
		driver.manage().window().maximize();

		// Enter the username
		// Find the Element - findElement
		// Entering the text-sendKeys
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Entering the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Clcik on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
	}

}
