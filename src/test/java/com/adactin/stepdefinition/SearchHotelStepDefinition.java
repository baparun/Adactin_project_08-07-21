package com.adactin.stepdefinition;

import com.adactin.BASE.Base_Class;
import com.adactin.POM.Adactin_search_hotel;
import com.adactin.property.Page_Object_Manager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelStepDefinition extends Base_Class{

//Adactin_search_hotel sh=new Adactin_search_hotel(driver);
	
Page_Object_Manager POM=new Page_Object_Manager(driver);
	
	@When("^User want to select location$")
	public void user_want_to_select_location() throws Throwable {
	//dropdown(sh.getLocation(),"byvisibletext","Melbourne");
		dropdown(POM.InstanceSearch().getLocation(),"byvisibletext","Melbourne");
	}

	@When("^User want to select Hotel$")
	public void user_want_to_select_Hotel() throws Throwable {
	//dropdown(sh.getHotels(),"byvisibletext","Hotel Hervey");
		dropdown(POM.InstanceSearch().getHotels(),"byvisibletext","Hotel Hervey");
	}

	@When("^User want to select RoomType$")
	public void user_want_to_select_RoomType() throws Throwable {
	//dropdown(sh.getRoom_type(),"byvisibletext","Double");
		dropdown(POM.InstanceSearch().getRoom_type(),"byvisibletext","double");
	}

	@When("^User want to select number of rooms$")
	public void user_want_to_select_number_of_rooms() throws Throwable {
	//dropdown(sh.getRoom_nos(),"byvalue","6");
		dropdown(POM.InstanceSearch().getRoom_nos(),"byvalue","6");
	}

	@When("^User want to select CheckIn date$")
	public void user_want_to_select_CheckIn_date() throws Throwable {
	//inputofelement(sh.getDatepick_in(),"23/06/2021");
		inputofelement(POM.InstanceSearch().getDatepick_in(),"23/06/2021");
	}

	@When("^User want to select CheckOut date$")
	public void user_want_to_select_CheckOut_date() throws Throwable {
	//inputofelement(sh.getDatepick_out(),"24/06/2021");
		inputofelement(POM.InstanceSearch().getDatepick_out(),"24/06/2021");
	}

	@When("^User want to select Adult per Room$")
	public void user_want_to_select_Adult_per_Room() throws Throwable {
	//dropdown(sh.getAdult_room(), "byvalue","3");
		dropdown(POM.InstanceSearch().getAdult_room(), "byvalue","3");
	}

	@When("^User want to select Children per Room$")
	public void user_want_to_select_Children_per_Room() throws Throwable {
	//dropdown(sh.getChild_room(),"byvalue","2");
		dropdown(POM.InstanceSearch().getChild_room(),"byvalue","2");
	}

	@When("^user click Search button$")
	public void user_click_Search_button() throws Throwable {
	//	clickonelement(sh.getSubmit());
		clickonelement(POM.InstanceSearch().getSubmit());
	}

	@Then("^User validate the search$")
	public void user_validate_the_search() throws Throwable {
	}

}
