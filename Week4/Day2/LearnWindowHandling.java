package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		       //Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://leafground.com/window.xhtml");
				
				//Maximize the Browser
				driver.manage().window().maximize();
				
				//Click Open button
				driver.findElement(By.xpath("//span[text()='Open']")).click();
				
				//getWindowHandle
				String parentAddress = driver.getWindowHandle();
				//System.out.println("Parent address is: "+parentAddress);
			
				
				//getWindowHandles
				Set<String> allWindows = driver.getWindowHandles();
				//System.out.println("All windows address is: "+allWindows);
				
				
				//Convert Set into List
				List<String> allAddress=new ArrayList<String>(allWindows);
				System.out.println("The List is "+allAddress);
				
				String titleOfParent = driver.getTitle();
				System.out.println("Before switching: "+titleOfParent);
				
			    //transfer the driver focus
				driver.switchTo().window(allAddress.get(1));
				
				String titleOfChild = driver.getTitle();
				System.out.println("After switching: "+titleOfChild);
				
				//close the driver
				  driver.close();
				//To close all the opened window
				//driver.quit();
				  
				  driver.switchTo().window(allAddress.get(0));
				  
				  
				 String title = driver.getTitle();
				 System.out.println(title);
				  
				  
				
			}

}
