package FindingElements;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HTML5ideoPlayer {

	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("http://cookbook.seleniumacademy.com/html5video.html");
		System.out.println(D.getCurrentUrl());




	}

	@Test
	public void TestVideoPlayer ()  {
		WebElement V = D.findElement(By.id("vplayer"));
		JavascriptExecutor js = D;
		js.executeScript("return arguments[0].play()", V);
		js.executeScript("return arguments[0].pause()", V);

		// js.executeScript("document.getElementById(\"vplayer\").play()");

	
}

		

	}