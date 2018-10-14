package com.stepdefinition;

import com.pages.AboutPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AboutPageStepDef extends AboutPage {
	@Then("^I shall be navigated to About page$")
	public void i_shall_be_navigated_to_About_page() throws Throwable {
		navigated_to_About_page();
	}

	@When("^I click on Our offices link$")
	public void i_click_on_Our_offices_link() throws Throwable {
		click_Our_offices_link();
	}
}
