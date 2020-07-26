package FindingElements;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class retry {

	FirefoxDriver F ;
	
	@BeforeTest
	public void openUrl () {
		String FireFoxPath = System.getProperty("user.dir")+"\\Resources\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FireFoxPath);
		F = new FirefoxDriver() ;
		F.navigate().to("http://cookbook.seleniumacademy.com/html5video.html");


	}

	@Test
	public void TestVideoPlayer () throws InterruptedException, IOException  {
		WebElement V = F.findElement(By.id("vplayer"));
		V.click();
		JavascriptExecutor js = F;
		//js.executeScript("return arguments[0].play()", V);
		Thread.sleep(5000);
		js.executeScript("return arguments[0].pause()", V);
		File src = ((TakesScreenshot)F).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("./ScreenShots/videoplayer.png"));


	
}

		

	}