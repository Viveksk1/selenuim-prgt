package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
	ChromeDriver driver;
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void Facebook()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("viveksreekumarul@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qdefwdfw");
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}
	@After
	public void close()
	{
		driver.close();
		
	}
	

}
