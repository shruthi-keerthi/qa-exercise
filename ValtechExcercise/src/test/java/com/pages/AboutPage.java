package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.ObjectRepo;

public class AboutPage extends ObjectRepo {
	public void navigated_to_About_page() {
		Assert.assertEquals("About", driver.findElement(By.xpath("//div[@class='page-header']//h1")).getText());
		System.out
				.println("Excercise 3 a : " + driver.findElement(By.xpath("//div[@class='page-header']//h1")).getText()
						+ " page is successfully displayed");
	}

	public void click_ourOffices() {
		driver.findElement(By.cssSelector("a[href='/about/contact-us/']")).click();
	}

	public void click_Our_offices_link() {
		driver.findElement(By.cssSelector("a[href='/about/contact-us/']")).click();
	}
}
