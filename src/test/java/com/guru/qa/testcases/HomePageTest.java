package com.guru.qa.testcases;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru.qa.base.GuruTestBase;
import com.guru.qa.pages.HomePage;

//Author @ShaheenM 

public class HomePageTest extends GuruTestBase{
	HomePage homePage;

	public HomePageTest() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void homePageTitleTest() {
		String pageTitle = homePage.validateTitle();
		Assert.assertEquals(pageTitle, "Guru99 is totally new kind of learning experience.");
		String pageTitleColor = homePage.validateTitleColor();
		Assert.assertEquals(pageTitleColor, "rgba(5, 86, 243, 1)");
	}
	
	@Test(priority=2)
	public void validateGuruLogoTest() {
		boolean flag = homePage.validateGuruLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=0)
	public void validateListOfTutorialsTest() {
		homePage.validateListOfTutorials();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
