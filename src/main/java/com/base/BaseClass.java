package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	 static WebDriver driver;

	public static void browserLaunch(String values){
		if(values.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahal\\eclipse-workspace\\Selenium\\updatedchromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if (values.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahal\\eclipse-workspace\\Selenium\\updatedchromedriver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
	    }

   public static void getURL(String url){
	 driver.get(url);
	 }
   public static void clicks(WebElement click) {
	 click.click();   
     }
   public static void  maximize() {
	   driver.manage().window().maximize();
   }
   public static void getcurrentUrl(String currenturl) {
	   driver.getCurrentUrl();
	   
   }
   public static void close() {
	   driver.close();
   }
   public static void quit() {
	   driver.quit();
	   
   }
   public static void navigateTo(String values) {
	   
   }
   public static void navigateBack() {
	 driver.navigate().refresh();  
	     
   }
   public static void navigateforward() {
	   driver.navigate().forward();
   }
   public static void acceptAlert(String values) {
	  driver.switchTo().alert().accept(); 
   }
   public static void dismissAlert(String values) {
	   driver.switchTo().alert().dismiss();
   }
   
}

