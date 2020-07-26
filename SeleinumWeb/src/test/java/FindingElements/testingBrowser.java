package FindingElements;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testingBrowser {
	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("https://the-internet.herokuapp.com");
		System.out.println(D.getCurrentUrl());



	}
	@Test
	public void browser () {
		D.navigate().to("https://the-internet.herokuapp.com/inputs");
		D.navigate().refresh();
		System.out.println(D.getCurrentUrl());
		D.navigate().back();
		System.out.println(D.getCurrentUrl());
		D.navigate().forward();
		System.out.println(D.getCurrentUrl());
		D.manage().window().maximize();
		


	}
	@AfterTest 
	public void quit () {


		//D.close();

	}
}
