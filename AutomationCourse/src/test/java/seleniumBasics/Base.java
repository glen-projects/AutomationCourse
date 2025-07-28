package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

	public WebDriver driver;
	
	public void initialiseBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		
	}
	
	public void browserClose() {
		//driver.close(); close current active window
		//driver.quit(); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base base=new Base();
		base.initialiseBrowser();
		base.browserClose();
	}

}
