package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	@FindBy (xpath="//a[text()=' Home']")
	public WebElement homepage;
	@FindBy (xpath = "//a[text()=' Signup / Login']")
	public WebElement signin_login;
	@FindBy (xpath="//h2[text()='Login to your account']")
	public WebElement login_to_your_acount;
	@FindBy (xpath="//input[@data-qa='login-email']")
	public WebElement login_Email;
	@FindBy (xpath="//input[@data-qa='login-password']")
	public WebElement login_password;
	@FindBy (xpath="//button[@data-qa='login-button']") 
	public WebElement login_button;
	@FindBy (xpath="//a[text()=' Logged in as ']") 
	public WebElement login;
	@FindBy (xpath="//a[text()=' Delete Account']")
	public WebElement delet_account;
	@FindBy (xpath="//b[contains(text(),'Account Deleted!')]") 
	
	public WebElement account_delet;
	@FindBy (xpath="//p[contains(text(),'is incorrect!')]") 
	public WebElement incorrect;
	@FindBy (xpath="//a[text()=' Logout']") 
	public WebElement logout;
	
	WebDriver driver;
	public LoginObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
