package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementEx {

	public static void main(String[] args) {
		
		WebDriver WD = new ChromeDriver();
		
		WD.get("https://omayo.blogspot.com");
		WD.manage().window().maximize();
		WebElement textf=WD.findElement(By.cssSelector("textarea#ta1"));
		
		textf.click();
	    textf.sendKeys("Congratulations All");
		String dp=textf.getDomProperty("rows");
		System.out.println(dp);
		
		String colm=textf.getAttribute("cols");
		System.out.println(colm);
		
		String pd=textf.getCssValue("border-color");
		System.out.println(pd);
		
		
		

	}

}
