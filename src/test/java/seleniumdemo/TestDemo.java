package seleniumdemo;

import java.io.Closeable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo
{
	public static void main(String[] args )
	{
		//1. Lanuch browser - chrome
//		ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver(); //Up Casting
		driver.get("https://demo.opencart.com/"); //get method
		
		//Get Title and store it in variable
		String act_title=driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed...");
		}
		else
		{
			System.out.println("Test Failed...");
		}
		
		//Close browser
		driver.close();
		
		
	}

}
