package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		//origin and destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BHO']")).click();
		
		//current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//select currency
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByVisibleText("AED");
		
		//select passengers
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Select pss=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		pss.selectByValue("5");
		
		Select pss1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		pss1.selectByValue("2");
		
		Select pss2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		pss2.selectByValue("1");

		driver.findElement(By.id("divpaxinfo")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 2 Child, 1 Infant");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//select checkbox
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println("checkbox:"+ driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//round trip : date enable check, round trip check.
		
		
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
	
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		driver.findElement(By.cssSelector("input[id*=FindFlights]")).click();
		
		
	}

}
