package FindingElements;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testDropDown {
	WebElement txt ;
	WebElement go;
	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("https://the-internet.herokuapp.com/dropdown");
		System.out.println(D.getCurrentUrl());




	}

	@Test
	public void Test () {
		WebElement go =  D.findElement(By.id("dropdown"));
		Select selc = new Select(go);
		//selc.selectByValue("2");
		selc.selectByVisibleText("Option 1");
		//selc.selectByIndex(2);
		assertEquals("Option 1", selc.getFirstSelectedOption().getText());



		

	}
}


