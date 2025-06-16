package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HadleFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);	
	     driver.findElement(By.xpath("//iframe[@name='f614d2b78c1e52e10']"));
		
		

	}

}
