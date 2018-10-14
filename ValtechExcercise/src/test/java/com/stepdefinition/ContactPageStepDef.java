package com.stepdefinition;

import com.pages.ContactPage;

import cucumber.api.java.en.Then;

public class ContactPageStepDef extends ContactPage {
	@Then("^I shall be navigated to Contact Page$")
	public void i_shall_be_navigated_to_Contact_Page() throws Throwable {
		navigated_to_Contact_Page();
	}

	@Then("^I shall get the output of total Valtech offices$")
	public void i_shall_get_the_output_of_total_Valtech_offices() throws Throwable {
		output_of_total_Valtech_offices();
	}
}
