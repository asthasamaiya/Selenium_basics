package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object of firefox webdriver
		
		//before that webdriver's .exe file path needs to be set
		
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//driver.navigate().to("https://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.close();
		//driver.quit();
		
	}

} 
