package packageofamazon.Project_Maven_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage 
{
//step 1
@FindBy(xpath ="(//input[@class=\"a-button-input\"])[4]")
WebElement usepaymentlink;
@FindBy(xpath = "//a[@id=\"nav-cart\"]")
WebElement backtocart;
//step 2
public void paymentmethodbtn(WebDriver driver) throws InterruptedException
{
	Thread.sleep(3000);
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.PAGE_DOWN).build().perform(); // Scroll one page down
	Thread.sleep(3000);
	usepaymentlink.click();
}
public void backtocartlink() throws InterruptedException
{
	Thread.sleep(3000);
	backtocart.click();
}

//step 3
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
