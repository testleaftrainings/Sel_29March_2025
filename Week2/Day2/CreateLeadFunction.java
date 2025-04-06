package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();
				// Load the url
				driver.get("http://leaftaps.com/opentaps");
				
				// Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				// Enter the username
				// Find the Element - findElement
				// Entering the text-sendKeys
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

				// Entering the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");

				// Clcik on the login button
				driver.findElement(By.className("decorativeSubmit")).click();

				//Click on CRMSFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on the Leads link
				driver.findElement(By.linkText("Leads")).click();
				
				//Click on the Create Lead
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter the companyname
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
	            //Enter the firstname
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
	
	            //Enter the lastname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
	
	
				//Handling dropdown
				//Step1: Find the Element
				WebElement sourceElement=driver.findElement(By.id("createLeadForm_dataSourceId"));
				
				//Step2: Create Object the select Class
				  Select dropdown=new Select(sourceElement);
				
				  //Step3: Use the method to Handle
				  //dropdown.selectByIndex(2);
				   //dropdown.selectByValue("LEAD_EMPLOYEE");
				  dropdown.selectByVisibleText("Public Relations");
				
				
				//Click on the Submit button
				  driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	
	}

}
