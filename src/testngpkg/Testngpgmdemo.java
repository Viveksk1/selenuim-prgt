package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpgmdemo {
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@Test(priority =4 ,enabled = false)
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority = 3,invocationCount = 3,groups = {"sanity"})
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(priority =2,dependsOnMethods  = {"test4"})
	public void test3()
	{
		System.out.println("test 3");
	}
	@Test(priority = 1,groups = {"smoke"})
	public void test4()
	{
		System.out.println("test 4");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
	}
	
	
}
