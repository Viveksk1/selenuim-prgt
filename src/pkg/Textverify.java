package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverify {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://openai.com/chatgpt/");
		String s=driver.getPageSource();
		String text="munna";
		if(s.contains(text))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.close();
	}

}
