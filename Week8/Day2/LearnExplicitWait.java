package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnExplicitWait {
	
	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("http://leaftaps.com/opentaps");
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		// Entering the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Clcik on the login button
		driver.findElement(By.className("decorativeSubmit")).click();

	}

}
