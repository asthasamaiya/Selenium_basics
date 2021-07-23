package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href*='nested_frames']")).click();
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
