package com.ecom.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	
	
	public static WebDriver driver;
//	public static boolean bResult;

	public  BasePage(WebDriver driver){
		BasePage.driver = driver;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		BaseClass.bResult = true;
	}

}
