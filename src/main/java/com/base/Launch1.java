package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Launch1 extends BaseClass {
	
		public static void main(String[] args) {
			browserLaunch("chrome");
			getURL("https://www.amazon.in");
			driver.manage().window().maximize();
			WebElement HK = driver.findElement(By.xpath("//a[text()='Mobiles']"));
			HK. click();
			driver.close();
//            driver.getCurrentUrl();
//            driver.navigate().back();
			
		}
		
      }
		