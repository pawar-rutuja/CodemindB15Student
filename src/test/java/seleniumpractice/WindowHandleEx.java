package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {

	public static void main(String[] args) {
		
		WebDriver webdriver = new ChromeDriver();

		webdriver.get("https://omayo.blogspot.com");
		webdriver.manage().window().maximize();
		
		webdriver.findElement(By.xpath("//a[text()='SeleniumTutorial']")).click();
		String mainwindow=webdriver.getWindowHandle();
		
		Set<String> allwindow=webdriver.getWindowHandles();
		
		System.out.println(allwindow);
		


	}

}
