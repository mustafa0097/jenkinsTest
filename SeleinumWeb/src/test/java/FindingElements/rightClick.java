package FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rightClick {
	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo/accesskeys.html");



	}


	@Test
	private void RightClick() {
		WebElement btn = D.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		WebElement menu = D.findElement(By.xpath("/html/body/ul/li[1]"));
		Actions builder =new Actions (D);
		builder.contextClick(btn).moveToElement(menu).click().perform();
		
	

	}


}

