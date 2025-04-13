package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateNewAccountFB {

	public static void main(String[] args) {
		// Launch the browser
				EdgeDriver driver = new EdgeDriver();
				
				// Load the url
				driver.get("https://www.facebook.com/");
				
				// Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				WebElement forgetPassword = driver.findElement(By.linkText("Forgotten password?"));

				String text = forgetPassword.getText();
				System.out.println(text);
	}

}
