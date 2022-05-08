package stepDefinition;

import common_pages.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestDemo {
	
	
	private BaseClass application;
	
	@Given("^I will launch the application$")
	public void i_will_launch_the_application() throws Throwable {
	    
		application.Browser_URL();
	}

	@Then("^I will enter user name standard_user$")
	public void i_will_enter_user_name_standard_user() throws Throwable {
	    
	}

	@Then("^I will enter password secret_sauce$")
	public void i_will_enter_password_secret_sauce() throws Throwable {
	   
	}

	@Then("^I will click on submit button$")
	public void i_will_click_on_submit_button() throws Throwable {
	   
	}

}
