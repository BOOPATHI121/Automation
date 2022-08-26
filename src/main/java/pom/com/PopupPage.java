package pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupPage {
	
	public static WebDriver driver;
	
	public PopupPage(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}


	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement email; public WebElement getEmail() {return email;}

	
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	private WebElement Password; public WebElement getPassword() {return Password;}
	
	@FindBy(xpath = "(//iframe[@role='presentation'])[1]")
	private WebElement frames; public WebElement getFrames() {return frames;}

	
	@FindBy(id = "recaptcha-anchor")
	private WebElement robot ; public WebElement getRobot() { return robot;}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement access; public WebElement getAccess() {return access;}


	
	
	
	
	
	
	
	
	
	
	
	

}
