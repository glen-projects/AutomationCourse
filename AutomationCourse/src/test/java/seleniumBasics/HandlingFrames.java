package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	

	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List <WebElement> totaliframe = driver.findElements(By.tagName("iframe"));
		System.out.println(totaliframe.size());
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1); //change control to frame
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		driver.switchTo().defaultContent(); //return control to default space
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingFrames frames=new HandlingFrames();
		frames.initialiseBrowser();
		frames.verifyFrames();
		
	}

}
