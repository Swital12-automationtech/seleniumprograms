package packageofamazon.Project_Maven_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product1_AddPage
	{
	//step 1
		WebDriver driver;
		//step 1
		@FindBy(id="add-to-wishlist-button-submit")
		WebElement productwishlist;
		@FindBy(xpath = "//span[@class='a-button a-button-span12 a-button-primary']")
		WebElement continueshopping;
		@FindBy(xpath= "//input[@name='submit.add-to-cart']")
		WebElement addtocart;
	
	//step 2
	public void productaddtowishlist()
	{
		productwishlist.click();
	}
	public void productcontinueshop()
	{
		continueshopping.click();
	}
	public void productaddtocart() throws InterruptedException
	{
		Thread.sleep(2000);
		addtocart.click();
		/*Actions a1 = new Actions(driver);
		a1.doubleClick(addtocart).click().perform();*/
		
	}
	//step 3
	public Product1_AddPage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	}
