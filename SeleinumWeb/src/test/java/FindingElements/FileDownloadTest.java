package FindingElements;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileDownloadTest {

	FirefoxDriver F ;
	public static String downloadpath = System.getProperty("user.dir")+"\\Downloads";
	public static FirefoxOptions firefoxOption() {
		FirefoxOptions Fire = new FirefoxOptions();
		Fire.addPreference("browser.download.folderlist", 0);
	//	Fire.addPreference("browser.download.dir", downloadpath);
		Fire.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/octed-stream");
		Fire.addPreference("browser.download.manager.showWhenStarting", false);
		return Fire;
		
		
	}
	@BeforeTest
	public void openUrl () {
		String FireFoxPath = System.getProperty("user.dir")+"\\Resources\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FireFoxPath);
		F = new FirefoxDriver(firefoxOption()) ;
		F.navigate().to("https://the-internet.herokuapp.com/download");


	}
	

	@Test
	public void TestUploading ()  {
		WebElement down = F.findElement(By.linkText("myfile.png"));
		down.click();
		
		
          
			
		}








}