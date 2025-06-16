package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingEx {

	public static void main(String[] args) {

		WebDriver webdriver = new ChromeDriver();

		webdriver.get("https://omayo.blogspot.com");
		webdriver.manage().window().maximize();

		// webdriver.switchTo().frame(0);
		// webdriver.switchTo().frame("navbar-iframe");
		webdriver.switchTo().frame(webdriver.findElement(By.xpath("//iframe[@id='navbar-iframe']")));
		webdriver.findElement(By.xpath("//input[@name='q' and not(@title)]")).click();
		
		

	}

}
