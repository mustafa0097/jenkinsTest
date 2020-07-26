package FindingElements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class brokenLinks {
	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("https://the-internet.herokuapp.com/");


	}
	@Test
	private void TestLink() {
		try {
			List<WebElement> linkss = D.findElements(By.tagName("a"));
			System.out.println(linkss.size());

			for (int i=0 ; i< linkss.size() ; i++) {
				WebElement go =linkss.get(i);
				String urls =	go.getAttribute("href");
				checkUrl(urls);
				//break;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.print("pls try again");		}





	}




	//static means you dont need object from the class
	public static void checkUrl(String urllink) {
		try {
			URL link = new URL(urllink);
			// creat a connection using Url object
			try {
				HttpURLConnection conn = (HttpURLConnection) link.openConnection();
				conn.setConnectTimeout(2000);
				conn.connect();
				if (conn.getResponseCode() == 200 ) {
					System.out.println(urllink +"-"+ conn.getResponseCode()+" ok");

				}
				if (conn.getResponseCode() == 401) {
					System.out.println(urllink +"-"+ conn.getResponseCode()+" No");


				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} 

	}
}