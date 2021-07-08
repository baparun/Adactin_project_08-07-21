package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.BASE.Base_Class;
import com.adactin.property.File_Reader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
                 glue ="com\\adactin\\stepdefinition",
                 monochrome = true, //To avoid special characters
                // tags="~@arun" , //  tags = {"@arun , @Arun1"}
                // format  = {"pretty","html:test-outout","json:json_output/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"},
                 dryRun=false,
                 plugin={"pretty","com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html",
                		 "json:Report/CucumberReport.json"}
                
                 
		
		)
public class Runner extends RuntimeException{

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws Throwable {
		String getbrowser = File_Reader.getinstance().getinstanceCR().getbrowser();
		driver =Base_Class.getbrowser(getbrowser);
		//driver =Base_Class.getbrowser("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public static void teardown()  {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	

	
	
	
	
	
	
	
}
