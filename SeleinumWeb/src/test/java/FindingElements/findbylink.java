package FindingElements;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class findbylink {
	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("https://the-internet.herokuapp.com/inputs");



	}
	@Test
	public void findlinks () {
		WebElement lo = D.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input"));
	//	WebElement go = D.findElement(By.linkText("Checkboxes"));
	//	System.out.println(go.getAttribute("href"));
    //	go.click();
    	System.out.println(lo.getTagName());



	}
	@AfterTest 
	public void quit () {
		
		
		D.close();
		
	}
}
