import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.mozilla.org/en-US/contribute/stories/ruben/");
		
		
//		driver.findElement(By.xpath("//input[@id='id_email'][@name='email']")).sendKeys("sagar26feb@gmail.com");  //manual x-path
//		driver.findElement(By.cssSelector("button[id=footer_email_submit]")).click();
		
		driver.get("https://www.facebook.com/");
		//String str = driver.findElement(By.xpath("//div[@id='content']/div/div/div/div/div[2]/div/div/span")).getText();  //relative x-path
		String str = driver.findElement(By.xpath("//div[2]/div/div/span")).getText();  //absolute x-path
		System.out.println(str);
		driver.close();
		
}
}
