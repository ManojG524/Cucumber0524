package stepDefinition;

import org.openqa.selenium.WebDriver;
import common_pages.BaseClass;
import cucumber.api.java.en.Given;
import page_class_files.Login_Page;

public class Adding_Iteam_to_CardList {

	
	WebDriver driver;
	BaseClass browser;
	Login_Page LP;
	
	
	
	@Given("^I want to launch the browser alon with website$")
	public void i_want_to_launch_the_browser_alon_with_website() throws Throwable {
		browser.Browser_URL();
			
	}

	@Given("^I Enterd username standard_user and secret_sauce$")
	public void i_Enterd_username_standard_user_and_secret_sauce(String Name,String passcode) throws Throwable {
	    LP.Valid_login_page(Name, passcode);
	}

	@Given("^I click on Login Button$")
	public void i_click_on_Login_Button() throws Throwable {
	  LP.Click_on_Login();
	}


}
