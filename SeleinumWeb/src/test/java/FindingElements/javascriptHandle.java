package FindingElements;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javascriptHandle {

	ChromeDriver D ;

	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("http://www.google.com");
		//D.manage().window().maximize();
		System.out.println(D.getCurrentUrl());



	}

@Test
private void JShandle() {
JavascriptExecutor js =  (JavascriptExecutor) D ;
String title = (String) js.executeScript("return document.title");
assertEquals("Google", title);
long links = (long) js.executeScript("var links = document.getElementsByTagName('a'); return links.length");
System.out.println("the length is "+links);
	
	
	
	

}

}