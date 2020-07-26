package FindingElements;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropTest {
	public class testDropDown {

		ChromeDriver D ;
		@BeforeTest
		public void openUrl () {
			String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			D = new ChromeDriver() ;
			D.navigate().to("http://cookbook.seleniumacademy.com/DragDropDemo.html");
			System.out.println(D.getCurrentUrl());

		}
		
		
		
		@Test
		private void DragDrop() {
			WebElement sorce = D.findElement(By.id("draggable"));
			WebElement target=D.findElement(By.id("droppable"));
			Actions builder = new Actions(D);
			builder.dragAndDrop(sorce, target).perform();;
			assertEquals("Dropped!", target.getText());

		}
	}
	


}

