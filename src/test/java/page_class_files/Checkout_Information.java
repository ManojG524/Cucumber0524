package page_class_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout_Information {
	
	WebDriver driver;
	
	private WebElement FName=driver.findElement(By.xpath("//input[@id='first-name']"));
	private WebElement LName=driver.findElement(By.xpath("//input[@id='last-name']"));
	private WebElement ZIPcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
	private WebElement Continue=driver.findElement(By.xpath("//input[@id='continue']"));
	
	public void Filling_Checkout_Firstname(String Firstname)
	{
	
		FName.sendKeys(Firstname);
	}
	public void Filling_Checkout_Lastname(String Lastname)
	{
		
		LName.sendKeys(Lastname);
	}
	public void Filling_Checkout_Zipcode(String Postalcode)
	{
		
		ZIPcode.sendKeys(Postalcode);
	}

	public void Continue_button()
	{
		Continue.click();
	}
}
