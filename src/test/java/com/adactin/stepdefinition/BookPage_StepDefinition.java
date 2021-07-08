	package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.BASE.Base_Class;
import com.adactin.POM.Adactin_Book_Page;
import com.adactin.property.File_Reader;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookPage_StepDefinition extends Base_Class  {
public static WebDriver driver= Runner.driver;
	//Adactin_Book_Page bp=new Adactin_Book_Page(driver);
Page_Object_Manager POM =new Page_Object_Manager(driver);
	
	@When("^User enter the firstname$")
	public void user_enter_the_firstname() throws Throwable {
	inputofelement(POM.InstanceBookPage().getFirst_name(), "ARUN");
	}

	@When("^User enter the lastname$")
	public void user_enter_the_lastname() throws Throwable {
		inputofelement(POM.InstanceBookPage().getLast_name(), "PRAKASH");
	}

	@When("^User enter the Billing_Address$")
	public void user_enter_the_Billing_Address() throws Throwable {
	inputofelement(POM.InstanceBookPage().getAddress(),"NO.6,dubai main road,ubai kuruku sandu ,DUBAI");
	}

	@When("^User enter the creditcard number$")
	public void user_enter_the_creditcard_number() throws Throwable {
	inputofelement(POM.InstanceBookPage().getCredit(),File_Reader.getinstance().getinstanceCR().credit_card_number());
	}

	@When("^User want to select Credit_card_Type$")
	public void user_want_to_select_Credit_card_Type() throws Throwable {
	String cc_type = File_Reader.getinstance().getinstanceCR().cc_type();
		dropdown(POM.InstanceBookPage().getCard_type(), "byvisibletext",cc_type);
	}

	@When("^User want to select CC_Month and CC_Year$")
	public void user_want_to_select_CC_Month_and_CC_Year() throws Throwable {
	dropdown(POM.InstanceBookPage().getCard_exp_month(),"byvisibletext",File_Reader.getinstance().getinstanceCR().cc_month());
	dropdown(POM.InstanceBookPage().getCard_exp_year(), "byvisibletext",File_Reader.getinstance().getinstanceCR().cc_year());
	}

	@When("^User want to CVV Number$")
	public void user_want_to_CVV_Number() throws Throwable {
	inputofelement(POM.InstanceBookPage().getCard_cvv(),File_Reader.getinstance().getinstanceCR().cvv());
	}

	@Then("^User click the BookNow Button$")
	public void user_click_the_BookNow_Button() throws Throwable {
	clickonelement(POM.InstanceBookPage().getBook_now());
	}

	
	
}
