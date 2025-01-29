package packageofamazon.Project_Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage 
{
	WebDriver driver;

@FindBy(xpath = "//span[@id='sw-gtc']")
WebElement gototcartlink;
@FindBy(xpath = "//span[@class='a-icon a-icon-small-add']")
WebElement productcount;
@FindBy(xpath = "//span[@class='a-icon a-icon-small-remove']")
WebElement productcountremove;
@FindBy(xpath ="//input[@name='proceedToRetailCheckout']")
WebElement proceedbutton;

public void cartbtn() throws InterruptedException
{
	Thread.sleep(2000);
	gototcartlink.click();
}
public void productqty() throws InterruptedException
{
	Thread.sleep(2000);
	productcount.click();
}
public void productqtyremove() throws InterruptedException
{
	Thread.sleep(2000);
	productcountremove.click();
}
public void proceedtocheckoutbtn() throws InterruptedException
{
	Thread.sleep(2000);
	proceedbutton.click();
}
//step 3
	public ShoppingCartPage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
}
