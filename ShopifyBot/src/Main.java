import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {

public static void main(String[] args) {
		
		//
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.supremenewyork.com/shop/all");
		//driver.findElement(By.linkText("shoes")).click();
		//driver.findElement(By.xpath("//img[contains(@alt,'Dwnkz') and contains(@alt,'rsknm')]")).click();
		
		driver.get("https://www.supremenewyork.com/shop/accessories/hwz7l51x4/tgo15pwq9");
		
		Select dropSize = new Select(driver.findElement(By.name("s")));
		
		dropSize.selectByVisibleText("Medium");
		
		driver.findElement(By.name("commit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/a[2]")))).click();
		
		driver.findElement(By.id("order_billing_name")).sendKeys("Kenny Ly");
		driver.findElement(By.id("order_email")).sendKeys("ktly23@yahoo.com");
		driver.findElement(By.id("order_tel")).sendKeys("858-232-8884");
		driver.findElement(By.id("bo")).sendKeys("5220 Conrad Ave.");
		driver.findElement(By.id("order_billing_zip")).sendKeys("92117");
		driver.findElement(By.id("order_billing_city")).sendKeys("San Diego");
		driver.findElement(By.id("order[billing_country]")).sendKeys("USA");
		
	}


}
