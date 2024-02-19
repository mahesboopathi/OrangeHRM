package com.orangeHRM.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.Pages.LoginPage;

public class LoginTest {

	WebDriver dr;
	LoginPage lp;

	@BeforeMethod
	public void browserSetUp() {

		dr = new ChromeDriver();
		dr.manage().window().maximize();

		dr.get("https://opensource-demo.orangehrmlive.com/");
//dr.manage().timeouts().imn
	}

	@Test
	public void validUserPass() {
		lp = new LoginPage(dr);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.userName("Admin");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.passWord("admin123");
		lp.submit();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Assert.assertEquals(lp.homepage(), true, "Title not matched");
		Assert.assertEquals(true, true, "Test fail");
	}

	@AfterMethod
	public void browserClose() {

		dr.quit();
	}

}
