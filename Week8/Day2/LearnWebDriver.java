package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriver {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("https://leafground.com/waits.xhtml");
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Declare the wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1));
		
		//Click the button
		WebElement clickButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));		
		clickButton.click();
		
		//Check for visibilty
		WebElement iAmHereButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		//Thread.sleep(10000);
		//WebElement iAmHereButton = driver.findElement(By.xpath("//span[text()='I am here']"));
		
		boolean displayed = iAmHereButton.isDisplayed();
		System.out.println(displayed);
		
	}

}
