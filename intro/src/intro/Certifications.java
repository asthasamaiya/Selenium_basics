package intro;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.google.common.io.Files;

public class Certifications {

	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub

//SSl certificates

//Desired capabilities=
//general chrome profile
DesiredCapabilities fox=DesiredCapabilities.firefox();
//ch.acceptInsecureCerts();
fox.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
fox.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

//Belows to your local browser
FirefoxOptions f= new FirefoxOptions();
f.merge(fox);

System.setProperty("webdriver.gecko.driver", "C:\\Users\\VANSHIKA\\Documents\\geckodriver.exe");
WebDriver driver =new FirefoxDriver();

driver.get("https://google.com");

//maximize the browser window
driver.manage().window().maximize(); 

//delete specific cookie
//driver.manage().deleteCookieNamed("Sessioncookie");

//delete all cookies
//driver.manage().deleteAllCookies();

//take screenshot
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("C:\\Users\\VANSHIKA\\Pictures\\screenshot.png"));

}

}