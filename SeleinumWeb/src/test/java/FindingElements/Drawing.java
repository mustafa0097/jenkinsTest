package FindingElements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drawing {

FirefoxDriver F ;
	
	@BeforeTest
	public void openUrl () {
		String FireFoxPath = System.getProperty("user.dir")+"\\Resources\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FireFoxPath);
		F = new FirefoxDriver() ;
		F.navigate().to("http://cookbook.seleniumacademy.com/html5canvasdraw.html");


	}

	@Test
	public void draw ()  {
		WebElement S = F.findElement(By.id("dtool"));
		WebElement Canavas = F.findElement(By.id("imageView"));
		Select selc = new Select(S);
		//Select drawTool = new Select(Canavas);
	    selc.selectByValue("rect");
	    Actions builder = new Actions(F);
	    builder.clickAndHold(Canavas).moveByOffset(50, 50).perform();
		

	
}

		

	}
