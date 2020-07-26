package FindingElements;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.awt.Desktop.Action;
import java.util.NoSuchElementException;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class smartactions {
	public class testDropDown {

		ChromeDriver D ;
		@BeforeTest
		public void openUrl () {
			String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			D = new ChromeDriver() ;
			D.navigate().to("http://cookbook.seleniumacademy.com/DoubleClickDemo.html");
			System.out.println(D.getCurrentUrl());

		}

		@Test 
		private void duobleClick() {
			WebElement clic = D.findElement(By.id("message"));
			Actions builder = new Actions(D);
			builder.doubleClick(clic).perform();

		}
	}


}


