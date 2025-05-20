package week8.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnInvocationCount {
	
	@Test(invocationCount = 3,threadPoolSize = 3)
	public void handlingAlert() {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/alert.xhtml");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//To click on the show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//Transfer the driver focus from webpage to alert box
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
		driver.close();

	}

}
