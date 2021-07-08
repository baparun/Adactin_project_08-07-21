package com.adactin.BASE;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Base_Class { 
	
	public static WebDriver driver;

	//1.	Browser launch()

	public static WebDriver getbrowser(String browser) {
			try {
				if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
					 driver=new	ChromeDriver();	
				}else if (browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir"+"\\Driver\\firefoxdriver.exe"));
					 driver=new	FirefoxDriver();	
				}else if (browser.equalsIgnoreCase("edge")) {
					System.setProperty("webdriver.edge.driver", System.getProperty("user.dir"+"\\Driver\\edgedriver.exe"));
					 driver=new	EdgeDriver();	
				}else {
					System.out.println("INVALID BROWSER");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			return driver;
		}
	//21.	Get current url 	
	public static void geturl(String url) {
			driver.get(url);
		}
	//27.	Sendkeys	
	public static void inputofelement(WebElement element,String value) {
			element.sendKeys(value);
		}
	//31.	Click()

		public static void clickonelement(WebElement element) {
			element.click();
		}	
	//31.	Clear()

		public static void clearonclick(WebElement element) {
		element.clear();
		}
		
	//14.	Drop down 
		
		public static void dropdown(WebElement element,String option,String value) {
			Select s=new Select(element);
			try {
				if (option.equalsIgnoreCase("byindex")) {
					int parseInt = Integer.parseInt(value);
					s.selectByIndex(parseInt);	
				}else if (option.equalsIgnoreCase("byvalue")) {
					s.selectByValue(value);
				}else if (option.equalsIgnoreCase("byvisibletext")) {
					s.selectByVisibleText(value);
				}else {
					System.out.println("INVALID SELECTION");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
		}
		

	//25.	Take screenshot
	public static void screenshot() throws Throwable {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\MadhanMohan B\\eclipse-workspace\\Adactin_Project\\screenshot");
		FileUtils.copyFileToDirectory(source, target);
	}

	//2.	Close()
	public static void close() {
		driver.close();
	}


	//3.	Quit()
	public static void quit() {
	driver.quit();
	}
	//4.	Navigate to
	public static void to(String url) {
		driver.navigate().to(url);
	}
	//5.	Navigate back
	public static void back() {
		driver.navigate().back();
	}
	//6.	Navigate forward 
	public static void navigateforward() {
		driver.navigate().forward();
	}


	//7.	Navigate refresh
	public static void navigateRefresh() {
			driver.navigate().refresh();
		}
	//8.	Get 

	//9.	Alert{simple(ACCEPT),confirm(ACCEPT,DISMISS),prompt(VALUE,ACCEPT,DISMISS)}
	public static void alert(String alert) {

		if (alert.equalsIgnoreCase("accept")) {
		    
			driver.switchTo().alert().accept();
		}else if (alert.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}
	public static void SendkeysAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
	}













	//10.	Action
	//11.	Frames
	//12.	Robot
	//13.	Window handles

	//15.	Check box
	//16.	Is enable
	//17.	Is displayed
	//18.	Is selected
	//19.	Get options 
	//20.	Get title

	//22.	Get text 
	//23.	Get attribute
	//24.	Wait(3)

	//26.	Scroll up and down

	//28.	Get first selected options()
	//29.	Get all selected options()
	//30.	Is multiple()


}
