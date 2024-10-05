package junit;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;

public class Responcecode {
	String link="https://www.facebook.com";
	@Test
	public void Test() throws Exception
	{
		URI ob=new URI(link);
		HttpURLConnection c=(HttpURLConnection)ob.toURL().openConnection();
		System.out.println(c.getResponseCode());
		
		
	}

}
