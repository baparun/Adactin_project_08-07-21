package com.adactin.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Book_Page {

	 public static WebDriver driver;
	public Adactin_Book_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	
	
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public WebElement getCard_exp_month() {
		return card_exp_month;
	}

	public WebElement getCard_exp_year() {
		return card_exp_year;
	}

	public WebElement getCard_cvv() {
		return card_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	@FindBy (name="first_name")
	private WebElement first_name ;
    
	@FindBy (name="last_name")
	private WebElement last_name ;
    
	@FindBy (name="address")
	private WebElement  address;

	@FindBy (name="cc_num")
	private WebElement credit;

	@FindBy (name="cc_type")
	private WebElement card_type;
	
	@FindBy (name="cc_exp_month")
	private WebElement card_exp_month;
	
	@FindBy (name="cc_exp_year")
	private WebElement card_exp_year;
	
	@FindBy (name="cc_cvv")
	private WebElement card_cvv ;
	
	@FindBy (name="book_now")
	private WebElement book_now ;





}
