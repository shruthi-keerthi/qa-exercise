package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.ObjectRepo;

public class ValtechHomePage extends ObjectRepo {
	String BaseURL = "https://www.valtech.co.uk/";

	public void homepage() {
		driver.get(BaseURL);
		if (driver.findElements(By.cssSelector("#CybotCookiebotDialogBodyButtonAccept")).size() > 0) {
			driver.findElement(By.cssSelector("#CybotCookiebotDialogBodyButtonAccept")).click();
		}
	}

	public void recent_blogs_section() {
		Assert.assertEquals("RECENT BLOGS",
				driver.findElement(By.cssSelector(".startpage__bloglisting .block-header__heading")).getText());
		System.out.println("Excercise 2 a: "
				+ driver.findElement(By.cssSelector(".startpage__bloglisting .block-header__heading")).getText()
				+ " section is displyed");
	}

	public void click_first_blog_article() {
		driver.findElements(By.cssSelector(".bloglisting__item__heading")).get(0).click();
	}

	public void assert_the_first_blog_article() {
		Assert.assertEquals("Where Experiences are Engineered - Valtech", driver.getTitle());
		System.out.println("Excercise 2 b: Page title is displayed as : " + driver.getTitle());
	}

	public void click_on_About() {
		driver.findElements(By.cssSelector(".navigation__menu__item")).get(0).click();
	}

	public void click_on_Services() {
		driver.findElements(By.cssSelector(".navigation__menu__item")).get(2).click();
	}

	public void click_on_Work() {
		driver.findElements(By.xpath("//li[@class='navigation__menu__item']//a")).get(1).click();
	}

}
