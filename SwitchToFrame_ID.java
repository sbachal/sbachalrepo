import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToFrame_ID {
public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver(); //navigates to the Browser
	    driver.get("http://demo.guru99.com/selenium/guru99home/"); 
	       // navigates to the page consisting an iframe
	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
     	WebElement ad1 =	driver.findElement(By.xpath("html/body/a/img"));
     	ad1.click();
  		    //Clicks the iframe
       
  			System.out.println("*********We are done***************");
      }
}		