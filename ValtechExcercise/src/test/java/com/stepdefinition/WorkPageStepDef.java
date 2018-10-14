package com.stepdefinition;

import com.pages.WorkPage;

import cucumber.api.java.en.Then;

public class WorkPageStepDef extends WorkPage {
	@Then("^I shall be navigated to Work page$")
	public void i_shall_be_navigated_to_Work_page() throws Throwable {
		navigated_to_Work_page();
	}
}
