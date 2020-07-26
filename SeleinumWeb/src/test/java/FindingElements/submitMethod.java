package FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class submitMethod {
	WebElement txt ;
	WebElement go;
	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("https://www.google.com");
		System.out.println(D.getCurrentUrl());




	}

	@Test
	public void submit () {


		txt = D.findElement(By.name("q"));
		//go = D.findElement(By.name("btnK"));
		txt.sendKeys("league of legends");
		txt.submit();
		txt = D.findElement(By.name("q"));
		//go = D.findElement(By.name("btnK"));
		txt.clear();
		txt.sendKeys("valorant");
		txt.submit();



	}
}