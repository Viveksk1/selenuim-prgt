package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooktestng {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Parameters({"email","pass"})
	@Test
	public void test(String email,String pass)
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		driver.findElement(By.name("login")).click();

}
}
