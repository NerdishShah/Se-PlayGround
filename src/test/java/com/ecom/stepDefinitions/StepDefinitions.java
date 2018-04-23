package com.ecom.stepDefinitions;

import com.ecom.pages.AccountPage;
import com.ecom.pages.HomePage;
import com.ecom.pages.LoginPage;
import com.ecom.utils.PropReader;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	HomePage homePage;
	LoginPage loginPage;
	AccountPage accountPage;
	PropReader propReader;

	public StepDefinitions() {
		homePage = new HomePage(Hooks.getDriver());
		propReader = new PropReader("config.properties");
	}

	@When("^I open automationpractice website$")
	public void iOpenAutomationpracticeWebsite() throws Throwable {
		homePage.goTo();
	}

	@When("^I sign in$")
	public void iSignIn() throws Throwable {
		loginPage = homePage.signIn();
		accountPage = loginPage.signInAs(propReader.getProperty("username"), propReader.getProperty("password"));
	}

	@Then("^I sign out$")
	public void iSignOut() throws Throwable {
		loginPage.signOut();
	}

}