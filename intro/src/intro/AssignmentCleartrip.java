package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AssignmentCleartrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.setProperty( "webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			driver.get("https://www.cleartrip.com");
			
			//adults
			driver.findElement(By.id("Adults")).click();
			Select ppl=new Select(driver.findElement(By.id("Adults")));
			ppl.selectByValue("2");
			
			//children
			driver.findElement(By.id("Childrens")).click();
			Select child=new Select(driver.findElement(By.id("Childrens")));
			child.selectByValue("1");
			
			//current date
			driver.findElement(By.id("DepartDate")).click();
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
			
			//click link
			driver.findElement(By.id("MoreOptionsLink")).click();
			
			//preferred airline
			driver.findElement(By.id("AirlineAutocomplete")).click();
			driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
			
			//search
			driver.findElement(By.xpath("//input[@value='Search flights']")).click();
					
			//error msg
			System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
			
			
			
			
			
			
	}

}
