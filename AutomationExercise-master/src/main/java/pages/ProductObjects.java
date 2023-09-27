package pages;

import java.util.List;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductObjects {	
	
	@FindBy(xpath  = "//a[text()=' Products']")
	)public WebElement products;
	@FindBy(xpath  = "//h2[text()='All Products']")
	public WebElement all_prodTxt;
	@FindBy(xpath = "//div[@class='features_items']")
	public WebElement produc_tlist;
	@FindBy(xpath = "(//a[text()='View Product'])[1]")
	public WebElement view_product;
	@FindBy (xpath = "//h2[text()='Blue Top']")
	public WebElement product_name;
	@FindBy (xpath = "//p[text()='Category: Women > Tops']")
	public WebElement catogory_of_product;
	@FindBy (xpath = "//span[text()='Rs. 500']")
	public WebElement price;
	@FindBy (xpath = "//p[text()=' In Stock']")
	public WebElement avilable;
	@FindBy (xpath = "//p[text()=' New']")
	public WebElement condition_of_product;
	@FindBy (xpath = "//p[text()=' Polo']")
	public WebElement brand;
	@FindBy (xpath = "//a[@href='/product_details/1']")
	public WebElement detail_of_product;
	@FindBy (id = "quantity")
	public WebElement quantitys;
	@FindBy (xpath = "//button[@class='btn btn-default cart']") 
	public WebElement add_to_cart;
	
	// Quantity 
		@FindBy (xpath = "//button[@class='disabled' and text()='1']")
	public WebElement product_quantity;
	
	//Search Products
	@FindBy (id = "search_product")
	public WebElement searchProd;
	@FindBy (id = "submit_search")
	public WebElement submit;
	@FindBy (xpath = "//h2[text()='Searched Products']")
	public WebElement seaarch_product;
	
	//Add to cart
	@FindBy(xpath = "//a[@data-product-id='1']/preceding-sibling::img")
	public WebElement first_product;
	@FindBy(xpath = "//div[@class='overlay-content']//a[@data-product-id='1']")
	public WebElement first_product_add_to_cart;
	@FindBy(xpath = "//a[@data-product-id='2']/preceding-sibling::img")
	public WebElement second_product;
	@FindBy(xpath = "//div[@class='overlay-content']//a[@data-product-id='2']")
	public WebElement second_prod_add_to_cart;
	@FindBy (xpath = "(//a[@data-product-id='1'])[1]")
	public WebElement first_prodcut_addto_cart;
	@FindBy (xpath = "(//a[@data-product-id='2'])[1]")
	public WebElement second_prodcut_addto_cart;
	@FindBy (xpath = "(//button[text()='Continue Shopping'])[1]")
	public WebElement continue_shopping;
	@FindBy (xpath = "(//u[text()='View Cart'])") 
	public WebElement view_cart;
	
	// Product details in cart 1st
	@FindBy (xpath = "//button[@class='disabled' and text()='1']")
	public List<WebElement> quantity;
	@FindBy (xpath = "//p[text()='Rs. 500']")
	public WebElement price;
	@FindBy (xpath = "//img[@src='get_product_picture/1']")
	public WebElement product_image;
	@FindBy (xpath = "//p[text()='Women > Tops']")
	public WebElement product_catogrory;
	@FindBy (xpath = "//a[text()='Blue Top']")
	public WebElement product_name;
	@FindBy (xpath = "//p[@class='cart_total_price' and text()='Rs. 500']")
	public WebElement total_price;
	@FindBy (xpath = "//a[@class='cart_quantity_delete' and @data-product-id='1']/i")
	public WebElement item_delet;
	@FindBy (xpath = "//p[@class='text-center']")
	public WebElement empty_cart;
	
	// Product details in cart 2nd
	@FindBy (xpath = "//p[text()='Rs. 400']")
	public WebElement price;
	@FindBy (xpath = "//img[@src='get_product_picture/2']")
	public WebElement prodcut_image_2nd;
	@FindBy (xpath = "//p[text()='Men > Tshirts']")
	public WebElement product_catogrory_2nd;
	@FindBy (xpath = "//a[text()='Men Tshirt']")
	public WebElement product_name_2nd;
	@FindBy (xpath = "//p[@class='cart_total_price' and text()='Rs. 400']")
	public WebElement total_price_2nd;
	@FindBy (xpath = "//a[@class='cart_quantity_delete' and @data-product-id='2']/i")
	public WebElement item_delet_2nd;
	
	WebDriver driver;
	public ProductObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
