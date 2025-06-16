/**
 * 
 */
package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class is use to verify Home page functionality.
 */
public class TestNGFirst {
	WebDriver webdriver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		webdriver = new ChromeDriver();
  }

	@Test
	public void verifyHomepage() {

		webdriver.get("https://omayo.blogspot.com/");
		String title = webdriver.getTitle();

		Assert.assertEquals(title, "omayo (QAFox.com)", "Title Mismatched");
	}

	@Test
	public void verifyUrl() {
		WebDriverManager.chromedriver().setup();
		webdriver = new ChromeDriver();
		webdriver.get("https://omayo.blogspot.com/");
		String Url = webdriver.getCurrentUrl();

		Assert.assertEquals(Url, "https://omayo.blogspot.com/", "URL Mismatched");
	}

	@AfterMethod

	public void teardown() {
		webdriver.quit();
	}

}
