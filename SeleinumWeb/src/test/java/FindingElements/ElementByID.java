package FindingElements;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementByID {

	ChromeDriver Driv ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		Driv = new ChromeDriver() ;
		Driv.navigate().to("https://the-internet.herokuapp.com/login");



	}
	@Test




	public void login () {
		try {
			WebElement button = Driv.findElement(By.className("radius"));
			WebElement gethub = Driv.findElement(By.tagName("href"));
			WebElement img = Driv.findElement(By.tagName("img"));
			WebElement password = Driv.findElement(By.id("password"));
			System.out.println(button.getTagName());
			//button.click();
			gethub.click();
		} 
		
		
		catch (org.openqa.selenium.NoSuchElementException F) {
			System.out.println("this element isnt exist please try another one ");

		}

	}
	@AfterTest
	private void close() {
		//Driv.close();
	}

}
