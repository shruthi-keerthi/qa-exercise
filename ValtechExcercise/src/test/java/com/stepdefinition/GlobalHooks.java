package com.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.ObjectRepo;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GlobalHooks extends ObjectRepo {
	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void close() {
		driver.quit();
	}
}
