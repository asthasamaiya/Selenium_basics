package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class LoopDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("5");
		
		Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s1.selectByValue("0");
		
		Select s2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s2.selectByValue("0");

		driver.findElement(By.id("divpaxinfo")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
