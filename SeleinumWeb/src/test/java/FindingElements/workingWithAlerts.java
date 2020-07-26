package FindingElements;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingWithAlerts {
	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");
		System.out.println(D.getCurrentUrl());


	}
	@Test
	public void checkAlert() throws InterruptedException {
		//WebElement go = D.findElement(By.id("simple"));
		//WebElement myname = D.findElement(By.id("prompt"));
		WebElement lol = D.findElement(By.id("confirm"));
		//myname.click();
		//go.click();
		lol.click();
		Thread.sleep(2000);
		Alert alert = D.switchTo().alert();
		//alert.sendKeys("my name is slim shady");
		Thread.sleep(2000);
		//String alerttxt = alert.getText();
		alert.dismiss();

	}



}