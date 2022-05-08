package page_class_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
	
	WebDriver driver;
	
	private WebElement Username=driver.findElement(By.xpath("//input[@id='user-name']"));
	private WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
	private WebElement Login_Button=driver.findElement(By.xpath("//input[@id='password']"));
	private WebElement Error=driver.findElement(By.xpath("//h3[normalize-space()='Epic sadface: Username is required']"));
	private WebElement Close_Error_Msg=driver.findElement(By.xpath("//button[@class='error-button']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]"));
	
	public void Valid_login_page(String Name,String passcode)
	{
		Username.sendKeys(Name);
		Password.sendKeys(passcode);
		
	}
	public void Click_on_Login()
	{
		Login_Button.click();
	}

	public void InValid_login_page(String InvalidName,String Invalidpasscode)
	{
		
		Username.sendKeys(InvalidName);
		Password.sendKeys(Invalidpasscode);
		Login_Button.click();
		
		String Error_message=Error.getText();
		String msg="Epic sadface: Username is required";
		
		if (Error_message.equals(msg))
		{
			System.out.println("User Enterd invalid credentials");
			Close_Error_Msg.click();
		}
		
	}

}
