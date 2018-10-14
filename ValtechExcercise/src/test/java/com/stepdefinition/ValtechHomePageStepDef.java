package com.stepdefinition;

import com.pages.ValtechHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValtechHomePageStepDef extends ValtechHomePage {
	@Given("^I am in homepage$")
	public void i_am_in_homepage() throws Throwable {
		homepage();
	}

	@Then("^I shall see the recent blogs section$")
	public void i_shall_see_the_recent_blogs_section() throws Throwable {
		recent_blogs_section();
	}

	@When("^I click on first blog article$")
	public void i_click_on_first_blog_article() throws Throwable {
		click_first_blog_article();
	}

	@Then("^I shall see the first blog article$")
	public void i_shall_see_the_first_blog_article() throws Throwable {
		assert_the_first_blog_article();
	}

	@When("^I click on About$")
	public void i_click_on_About() throws Throwable {
		click_on_About();
	}

	@When("^I click on Services$")
	public void i_click_on_Services() throws Throwable {
		click_on_Services();
	}

	@When("^I click on Work$")
	public void i_click_on_Work() throws Throwable {
		click_on_Work();
	}
}
