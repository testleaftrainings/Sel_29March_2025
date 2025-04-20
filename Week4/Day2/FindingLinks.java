package week4.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinks {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.facebook.com/");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Get the total number of link
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //To count the number of links
		int numberOfLinks = allLinks.size();
		System.out.println("The number of links is :"+numberOfLinks);
		
		//Print the links
		List<String> allStrings=new ArrayList<String>();
		
		for (int i = 0; i < numberOfLinks ; i++) {
			String text = allLinks.get(i).getText();
			allStrings.add(text);
			}
		System.out.println("The links are: "+allStrings);
	}

}
