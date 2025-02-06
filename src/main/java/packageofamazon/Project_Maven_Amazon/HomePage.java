package packageofamazon.Project_Maven_Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
//step 1
	@FindBy(id ="twotabsearchtextbox")
	WebElement searchbox;
	//@FindBy(css= "#nav-link-accountList")
	//WebElement accountandlist_hoverover;
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
		WebElement hover = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList")));
		//WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(accountandlist_hoverover));
		//continueButton.click();
		Actions a1 = new Actions(driver);
		a1.moveToElement(hover).perform();
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
