package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class subscription {

	@FindBy(id = "susbscribe_email")
	public WebElement susbscribe_email;
	@FindBy(id = "subscribe")
	public WebElement subscribe;
	@FindBy(xpath = "//h2[text()='Subscription']")
	public WebElement subscription_text;
	@FindBy (xpath = "//div[text()='You have been successfully subscribed!']")
	public WebElement subscription;
	@FindBy (xpath = "//a[text()=' Cart']")
	public WebElement cart;
	@FindBy (xpath = "//span[text()='Required']")
	public List<WebElement> errormessage;
	@FindBy (xpath = "//p[@class='oxd-userdropdown-name']")
	public WebElement user_dropdown;
	@FindBy (xpath = "//a[text()='Logout']")
	public WebElement logout;
	
	WebDriver driver;
	public SubscriptionObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
