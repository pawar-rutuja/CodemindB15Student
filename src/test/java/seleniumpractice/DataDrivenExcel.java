package seleniumpractice;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Utilities;

public class DataDrivenExcel {

	public static void main(String[] args) {
	
		WebDriver wd = new ChromeDriver();
		wd.get(Utilities.readProperty("newtoursURL"));
		wd.manage().window().maximize();

	   Map<Integer,List<Object>>userdetails=Utilities.readExcel("Details");
	   List<Object>rowData=userdetails.get(1);
	   
	   wd.findElement(By.xpath("//input[@name='firstName']")).sendKeys(String.valueOf(rowData.get(0)));
	   wd.findElement(By.xpath("//input[@name='lastName']")).sendKeys(String.valueOf(rowData.get(1)));
	   wd.findElement(By.xpath("//input[@name='phone']")).sendKeys(String.valueOf(rowData.get(2)));
	   wd.findElement(By.xpath("//input[@name='userName']")).sendKeys(String.valueOf(rowData.get(3)));
	   wd.findElement(By.xpath("//input[@name='address1']")).sendKeys(String.valueOf(rowData.get(4)));
	   wd.findElement(By.xpath("//input[@name='city']")).sendKeys(String.valueOf(rowData.get(5)));
	   wd.findElement(By.xpath("//input[@name='state']")).sendKeys(String.valueOf(rowData.get(6)));
	   wd.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(String.valueOf(rowData.get(7)));
	   wd.findElement(By.xpath("//select[@name='country']")).sendKeys(String.valueOf(rowData.get(8)));
	   

	}

}
