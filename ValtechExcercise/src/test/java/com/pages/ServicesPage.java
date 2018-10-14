package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.ObjectRepo;

public class ServicesPage extends ObjectRepo {
	public void navigated_to_Services_page() {
		Assert.assertEquals("Services", driver.findElement(By.xpath("//header[@class='page-header']//h1")).getText());
		System.out.println(
				"Excercise 3 a : " + driver.findElement(By.xpath("//header[@class='page-header']//h1")).getText()
						+ " page is successfully displayed");
	}
}
