package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.ObjectRepo;

public class WorkPage extends ObjectRepo {
	public void navigated_to_Work_page() {
		Assert.assertEquals("Work", driver.findElement(By.xpath("//header[@class='page-header']//h1")).getText());
		System.out.println(
				"Excercise 3 a : " + driver.findElement(By.xpath("//header[@class='page-header']//h1")).getText()
						+ " page is successfully displayed");
	}
}
