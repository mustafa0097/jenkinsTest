package FindingElements;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lollogin {
	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
        D.navigate().to("https://auth.riotgames.com/login#client_id=rso-web-client-prod&login_hint=eune&redirect_uri=https%3A%2F%2Flogin.leagueoflegends.com%2Foauth2-callback&response_type=code&scope=openid&state=x1q3aUX9lADotym78eIV59qJ0amz5MEp5PboXa-3ICU&ui_locales=en-pl");		



	}
	
		@Test 
		public void login () throws InterruptedException {
			try {
				WebElement log =D.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/input"));
				//WebElement log = D.findElement(By.name("username"));
				WebElement pass = D.findElement(By.name("password"));
				WebElement sub =D.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/button")); 
				log.sendKeys("desha0097");
				Thread.sleep(2000);
				pass.sendKeys("memothegambler123");
				Thread.sleep(2000);
				sub.click();
				
			} catch (NoSuchElementException e) {
				System.out.println("Element isnt exist please try another one ");
			}
			
			
			
			
		}



	
	@AfterTest 
	public void quit () {


		//D.close();

	}
}




