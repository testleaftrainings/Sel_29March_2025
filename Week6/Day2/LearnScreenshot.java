package week6.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				// Load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				driver.manage().window().maximize();
				
				//Additional step- findElement
				
				WebElement userTextField = driver.findElement(By.id("username"));
		
		        //Step1: Take the screenshot from source
				File source = userTextField.getScreenshotAs(OutputType.FILE);
				
				//Step2: Set the destination
				File destination=new File("./Snap/username.png");
				
				//Step3:Copy the source and paste it in the destination
			     FileUtils.copyFile(source, destination);

	}

}
