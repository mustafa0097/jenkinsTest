package FindingElements;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WORKINGwithELEMENTS {
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
		D.navigate().to("https://the-internet.herokuapp.com/login");
		WebElement w = D.findElement(By.id("username"));
		WebElement x = D.findElement(By.id("password"));
		WebElement y = D.findElement(By.className("radius"));
		w.sendKeys("tomsmith");
		x.sendKeys("SuperSecretPassword!");
		y.click();
		WebElement z = D.findElement(By.id("flash"));
		System.out.println(z.getText());
		assertTrue(z.getText().contains("secure area!"));
		




	}
	@AfterTest 
	public void quit () {


		//D.close();

	}
}



