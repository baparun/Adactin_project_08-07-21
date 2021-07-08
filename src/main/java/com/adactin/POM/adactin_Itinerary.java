package com.adactin.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adactin_Itinerary {

	public static WebDriver driver;
	
	@FindBy (name="my_itinerary")
	private WebElement Itinerary;
	
	@FindBy (name="logout")
	private WebElement logout;

	public adactin_Itinerary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getItinerary() {
		return Itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
}
