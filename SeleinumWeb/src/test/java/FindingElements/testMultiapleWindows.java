package FindingElements;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testMultiapleWindows {
	ChromeDriver D ;

	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("http://cookbook.seleniumacademy.com/Config.html");
		D.manage().window().maximize();
		System.out.println(D.getCurrentUrl());



	}
	@Test
	public void Windows() {
		String CurrentWindowID = D.getWindowHandle();
		D.findElement(By.id("visitbutton")).click();
		for (String otherwindow : D.getWindowHandles()) {
			String title = D.switchTo().window(otherwindow).getTitle();
			if (title.equals("help")) {
				System.out.println("gut gemacht");
				
			}
			else {
				System.out.println("fik dich");
				break;

			}
			D.switchTo().window(CurrentWindowID);
			D.close();
		}
			
		}


	}
