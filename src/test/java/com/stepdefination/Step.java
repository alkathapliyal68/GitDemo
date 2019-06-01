package com.stepdefination;

import java.io.IOException;

import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObj.Landing_Page;
import pageObj.Loginpage;
import pageObj.Protal_HomePage;
import resources.Base_Class;

@RunWith(Cucumber.class)
public class Step extends Base_Class {

	@Given("^find driver with chrome driver$")
    public void find_driver_with_chrome_driver() throws IOException{
         driver = intializerDriver();
    }

    @Given("^Hit to \"([^\"]*)\" with chrome$")
    public void hit_to_something_with_chrome(String strArg1){
        driver.get(strArg1);
    }

    @Given("^Click on login button in home page to land on secure sign in page$")
    public void click_on_login_button_in_home_page_to_land_on_secure_sign_in_page() {
         Landing_Page l = new Landing_Page(driver);
         if(l.getPopupSize().size()>0)
         {
        	 l.getPopup().click();
         }
		l.getLogin().click();
    }
    @When("^user enters (.+) and (.+) and logs in$")
    public void user_enters_username_and_password_and_logs_in(String username, String password) throws Throwable {
    	Loginpage lp = new Loginpage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getNext().click();
        
    }

    @Then("^Varify user is successfully log in$")
    public void varify_user_is_successfully_log_in() {
        Protal_HomePage ph= new Protal_HomePage(driver);
    	Assert.assertTrue(ph.searchbox().isDisplayed());
    }

    @And("^quit browsers$")
    public void quit_browsers() {
       driver.quit();
    }
	
}
