package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup {

	@FindBy (xpath="//a[text()=' Home']") 
	public WebElement home_page;
	@FindBy (xpath="//h2[text()='New User Signup!']") 
	public WebElement new_user;
	@FindBy (xpath="//input[@data-qa='signup-name']") 
	public WebElement signup_name;
	@FindBy (xpath = "//input[@data-qa='signup-email']") 
	public WebElement signup_email;
	@FindBy (xpath="//button[@data-qa='signup-button']")
	public WebElement signup_button;
	@FindBy (xpath="//b[text()='Enter Account Information']") 
	public WebElement account_information;
	@FindBy (id ="id_gender1") 
	public WebElement gender_1;
	@FindBy (id ="id_gender2") 
	public WebElement gender_2;
	@FindBy (xpath="//input[@id='name']") 
	public WebElement name;
	@FindBy (xpath="//input[@id='email']")
	public WebElement email;
	@FindBy (xpath="//input[@id='password']")
	public WebElement password;
	@FindBy (id = "days") 
	public WebElement DOB_day;
	@FindBy (id="months") 
	public WebElement DOB_month;
	@FindBy (id="years") 
	public WebElement DOB_year;
	@FindBy (id = "newsletter") 
	public WebElement news;
	@FindBy (id="optin") 
	public WebElement offer;
	@FindBy (id="first_name")
	public WebElement first_name;
	@FindBy (id="last_name")
	public WebElement last_name;
	@FindBy (id="company")
	public WebElement company;
	@FindBy (id = "address1") 
	public WebElement address_1;
	@FindBy (id="address2") 
	public WebElement address_2;
	@FindBy (id="country") 
	public WebElement country;
	@FindBy (id="state")
	public WebElement state;
	@FindBy (id="city")
	public WebElement city;
	@FindBy (id="zipcode") 
	public WebElement zipcode;
	@FindBy (id = "mobile_number") 
	public WebElement mobile_number;
	@FindBy (xpath="//button[@data-qa='create-account']")
	public WebElement create_account;
	@FindBy (xpath="//b[text()='Account Created!']") 
	public WebElement account_crated;
	@FindBy (xpath = "//a[text()='Continue']") 
	public WebElement Continue;
	@FindBy (xpath="//a[contains(text(),' Logged in as ')]") 
	public WebElement logges_in;
	@FindBy (xpath = "//a[contains(text(),' Delete Account')]") 
	public WebElement delet_account;
	@FindBy (xpath="//b[contains(text(),'Account Deleted!')]") 
	public WebElement accont_deleted_text;
	@FindBy (xpath = "//a[text()=' Signup / Login']") 
	public WebElement signin_login;
	@FindBy (xpath = "//p[contains(text(),'already exist!')]")
	public WebElement account_alredy_exit;
	
	WebDriver driver;
	
	public SignUpObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
