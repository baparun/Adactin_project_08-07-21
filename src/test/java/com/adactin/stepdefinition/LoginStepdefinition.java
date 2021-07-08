 	package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.BASE.Base_Class;
import com.adactin.property.File_Reader;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class LoginStepdefinition extends Base_Class {
	
public static WebDriver driver= Runner.driver;
	@Before 
	public void BeforeHooks(Scenario scenario) {
		String status = scenario.getStatus();
		System.out.println("scenario status"+status);
	}
	
	@After
	public void AfterHooks(Scenario scenario) throws Throwable {
	if (scenario.isFailed()) {
		screenshot();
	}	
	System.out.println("Exit from the page");
	}
//Login_page lp=new Login_page(driver);
Page_Object_Manager POM=new Page_Object_Manager(driver);	

	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		String geturl = File_Reader.getinstance().getinstanceCR().geturl();
		geturl(geturl);
	}
	@When("^user enter \"([^\"]*)\" the valid username$")
	public void user_enter_the_valid_username(String arg1) throws Throwable {
	//inputofelement(lp.getUsername(),File_Reader.getinstance().getinstanceCR().username());
		//inputofelement(POM.InstanceLogin().getUsername(),File_Reader.getinstance().getinstanceCR().username());
		inputofelement(POM.InstanceLogin().getUsername(),arg1);
		
	}
	
	@When("^user enter \"([^\"]*)\" the valid password$")
	public void user_enter_the_valid_password(String arg1) throws Throwable {
//		inputofelement(lp.getPassword(),File_Reader.getinstance().getinstanceCR().password());
		//inputofelement(POM.InstanceLogin().getPassword(),File_Reader.getinstance().getinstanceCR().password());
		inputofelement(POM.InstanceLogin().getPassword(),arg1);
		
	}
	
	@When("^User click login button$")
	public void user_click_login_button() throws Throwable{
	//	clickonelement(lp.getLogin_btn());
		clickonelement(POM.InstanceLogin().getLogin_btn());
	}
	
	@Then("^user validate the username and password$")
	public void user_validate_the_username_and_password() throws Throwable {
	
	}
}

