package com.adactin.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adactin_select_hotel {

	public static WebDriver driver;
	
	public adactin_select_hotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	@FindBy (name="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy (name="continue")
    private WebElement continuee;
	
	

}
