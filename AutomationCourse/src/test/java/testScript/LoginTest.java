package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumBasics.testNGBase;

public class LoginTest extends testNGBase {

	@BeforeMethod
	public void beforeMethod() {
		
		driver.navigate().to("https://www.saucedemo.com/v1/index.html");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	@Test
	public void verifyUserLoginWithValidCredentials()
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		
	}
	
	@Test
	public void verifyLoginWithValidUsernameInvalidPassword() {
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_password");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}
	
	@Test
	public void verifyLoginWithIncorrectUsernameValidPassword() {
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("new_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}
	
	@Test
	public void verifyLoginWithIncorrectUsernameAndIncorrectPassword() {
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("new_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_password");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}
	
}
