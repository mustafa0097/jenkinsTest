package FindingElements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTakeScreenShot {
	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("https://noon.egybest.pw/");




	}
	@Test 
	public void testin() {
		WebElement S = D.findElement(By.name("qdd"));
		S.sendKeys("se7en");
		S.submit();

	}
	@AfterMethod
	public void takeScreenShot(ITestResult Result) throws IOException {
		if (ITestResult.FAILURE == Result.getStatus()) {
			// take ScreenShot
			TakesScreenshot ts = (TakesScreenshot) D;
			File sorce = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sorce,new File("./ScreenShots/"+ Result.getName()+".png") );

		}




	}

}
