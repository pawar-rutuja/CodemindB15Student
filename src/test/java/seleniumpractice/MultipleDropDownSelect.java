package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownSelect {

	public static void main(String[] args) {
		
		WebDriver webdriver = new ChromeDriver();

		webdriver.get("https://omayo.blogspot.com");
		webdriver.manage().window().maximize();

		WebElement MultipleDrop =webdriver.findElement(By.cssSelector("select#multiselect1"));

		Select MultiD = new Select(MultipleDrop);
		
		List<WebElement> MD=MultiD.getOptions();
		for(WebElement WebM:MD)
		{
			System.out.println();
		}
		
		List<WebElement> Md=MultiD.getAllSelectedOptions();
		for(WebElement Mu:Md)
		{
			System.out.println(Mu.getText());
		}
		
		

	}

}
