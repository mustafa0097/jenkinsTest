package FindingElements;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindingElements2 {
	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("https://the-internet.herokuapp.com/tables");



	}
	@Test




	public void login () {
		try {
			WebElement tab  = D.findElement(By.id("table2"));
			java.util.List<WebElement> l = D.findElements(By.tagName("tr"));
			System.out.println(l.get(6).getText());
		} 
		
		
		catch (org.openqa.selenium.NoSuchElementException F) {
			System.out.println("this element isnt exist please try another one ");

		}

	}
	@AfterTest
	private void close() {
		D.close();
	}

}


