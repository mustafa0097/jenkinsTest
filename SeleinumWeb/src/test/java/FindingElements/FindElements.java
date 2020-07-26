package FindingElements;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElements {

	ChromeDriver D ;

	@BeforeTest
	public void openSite () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("https://the-internet.herokuapp.com");
	}
	@Test 
	public void Finding () {


		//List<WebElement> L = D.findElements(By.tagName("a"));
		//System.out.println(L.size());
		//for (WebElement lol : L) {
		//	System.out.println(lol.getText());
		//	System.out.println(lol.getAttribute("href"));	
		//	}
		//	assertEquals(46, L.size());
		WebElement pls = D.findElement(By.linkText("Elemental Selenium"));
			System.out.println();	


	} 

	
		
	
	@AfterTest
	private void close() {
		D.close();
	}

}
