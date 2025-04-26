package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://jqueryui.com/droppable/");
				
				//Maximize the Browser
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				Actions act=new Actions(driver);
				
				driver.switchTo().frame(0);
				
				WebElement sourceEle = driver.findElement(By.id("draggable"));
				
				WebElement targetEle = driver.findElement(By.id("droppable"));
				
				act.dragAndDrop(sourceEle, targetEle).perform();

	}

}
