package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub


			System.setProperty("webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

		driver.get("https://spicejet.com");
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("enabled");
			Assert.assertTrue(true);
			
			
		}
		else
		{
			
			Assert.assertTrue(false);
			System.out.println("disabled");
		}

	
	
	

}
}