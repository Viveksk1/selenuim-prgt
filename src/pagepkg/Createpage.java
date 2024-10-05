package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Createpage {
	WebDriver driver;
	By fbcreatepage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By signupbutton=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");	
	public Createpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void createpageclick() 
	{
		driver.findElement(fbcreatepage).click();
	}
	public void textVerification()
	{
		String src=driver.getPageSource();
		if(src.contains("Create a page"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	public void signup()
	{
		driver.findElement(signupbutton).click();
	}
	

}
