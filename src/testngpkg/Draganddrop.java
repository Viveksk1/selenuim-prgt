package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	}
	
	@Test
	public void test()
	{
		WebElement dragamount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement debitsideamount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement dragbank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement debitsideaccount=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement creditsideaccount=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement creditsideamount=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		
		
		
		Actions action=new Actions(driver);
		action.dragAndDrop(dragamount, debitsideamount);
		action.dragAndDrop(dragbank, debitsideaccount);
		action.dragAndDrop(sales,creditsideaccount);
		action.dragAndDrop(dragamount,creditsideamount);
		
		action.perform();
		
		WebElement perfect=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		boolean b=perfect.isDisplayed();
		if(b)
		{
			System.out.println("perfect is present");
		}
		else
		{
			System.out.println("perfect is not present");
		}
		
		
	}

}
