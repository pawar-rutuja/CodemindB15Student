package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethodsEx {

	public static void main(String[] args) {
		
		WebDriver webd = new ChromeDriver();
		webd.get("https://www.flipkart.com");
		webd.manage().window().maximize();
		
		String s=webd.getCurrentUrl();
		System.out.println("Current URL : "+ s);
		
		String t=webd.getTitle();
		System.out.println("Title of page :" + t);
		
		
		
	
		
		

	}

}
