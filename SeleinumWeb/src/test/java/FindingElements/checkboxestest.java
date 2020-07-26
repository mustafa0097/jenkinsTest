package FindingElements;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.NoSuchElementException;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checkboxestest {
	public class testDropDown {
		WebElement txt ;
		WebElement go;
		ChromeDriver D ;
		@BeforeTest
		public void openUrl () {
			String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			D = new ChromeDriver() ;
			D.navigate().to("https://the-internet.herokuapp.com/checkboxes");
			System.out.println(D.getCurrentUrl());




		}

		@Test(enabled = false)
		public void Test () throws InterruptedException {
			WebElement go =  D.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
			go.click();
			Thread.sleep(7000);
			WebElement no =  D.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
			no.click();
			Thread.sleep(5000);
			//go.click();
			if (go.isSelected()) {
				go.click();

			}
			
		}
		@Test
		private void Elementispresent() {
			if (iselementpresent(By.xpath("//*[@id=\"checkboxes\"]/input[1]"))) {
				WebElement check1 = D.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
			if (!check1.isSelected()) {
				check1.click();
				
			}	
			else {
				Assert.fail("fuck off ");
			}
			}
			
		}
		private boolean iselementpresent(By me) {
			try {
				
				D.findElement(me);
				return true ;
			} catch (NoSuchElementException e) {
				return false;
				
			}
			
		}
	}

}
