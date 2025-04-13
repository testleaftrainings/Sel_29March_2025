package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) {
		// Launch the browser
				EdgeDriver driver = new EdgeDriver();
				
				// Load the url
				driver.get("http://leaftaps.com/opentaps");
				
				// Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//To get title - getTitle
				String titleOfPage = driver.getTitle();
				
				System.out.println("Title of the page is: "+titleOfPage);
				
				//To get the url
				String currentUrl = driver.getCurrentUrl();
				System.out.println("Url is "+currentUrl);
				
				}

}
