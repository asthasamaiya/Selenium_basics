package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object of firefox webdriver

		// before that webdriver's .exe file path needs to be set

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		// driver.findElement(By.id("email")).sendKeys("astha.samaiya"); // ID locator

		driver.findElement(By.cssSelector("#email")).sendKeys("astha.samaiya");

		driver.findElement(By.name("pass")).sendKeys("dfornvd"); // name locator
		// driver.findElement(By.linkText("Forgotten password?")).click(); //linkText
		// locator
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click(); // xpath locator
		System.out.println(driver.findElement(By.xpath("div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[2]/div[2]")).getText());
	}
}
