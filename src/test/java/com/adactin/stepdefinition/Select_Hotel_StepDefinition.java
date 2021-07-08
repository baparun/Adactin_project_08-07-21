package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.BASE.Base_Class;
import com.adactin.POM.adactin_select_hotel;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Select_Hotel_StepDefinition extends Base_Class {
	
public static WebDriver driver = Runner.driver;	
//adactin_select_hotel ash=new adactin_select_hotel(driver);

Page_Object_Manager POM=new Page_Object_Manager(driver);

	@When("^User want to conform  detail$")
	public void user_want_to_conform_detail() throws Throwable {
		clickonelement(POM.InstanceSelectHotel().getRadiobutton_0());
	}

	@When("^User click to continue Button$")
	public void user_click_to_continue_Button() throws Throwable {
	clickonelement(POM.InstanceSelectHotel().getContinuee());
	}

	@Then("^User validate the continue$")
	public void user_validate_the_continue() throws Throwable {
	
	}

	
	
}
