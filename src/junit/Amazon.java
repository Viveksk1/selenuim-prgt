package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	public void Amazonpgm()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='javascript: void(0)']")).click();
		
	}
	@After
	public void close()
	{
		driver.close();
		
	}

}
