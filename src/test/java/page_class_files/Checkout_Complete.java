package page_class_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout_Complete {

	WebDriver driver;
	
	private WebElement CC_title=driver.findElement(By.xpath("//span[@class='title']"));
	private WebElement thankyou_title=driver.findElement(By.className("complete-header"));
	private WebElement Thankyou_Desc=driver.findElement(By.className("complete-text"));
}
