package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		//Launch the browser - ChromeBrowser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL (get)
		driver.get("https://www.facebook.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
	}

}
