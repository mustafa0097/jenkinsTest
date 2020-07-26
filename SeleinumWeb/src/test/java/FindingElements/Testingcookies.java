package FindingElements;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingcookies {
	ChromeDriver D ;

	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("http://magento-demo.lexiconn.com/");
		D.manage().window().maximize();
		System.out.println(D.getCurrentUrl());



	}

@Test
private void cook() {
	WebElement drop = D.findElement(By.id("select-language"));
	Select selc =new Select(drop);
	selc.selectByVisibleText("French");
	
	

}

}
