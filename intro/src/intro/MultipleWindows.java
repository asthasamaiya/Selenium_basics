package intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set <String> wd=driver.getWindowHandles();
		
		Iterator <String> it=wd.iterator();
		String one=it.next();
		String two=it.next();
		
		driver.switchTo().window(two);
		System.out.println(driver.findElement(By.xpath("//html/body/div/h3")).getText());
		
		driver.switchTo().window(one);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
		
		
	}

}
