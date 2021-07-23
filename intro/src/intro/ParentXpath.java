package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("selenium");
	}

}
