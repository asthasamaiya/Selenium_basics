package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
