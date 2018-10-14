package com.stepdefinition;

import com.pages.ServicesPage;

import cucumber.api.java.en.Then;

public class ServicesPageStepDef extends ServicesPage {
	@Then("^I shall be navigated to Services page$")
	public void i_shall_be_navigated_to_Services_page() throws Throwable {
		navigated_to_Services_page();
	}
}
