package jenkins.testJenkins;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AppTest 
{ FirefoxDriver D;
	@BeforeTest
	public void openUrl () {
		String firefoxPath = System.getProperty("user.dir")+"\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", firefoxPath);
		D = new FirefoxDriver() ;
		D.navigate().to("https://the-internet.herokuapp.com/dropdown");
		System.out.println(D.getCurrentUrl());




	}
    @Test
    public void shouldAnswerWithTrue()
    {
        
    }
}
