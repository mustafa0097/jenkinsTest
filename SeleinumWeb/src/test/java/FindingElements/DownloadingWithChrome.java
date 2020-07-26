package FindingElements;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DownloadingWithChrome {
	public static String downloadpath = System.getProperty("user.dir")+"\\Downloads";
	ChromeDriver D ;
	public static ChromeOptions Chromeopt() {
	

		ChromeOptions opt = new ChromeOptions();
		HashMap<String, Object> ChromePref = new HashMap<String, Object>();
		ChromePref.put("profile.default.content_settings.popups", 0);
		ChromePref.put("download.default_dircetory", downloadpath);
		opt.setExperimentalOption("prefs", ChromePref);
		
		return opt;
		
	}
	
	
		@BeforeTest
	
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver(Chromeopt()) ;
		D.navigate().to("https://the-internet.herokuapp.com/download");
D.navigate().refresh();

	}
		@Test
		public void name() {
			D.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
		}

}
