package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table=driver.findElement(By.cssSelector("table.table-display"));
		int coloumncount= table.findElements(By.cssSelector("table.table-display tr th")).size();
		System.out.println(coloumncount);
		
		int rowcount= table.findElements(By.cssSelector("table.table-display tr")).size();
		System.out.println(rowcount-1);
		
		
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		int count=secondrow.size();
		for(int i=0;i<count;i++)
		{
			System.out.println(secondrow.get(i).getText());
			
		}
		
		
			
		
		
	}

}
