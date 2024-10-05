package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void datadriven() throws IOException
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\vivek\\OneDrive\\Documents\\exelautomation\\automationdemo.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String un=sh.getRow(i).getCell(0).getStringCellValue();
			String pass=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"----------"+pass);
			driver.findElement(By.name("email")).sendKeys(un);
			driver.findElement(By.name("pass")).sendKeys(pass);
			driver.findElement(By.name("login")).click();
			driver.navigate().refresh();
			
		}
	}

}
