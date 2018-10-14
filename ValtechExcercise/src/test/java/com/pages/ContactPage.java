package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.ObjectRepo;

public class ContactPage extends ObjectRepo {
	public void navigated_to_Contact_Page() {
		Assert.assertEquals("Contact", driver.findElement(By.xpath("//header[@class='page-header']//h1")).getText());
		System.out.println(
				"Excercise 3 b : " + driver.findElement(By.xpath("//header[@class='page-header']//h1")).getText()
						+ " page is successfully displayed");
	}

	public void output_of_total_Valtech_offices() {
		System.out.println("Total Number of Valtech Offices : "
				+ driver.findElements(By.cssSelector("h2[class='office__heading']")).size());
	}
}
