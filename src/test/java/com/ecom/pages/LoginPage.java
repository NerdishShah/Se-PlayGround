package com.ecom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.ecom.utils.Log;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "email")
	public static WebElement email;

	@FindBy(how = How.ID, using = "passwd")
	public static WebElement password;

	@FindBy(how = How.ID, using = "SubmitLogin")
	public static WebElement signin_button;

	@FindBy(how = How.ID, using = "email_create")
	public static WebElement email_create;

	@FindBy(how = How.ID, using = "SubmitCreate")
	public static WebElement submit_create;
	
	@FindBy(how = How.LINK_TEXT, using = "Sign out")
	public static WebElement sign_out;


	public AccountPage signInAs(String username, String pass) {
		email.sendKeys(username);
		Log.info(username + " is entered in UserName text box");
		password.sendKeys(pass);
		Log.info(pass + " is entered in Password text box");
		signin_button.click();
		Log.info("User credentials submitted");
		return new AccountPage(driver);

	}
	
	public LoginPage signOut() {
		sign_out.click();
		Log.info("Sign out is performed");
		Reporter.log("Sign out is performed");
		return this;
	}

}
