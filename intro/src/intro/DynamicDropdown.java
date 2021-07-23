package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		/* 
		  driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
		 
		 	//this [2] index, people dont like sometimes. to avoid using index use parent xpath along with this objescts xpath.
		 	  shown below. 
		 */
		 
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BHO']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	}

}
