package junit;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkdisplay {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void Display()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("link="+li.size());
		
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verifylink(link);
			//String linktext=ele.getText();
			//System.out.println(link+"-------------"+linktext);
		}
		
	
	}
	private void verifylink(String link) {
		try
		{
			URI ob=new URI(link);
			HttpURLConnection c=(HttpURLConnection)ob.toURL().openConnection();
			if(c.getResponseCode()==200)
			{
				System.out.println("succesful responce code is 200-----"+link);
			}
			else if(c.getResponseCode()==404)
			{
				System.out.println("broken link responce code is 404------"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	

}
