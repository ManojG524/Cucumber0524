package common_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;

	public String URL="https://www.saucedemo.com/";
	
	public void Browser_URL()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
}
