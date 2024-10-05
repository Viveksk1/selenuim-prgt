package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogintest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.id("pass")).sendKeys("vivek");
		driver.findElement(By.id("email")).sendKeys("viveks");
		driver.findElement(By.name("login")).click();
		String expected="https://www.facebook.com";
		String actual=driver.getCurrentUrl();
		if(expected.equals(actual))
		{
			System.out.println("login sucess");
		}
		else
		{
			System.out.println("invalid login");
		}
	}
	
	

}
