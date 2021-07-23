package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait w=new WebDriverWait(driver, 5);
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div#results")));
		
		System.out.println(driver.findElement(By.cssSelector("div#results")).getText());
		
	}

}
