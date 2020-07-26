package FindingElements;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestUpload {

	ChromeDriver D ;
	@BeforeTest
	public void openUrl () {
		String ChromePath = System.getProperty("user.dir")+"\\81\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		D = new ChromeDriver() ;
		D.navigate().to("https://imgbb.com/");
D.navigate().refresh();

	}
	

	@Test
	public void TestUploading () throws AWTException  {
		
		
                String imgname = "kayn.jpg";
                String imgpath = System.getProperty("user.dir")+"\\uploads\\"+imgname;
				WebElement up = D.findElement(By.xpath("//*[@id=\"home-cover-content\"]/div[2]/a"));
				up.click();
			Robot robot = new Robot();
			// copy paste el imgpath
			StringSelection selc = new StringSelection(imgpath);
			Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
			clip.setContents(selc, null);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(3000);
			
			//ctrl + v
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement selectIT = D.findElement(By.name("upload-expiration"));
			Select sel = new Select(selectIT);
			sel.deselectByVisibleText("After 1 day");

//D.findElement(By.className("btn btn-big green")).click();


		}


	@Test(enabled = false)
	public void TestUploadin ()  {
		
		
                String imgname = "kayn.jpg";
                String imgpath = System.getProperty("user.dir")+"\\uploads\\"+imgname;
				WebElement up = D.findElement(By.name("file"));
				up.click();
				WebElement upBTN = D.findElement(By.id("file-submit"));
				upBTN.click();
			
		}






}