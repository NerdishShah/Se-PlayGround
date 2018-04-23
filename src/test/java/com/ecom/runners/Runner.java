package com.ecom.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com.ecom.stepDefinitions", plugin = { "pretty",
		"html:target/cucumber-html-report",
		"json:target/cucumber.json" }, monochrome = true, dryRun = false, strict = true, snippets = SnippetType.CAMELCASE, tags = {})
public class Runner {

}