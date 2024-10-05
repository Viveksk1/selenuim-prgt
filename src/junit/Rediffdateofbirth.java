package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdateofbirth {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details/");
	}
	@Test
	public void test()
	{
		WebElement dayelement=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select day=new Select(dayelement);
		day.deselectByValue("03");
		
		WebElement Monthelement=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select Month=new Select(Monthelement);
		Month.deselectByValue("09");
		
		
	}
}
