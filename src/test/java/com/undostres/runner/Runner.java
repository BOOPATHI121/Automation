package com.undostres.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.com.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features ="src\\test\\java\\com\\undostres\\feature",glue="com\\undostres\\stepdefinition" )


	public class Runner {
		
	public static WebDriver driver;
	
	@BeforeClass
	public static void browserLaunch() {
		driver=BaseClass.getDriver("chrome");
	}
	
	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
		  

}
