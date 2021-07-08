package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.BASE.Base_Class;
import com.adactin.POM.adactin_Itinerary;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Itinerary_StepDefinition extends Base_Class{

	public static WebDriver driver= Runner.driver;

	Page_Object_Manager POM =new Page_Object_Manager(driver);

//adactin_Itinerary ai=new adactin_Itinerary(driver);
	
	@When("^User Want to check the Booked_Room$")
	public void user_Want_to_check_the_Booked_Room() throws Throwable {
	clickonelement(POM.InstanceItinerary().getItinerary());
	}

	@Then("^User want to logout$")
	public void user_want_to_logout() throws Throwable {
	clickonelement(POM.InstanceItinerary().getLogout());
	}

}
