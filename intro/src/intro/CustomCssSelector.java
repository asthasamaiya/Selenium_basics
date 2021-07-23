package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("astha.samaiya");  //tagname[attribute='value']
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys("presaia");		  //tagname#id
		
		driver.findElement(By.cssSelector("button#loginbutton")).click();		//tagname#id
		
	
	}

}
