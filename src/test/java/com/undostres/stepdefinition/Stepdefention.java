package com.undostres.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.undostres.runner.Runner;

import baseclass.com.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.com.PageObjectManager;



public class Stepdefention extends BaseClass {
	
	public static PageObjectManager p;
	
	public WebDriver driver=Runner.driver;
	
	@Given("undostres Webpage launched")
	public void undostres_webpage_launched() {
		
		getUrl("https://undostres.com.mx/");
		System.out.println("The Application is on main page");
		 p = new PageObjectManager(driver);
		
		}
	@When("user need to  Cell phone number in Cell phone number field")
	public void user_need_to_cell_phone_number_in_cell_phone_number_field() {
		sendkeys(p.getLoginPage().getPhonenumber(), "8465433546");
	   
	}
	@When("User need to click  the network field")
	public void user_need_to_click_the_network_field() {
		clickOnElement(p.getLoginPage().getNetwork());
	    
	}
	@When("User need to select the network type  in network field")
	public void user_need_to_select_the_network_type_in_network_field() {
		clickOnElement(p.getLoginPage().getTelcel());
	}
	@When("user need to select the Recharge Balance amount")
	public void user_need_to_select_the_recharge_balance_amount() {
		 clickOnElement(p.getLoginPage().getReachargeamount());
	}
	@When("user clicks on Following button")
	public void user_clicks_on_following_button() {
		 clickOnElement(p.getLoginPage().Siguiente());
	}

	@Given("The Application is on payment page")
	public void the_application_is_on_payment_page() throws IOException {
		System.out.println("The Application is on payment page");
		screenshot("C:\\Users\\boopathi\\eclipse-workspace\\Undostres_Testing\\ScreenShot\\paymentpage.png");
	    
	}
	@When("User need to click the Tarjeta")
	public void user_need_to_click_the_tarjeta() {
		clickOnElement(p.getPayment().getCard());
	    
	}
	@When("User need to click the Usar nueva tarjeta")
	public void user_need_to_click_the_usar_nueva_tarjeta() throws InterruptedException {
		Thread.sleep(5000);
		clickOnElement(p.getPayment().getUsenewcard());
	}
	@When("User need to enter the card number")
	public void user_need_to_enter_the_card_number() throws InterruptedException {
		Thread.sleep(5000);
		sendkeys(p.getPayment().getCardnumber(), "4111111111111111");
	    
	}
	@When("User need to enter the exp month")
	public void user_need_to_enter_the_exp_month() {
		sendkeys(p.getPayment().getExpmonth(),"11");
	}
	@When("User need to enter the exp year")
	public void user_need_to_enter_the_exp_year() {
		sendkeys(p.getPayment().getExpyear(), "25");
	}
	@When("User need to enter cvv number")
	public void user_need_to_enter_cvv_number() {
		sendkeys(p.getPayment().getCvv(), "111");
	
	}
	   
	@When("User need to enter emailid")
	public void user_need_to_enter_emailid() {
		sendkeys(p.getPayment().getEmail(), "test@test.com");
	   
	}
	@Then("User need to click the Pay with Card")
	public void user_need_to_click_the_pay_with_card() throws InterruptedException {
		Thread.sleep(5000);
		clickOnElement(p.getPayment().getPaywithCard());
	    
	}
	
	@Given("Application is on accountpage page")
	public void application_is_on_accountpage_page() {
		System.out.println("Application is on accountpage page");
	   	}
	
	@When("user need to enter the email id")
	public void user_need_to_enter_the_email_id() {
		  sendkeys(p.getPopupPage().getEmail(), "automationexcersise@test.com");
		
		
	    
	}
	@When("user need to enter password")
	public void user_need_to_enter_password() {
		sendkeys(p.getPopupPage().getPassword(), "123456");
	    
	}
	@When("user need click the reCAPTCHA")
	public void user_need_click_the_re_captcha() {
		WebElement single = driver.findElement(By.xpath("(//iframe[@title='reCAPTCHA'])[1]"));
		driver.switchTo().frame(single);
		WebElement box =driver.findElement(By.id("recaptcha-anchor-label"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", box);
		clickOnElement(p.getPopupPage().getRobot());
	    
	}
	@Then("user need to click the access")
	public void user_need_to_click_the_access() throws IOException {
		driver.switchTo().defaultContent();
		clickOnElement(p.getPopupPage().getAccess());
		screenshot("C:\\Users\\boopathi\\eclipse-workspace\\Undostres_Testing\\ScreenShot\\popupage.png");
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	 
}