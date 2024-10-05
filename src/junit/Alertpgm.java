package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///D:/New%20folder%20(2)/alert.html");
		
		
	}
	@Test
	public void Test()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dfg");
		driver.findElement(By.xpath("//input[@type='button']")).click();
	}
	
	}
	


