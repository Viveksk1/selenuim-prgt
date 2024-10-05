package junit;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbal {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store");
	}
	@Test
	public void titleverififcation()
	{
		String actual=driver.getTitle();
		String expected="Rishi Herbal India";
		if(actual.endsWith(expected))
		{
			System.out.println("same as expected title");
		}
		else
		{
			System.out.println("expected title incorrect");
		}
		
		
	}

	@Test
	public void Link()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("link="+li.size());
		if(li.size()==100)
		{
			System.out.println(" same as expected ");
		}
		else
		{
			System.out.println("expected is not same");
		}
		
		
		
		}
	@Test
	public void food()
	{
		String s=driver.getPageSource();
		String text="food";
		if(s.contains(text))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not found");
		}
	}
	@Test
	public void health()
	{
		driver.findElement(By.xpath("//a[@class='ls-nav-link']")).click();
	}
	 
	@After
	public void close()
	{
		driver.close();
	}
}
