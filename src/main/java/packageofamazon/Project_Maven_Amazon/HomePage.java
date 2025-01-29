package packageofamazon.Project_Maven_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
//step 1
	@FindBy(id ="twotabsearchtextbox")
	WebElement searchbox;
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement accountandlist_hoverover;
	@FindBy(xpath = "(//span[.='Sign in'])[1]")
	WebElement signin_home;
	@FindBy(xpath = "(//span[.='Sign Out'])[1]")
	WebElement signout_home;
	
	
	//step 2
	public void searching()
	{
		searchbox.sendKeys("shoe" + Keys.ENTER);
	}
	public void hoverover(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist_hoverover).perform();
	}
	public void signin()
	{
		signin_home.click();
	}
	public void signout()
	{
		signout_home.click();
	}
	//step 3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
