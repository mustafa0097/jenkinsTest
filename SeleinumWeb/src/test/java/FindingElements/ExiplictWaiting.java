package FindingElements;

import static org.testng.Assert.assertEquals;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExiplictWaiting {

	
		ChromeDriver D ;

		@BeforeTest
		public void openUrl () {
			String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			D = new ChromeDriver() ;
			D.navigate().to("http://www.google.com");
			D.manage().window().maximize();
			System.out.println(D.getCurrentUrl());



		}

	@Test
	private void Impwait() {
		WebElement Go = D.findElement(By.name("q"));
		WebElement sub = D.findElement(By.name("btnK"));
		Go.sendKeys("pink floyd");
		sub.submit();
		WebDriverWait W = new WebDriverWait(D, 60);
		W.until(ExpectedConditions.titleContains("pink floyd"));
		assertEquals("pink floyd - بحث Google‏", D.getTitle());
		
	}

	}
