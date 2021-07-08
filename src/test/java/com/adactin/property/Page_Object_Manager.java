package com.adactin.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.POM.Adactin_Book_Page;
import com.adactin.POM.Adactin_search_hotel;
import com.adactin.POM.Login_page;
import com.adactin.POM.adactin_Itinerary;
import com.adactin.POM.adactin_select_hotel;

public class Page_Object_Manager {

	
	public static WebDriver driver;
	
	private Login_page lp;
	
	private Adactin_search_hotel search;
 	
	private adactin_select_hotel select;
	
	private Adactin_Book_Page BP;
	
	private adactin_Itinerary Iteinerary;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	
	}
	public Login_page InstanceLogin() {
		lp=new Login_page(driver);
		return lp;
	}
	
	public Adactin_search_hotel InstanceSearch() {
		search=new Adactin_search_hotel(driver);
		return search;
	}
	
	public  Adactin_Book_Page InstanceBookPage() {
		BP=new Adactin_Book_Page(driver);
	return BP;
	}
	
	public adactin_select_hotel InstanceSelectHotel() {
		select=new adactin_select_hotel(driver);
		return select;
	}
	
	public adactin_Itinerary InstanceItinerary() {
		Iteinerary =new adactin_Itinerary(driver);
		return Iteinerary;
	}
	
	
	
	
	
}
