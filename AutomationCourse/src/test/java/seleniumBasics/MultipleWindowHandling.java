package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	
	public void verifyWindowHandling() {
		
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstwindowhandleid = driver.getWindowHandle();
		System.out.println(firstwindowhandleid);
		WebElement clickbutton = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickbutton.click();
		
		Set <String> windowhandleids = driver.getWindowHandles();
		Iterator <String> it = windowhandleids.iterator();
		while(it.hasNext()){
			
			String currentid=it.next();
			if(!currentid.equals(firstwindowhandleid)) {
				
				driver.switchTo().window(currentid);
				WebElement emailid= driver.findElement(By.xpath("//input[@name='emailid']"));
				emailid.sendKeys("test@123.com");
				WebElement submitbutton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submitbutton.click();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleWindowHandling windowhandling = new MultipleWindowHandling();
		windowhandling.initialiseBrowser();
		windowhandling.verifyWindowHandling();

	}

}
