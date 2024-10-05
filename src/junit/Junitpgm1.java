package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm1 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
	
	@Test
	public void TitleVerification()
	{
	
	String actual= driver.getTitle();
	String expected="oogle";
	if(actual.equals(expected))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}
	@Test
	public void TextVerification()
	{
		String s=driver.getPageSource();
		String text="musin";
		if(s.contains(text))
		{
			System.out.println("pass");
		}
		else
		{
			
			System.out.println("fail");
		}
	}

	
	@After
	public void exit()
	{
		driver.close();
	}
	}



