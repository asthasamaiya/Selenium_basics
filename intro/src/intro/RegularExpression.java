package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click(); //regular expression for xpath - //tagname[contains(@attribute,'value or its subtext')]
		driver.findElement(By.cssSelector("input[id*='login']")).sendKeys("astha.samaiya"); //regular expression for css - tagname[attribute*='value or its subtext']
		driver.findElement(By.xpath("//input[contains(@id,'passwo')]")).sendKeys("1237567");
		driver.findElement(By.cssSelector("input[class*='signin']")).click();
	}

}
