package pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public static WebDriver driver;
	
	public Loginpage(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}
    @FindBy(xpath = "//input[@suggestmobile='mobile-numbers']")
	private WebElement phonenumber; public WebElement getPhonenumber() {return phonenumber;}
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement network; public WebElement getNetwork() {return network;}
	

	@FindBy(xpath = "//li[@data-show='Telcel']")
	private WebElement telcel; public WebElement getTelcel() {return telcel;}
	

	@FindBy(xpath = "(//li[@class='category-suggest operator-plan'])[1]")
	private WebElement reachargeamount; public WebElement getReachargeamount() {return reachargeamount;}
	
	@FindBy(xpath = "(//button[@perform='payment'])[1]")
	private WebElement Siguiente ; public WebElement Siguiente () {return Siguiente;}
}
