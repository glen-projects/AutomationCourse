package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {
	
	public void fileUploadUsingSendKeys() {
		
		driver.navigate().to("https://demo.guru99.com/test/upload");
		WebElement upload = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		upload.sendKeys("D:\\Java Project\\AutomationCourse\\src\\test\\resources\\brouchure.pdf");
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='terms']"));
		checkbox.click();
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit.click();
	}
	
	public void fileUploadUsingRobotClass() throws AWTException {
		
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement select = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		select.click();
		StringSelection s = new StringSelection("\"D:\\Java Project\\AutomationCourse\\src\\test\\resources\\brouchure.pdf\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingFileUpload fileupload=new HandlingFileUpload();
		fileupload.initialiseBrowser();
		//fileupload.fileUploadUsingSendKeys();
		try {
			fileupload.fileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
