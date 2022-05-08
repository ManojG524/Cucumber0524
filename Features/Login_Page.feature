
Feature: Title of your feature
  I want to use this template for my feature file


  
  Scenario Outline: Login into the page
  Given I will launch the application
    Then I will enter user name <Username>
    Then I will enter password <password> 
    Then  I will click on submit button

    Examples: 
      | Username  				|				 password		 | 
      | standard_user     |    secret_sauce  	 |
    
