package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffmailcheck {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void test()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo not presnet");
		}
	}
	@Test
	public void radiobutton()
	{
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean r=radio.isSelected();
		if(r)
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
	}
	@Test
	
	public void checkbox()
	{
		WebElement check=driver.findElement((By.xpath("//*[@id=\"altid_msg\"]/font")));
		boolean c=check.isEnabled();
		if(c)
		{
			System.out.println("checked");
		}
		else
		{
			System.out.println("not checked");
		}
	}

}
