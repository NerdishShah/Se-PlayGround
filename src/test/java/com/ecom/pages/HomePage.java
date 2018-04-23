package com.ecom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.ecom.utils.Log;

public class HomePage extends BasePage {

	private static final String baseUrl = "http://automationpractice.com";

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	public static WebElement sign_in;

	@FindBy(how = How.LINK_TEXT, using = "Contact us")
	public static WebElement contact_us;

	
	public static class HeaderPage {

		@FindBy(how = How.LINK_TEXT, using = "Women")
		public static WebElement menu_women;

		@FindBy(how = How.XPATH, using = "//*a[@title='Dresses']")
		public static WebElement menu_dresses;

		@FindBy(how = How.XPATH, using = "//*a[@title='T-shirts']")
		public static WebElement menu_tshirts;

		public static class DressesPage {

			@FindBy(how = How.XPATH, using = "//*a[@title='Summer Dresses']")
			public static WebElement summer_dresses;

		}

	}

	public HomePage goTo() {
		driver.get(baseUrl);
		return this;
	}

	public LoginPage signIn() {
		sign_in.click();
		Log.info("Sign in from home page is clicked");
		return new LoginPage(driver);
	}

}
