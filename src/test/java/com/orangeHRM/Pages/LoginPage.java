package com.orangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	// Locators..
	By usename = By.name("username");
	By passwor = By.name("password");
	By login = By.xpath("//button[@type='submit']");
	By profile = By.xpath("//div[@class='oxd-brand-banner']");

	// By profile = By.xpath("//div[@class='oxd-sidepanel-body']//ul//li[1]//span");

	public void userName(String uid) {

		driver.findElement(usename).sendKeys(uid);
	}

	public void passWord(String pass) {
		driver.findElement(passwor).sendKeys(pass);
	}

	public void submit() {
		driver.findElement(login).click();
	}

	public boolean login() {
	return	driver.findElement(profile).isDisplayed();
	}
	/*
	 * public String profilePage() {
	 * 
	 * return driver.findElement(profile).getText(); }
	 */
}
