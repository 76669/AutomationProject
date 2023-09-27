package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactFormObjects {

	@FindBy (xpath="//h2[text()='Get In Touch']")
	public WebElement getintuch;
	@FindBy (xpath = "//a[text()=' Contact us']")
	public WebElement contactus;
	@FindBy (xpath = "//input[@data-qa='name']")
	public WebElement name;
	@FindBy (xpath = "//input[@data-qa='email']")
	public WebElement email;
	@FindBy (xpath = "//input[@data-qa='subject']")
	public WebElement subject;
	@FindBy (xpath = "//textarea[@id='message']")
	public WebElement message;
	@FindBy (xpath = "//input[@name='upload_file']")
	public WebElement fileupload;
	@FindBy (xpath = "//input[@name='submit']") 
	public WebElement submit;
	@FindBy (xpath = "(//div[contains(text(),'Success! Your details ')])[1]") 
	public WebElement successmessage;
	@FindBy (xpath = "//a//span[text()=' Home']") 
	public WebElement home;
	
	WebDriver driver;
	
	public ContactFormObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
