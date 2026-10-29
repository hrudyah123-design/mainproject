package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	@FindBy(id="user-name")
	WebElement user;
	@FindBy(id="password")
	WebElement pass;
	@FindBy(id="login-button")
	WebElement button;
	 public loginpage(WebDriver driver) 
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	public void start(String username,String password)
	{
		user.sendKeys(username);
		user.sendKeys(password);
		
	}
   public void login()
   {
	   button.click();
   }
}
