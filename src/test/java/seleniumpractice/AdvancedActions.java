package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedActions {

	public static void main(String[] args) {
		WebDriver wbe = new ChromeDriver();

		wbe.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		wbe.manage().window().maximize();
		
		WebElement link=wbe.findElement(By.cssSelector("#draggable"));
		WebElement text = wbe.findElement(By.cssSelector("#droppable"));
		
        Actions action=new Actions(wbe);
        action.clickAndHold(link).moveToElement(text).pause(Duration.ofSeconds(2)).release().build().perform();
		
 
	}

}
