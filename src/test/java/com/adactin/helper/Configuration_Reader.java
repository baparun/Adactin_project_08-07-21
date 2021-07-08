package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
 
	
	public static Properties p;
	
	public  Configuration_Reader() throws Throwable {
	File f=new File("C:\\Users\\MadhanMohan B\\eclipse-workspace\\Adactin_Project\\src\\test\\java\\com\\adactin\\property\\Configure.properties");
	FileInputStream fis= new FileInputStream(f);
	p = new Properties();
	p.load(fis);
 }
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public  String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	public String cc_type() {
		String cc_type = p.getProperty("cc_type");
		return cc_type;
	}
	
	public String cc_month() {
		//p.getProperty("cc_month");
		return p.getProperty("cc_month");
	}
	public String cc_year() {
		String cc_year = p.getProperty("cc_year");
		return cc_year;
	}

	public String cvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	public String credit_card_number() {
		String credit_card_number = p.getProperty("credit_card_number");
		return credit_card_number;
	}
	
	
}
