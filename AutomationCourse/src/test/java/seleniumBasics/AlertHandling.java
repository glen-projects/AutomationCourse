package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void verifySimpleAlert() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealertbutton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simplealertbutton.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void verifyConfirmAlert() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealertbutton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		simplealertbutton.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
public void verifyPromptAlert() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealertbutton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		simplealertbutton.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Glen");
		alert.accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlertHandling alert = new AlertHandling();
		alert.initialiseBrowser();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();

	}

}
