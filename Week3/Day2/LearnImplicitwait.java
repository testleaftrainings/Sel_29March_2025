package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnImplicitwait {

	public static void main(String[] args) {
		
		
                // Launch the browser
				EdgeDriver driver = new EdgeDriver();
				
				// Load the url
				driver.get("https://omni.axisbank.co.in/axisretailbanking/");
				
				// Maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				//Click on Register here
				driver.findElement(By.id("APPREGI")).click();
				
		}

}
