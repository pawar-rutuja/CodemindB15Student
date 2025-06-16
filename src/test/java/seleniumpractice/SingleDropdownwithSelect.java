package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdownwithSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver webD = new ChromeDriver();

		webD.get("https://omayo.blogspot.com");
		webD.manage().window().maximize();

		WebElement SingleD = webD.findElement(By.cssSelector("select#drop1"));

		Select SE = new Select(SingleD);

		WebElement FirstS = SE.getFirstSelectedOption();
		System.out.println("First Selected Option :" + FirstS.getText());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");

		List<WebElement> AllSelected = SE.getAllSelectedOptions();
		for (WebElement All : AllSelected) {
			System.out.println(All.getText());
		}

		System.out.println("********************");
		List<WebElement> GetOp = SE.getOptions();
		for (WebElement OP : GetOp) {
			System.out.println(OP.getText());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$");

		SE.selectByContainsVisibleText("News");
		Thread.sleep(2000);
		SE.selectByIndex(3);
		Thread.sleep(2000);
		SE.selectByValue("abc");
		Thread.sleep(2000);
		SE.selectByVisibleText("doc 2");

		System.out.println(SE.isMultiple());

	}

}
