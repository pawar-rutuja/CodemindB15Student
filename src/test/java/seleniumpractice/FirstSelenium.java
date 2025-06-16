package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com");
		wd.manage().window().maximize();

		wd.get("https://www.flipkart.com");
		String s = wd.getCurrentUrl();
        System.out.println("Current URL : " + s);
        
		String t = wd.getTitle();
        System.out.println("Title of the Page : " + t);

		System.out.println("*********************************");

		// String p=wd.getPageSource();
		// System.out.println("Source code of the page : " + p);

		wd.close();
		wd.quit();
	

	}

}
