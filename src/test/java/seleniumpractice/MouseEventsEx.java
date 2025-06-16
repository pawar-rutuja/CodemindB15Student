package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();

		wb.get("https://omayo.blogspot.com/"); 
		wb.manage().window().maximize();
		
		WebElement link=wb.findElement(By.cssSelector("a.feed-link"));
		WebElement text = wb.findElement(By.cssSelector("textarea#ta1"));
		
        Actions action=new Actions(wb);
        action.clickAndHold(link).moveToElement(text).pause(Duration.ofSeconds(2)).release().build().perform();
		
		
		
		

	}

}
