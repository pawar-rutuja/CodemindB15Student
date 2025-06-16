package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement accept = driver
				.findElement(By.xpath("//button[@class='nav-link' and normalize-space(text())='Accept']"));
		accept.click();
		WebElement source = driver.findElement(By.cssSelector("#div2"));
		WebElement destination = driver.findElement(By.cssSelector("#div1"));

		action.clickAndHold(source).moveToElement(destination).pause(Duration.ofSeconds(4)).release().build().perform();

	}

}
