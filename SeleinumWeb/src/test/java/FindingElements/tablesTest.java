package FindingElements;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tablesTest {
	
	
		ChromeDriver D ;
		@BeforeTest
		public void openUrl () {
			String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			D = new ChromeDriver() ;
			D.navigate().to("https://the-internet.herokuapp.com/tables");
			System.out.println(D.getCurrentUrl());




		}

		@Test
		public void Test ()  {
		WebElement tab = D.findElement(By.xpath("//*[@id=\"table1\"]"));
		List<WebElement> rows = tab.findElements(By.tagName("tr"));
		assertEquals(5, rows.size());
		
		for (WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
				System.out.println(col.getText());				
				
			}
			
		}
		
}

			

		}
	


