import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserInternationalization {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("intl.accept_languages", "jp");
		
		FirefoxDriver driver = new FirefoxDriver (profile);
		
		
		driver.get("https://www.google.co.in");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 0);
		//WebElement element = wait.until(ExpectedConditions.)

	}

}
