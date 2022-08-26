package pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	
	public static WebDriver driver;
	
	 public Payment(WebDriver driver2) {
		 this.driver= driver2;
			PageFactory.initElements(driver2, this);
			
		}
	
	@FindBy(id = "new-card-toggle")
	private WebElement Tarjeta; public WebElement getCard() {return Tarjeta;}
	
	
	@FindBy(xpath="//table[@class='table table-bordered']/tbody/tr/td")
	
	private WebElement usenewcard; public WebElement getUsenewcard() {return usenewcard;}

    @FindBy(id = "cardnumberunique")
	private WebElement cardnumber; public WebElement getCardnumber() {return cardnumber;}

	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[48]")
	private WebElement expmonth; public WebElement getExpmonth() {return expmonth;}

	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[49]")
	private WebElement expyear;	public WebElement getExpyear() {return expyear;}


	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[50]")
	private WebElement cvv; public WebElement getCvv() {return cvv;}

	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[51]")
	private WebElement email; public WebElement getEmail() {return email;}

	
	@FindBy(id="paylimit")
	private WebElement PaywithCard; public WebElement getPaywithCard() {return PaywithCard;}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
