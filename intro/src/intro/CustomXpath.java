package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("astha.samaiya");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("preeti");		  
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();		// xpath locator
		
	}

}
