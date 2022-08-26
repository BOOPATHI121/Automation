package pageobject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.com.Loginpage;
import pom.com.Payment;
import pom.com.PopupPage;



public class PageObjectManager {
	
	public WebDriver driver;
	
	   private Loginpage lp;
	   private Payment pa;
	   private PopupPage pp;
	   
	   
	   
	    public PageObjectManager(WebDriver driver2) {
		   this.driver= driver2;
			PageFactory.initElements(driver2, this);
	}

	public Loginpage getLoginPage() {
		   lp=new Loginpage(driver);
		   return lp;
	   }
	
	   public Payment getPayment() {
		   pa=new Payment(driver);
		   return pa;
	   }
	   public PopupPage getPopupPage() {
		   pp=new PopupPage (driver);
		   return pp;
	   }
	
	
	
	
	
	
	
	
	
	
	

}
