package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadsendkeys {
	ChromeDriver driver; 
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test() 
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\vivek\\OneDrive\\Pictures\\Screenshots\\Screenshot (1).png");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
	

}
