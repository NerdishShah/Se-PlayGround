package com.ecom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
