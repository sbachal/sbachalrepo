import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestTags 
{
	public static void main (String [] args)
	{	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		List <WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+list.size());
		Iterator itr = list.iterator();
		while (itr.hasNext())
		{
			//System.out.println(itr.next());
			    WebElement we = (WebElement)itr.next();
			    System.out.println(we.getText());
			    
			    
		}
		
//		for(int i = 0; i < list.size(); i++)
//		{
//		System.out.println(list.get(i).getText());
//		}
		
		driver.close();
	}
}