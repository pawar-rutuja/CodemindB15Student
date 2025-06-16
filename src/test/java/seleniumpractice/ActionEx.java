package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEx {

	public static void main(String[] args) {
		WebDriver webdriver = new ChromeDriver();

		webdriver.get("https://omayo.blogspot.com");
		webdriver.manage().window().maximize();

		WebElement textf = webdriver.findElement(By.xpath("//textarea[@cols='30']"));
		// textf.click();

	Actions action = new Actions(webdriver);
	action.click(textf);
  action.keyDown(Keys.CONTROL).keyDown("A").keyDown(Keys.CONTROL).keyDown("C").keyUp(Keys.CONTROL).keyUp("A")
		.keyUp(Keys.CONTROL).keyUp("C").build().perform();
		
	WebElement textf2 = webdriver.findElement(By.xpath("//textarea[@id='ta1']"));
	action.click(textf2);
	action.moveToElement(textf2).build().perform();
	action.keyDown(Keys.CONTROL).keyDown("V").keyUp(Keys.CONTROL).keyUp("V").build().perform();
	}

}
