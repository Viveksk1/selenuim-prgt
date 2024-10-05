package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemopgm {

	public static void main(String[] args) {
		ChromeDriver c=new ChromeDriver(); //
		c.get("https://google.com");//redirects to browser
		
		String actualtitle= c.getTitle();
		String exptitle="Google";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	c.close();//current  tab close
		
		
//		c.quit();//entire browser quit
//		
//		c.getTitle();
	}

}
