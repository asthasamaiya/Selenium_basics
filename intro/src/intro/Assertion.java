package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assertion {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub


			System.setProperty("webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

		driver.get("https://spicejet.com");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//number of count
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

}
}
