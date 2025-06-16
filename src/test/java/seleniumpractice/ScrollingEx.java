package seleniumpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wbe = new ChromeDriver();

		wbe.get("https://omayo.blogspot.com/");
		wbe.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) wbe;
		js.executeScript("window.scrollBy(0,1500);", "");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-1000);", "");

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(200,0);", "");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(-100,0);", "");
		wbe.navigate().refresh();

        js.executeScript("window.scrollBy(document.body.scrollWidth,document.body.scrollHeight)");

	}
}
