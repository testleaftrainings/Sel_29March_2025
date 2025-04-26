package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMousehover {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://www.pvrcinemas.com/");
				
				//Maximize the Browser
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Step1: Create Object for Actions Class
				Actions mouseHover=new Actions(driver);
				
				//Step2: Finding the element
				WebElement moreElement = driver.findElement(By.xpath("//span[text()='More']"));

				//Step3: Use the method - moveToElement
				mouseHover.moveToElement(moreElement).perform();
				
	}

}
