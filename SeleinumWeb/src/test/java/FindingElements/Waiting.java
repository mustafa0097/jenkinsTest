package FindingElements;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Waiting {
	ChromeDriver D ;

	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("http://cookbook.seleniumacademy.com/AjaxDemo.html");
		D.manage().window().maximize();
		System.out.println(D.getCurrentUrl());



	}

@Test
private void Impwait() {
	//D.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	D.findElement(By.xpath("//*[@id=\"navigation\"]/li[2]/a")).click();
	Wait<WebDriver> w = new FluentWait<WebDriver>(D)
	.withTimeout(20, TimeUnit.SECONDS)
	.pollingEvery(2, TimeUnit.SECONDS)
	.ignoring(NoSuchElementException.class);
	//WebElement msg = w.until(isTrue)
}

}