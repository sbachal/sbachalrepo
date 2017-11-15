import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				FirefoxDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://automationpractice.com/index.php");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement catagories_link = driver.findElement(By.linkText("Women"));
				catagories_link.click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement search_box = driver.findElement(By.id("search_query_top"));
				search_box.sendKeys("dress");
				WebElement search_button = driver.findElement(By.name("submit_search"));
				search_button.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement dress_link = driver.findElement(By.linkText("Printed Chiffon Dress"));
				dress_link.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement size_ddbox = driver.findElement(By.id("group_1"));
				Select slc = new Select (size_ddbox);
				slc.selectByVisibleText("L");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement addtocart_button = driver.findElement(By.id("add_to_cart"));
				addtocart_button.click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.close();

	}

}
