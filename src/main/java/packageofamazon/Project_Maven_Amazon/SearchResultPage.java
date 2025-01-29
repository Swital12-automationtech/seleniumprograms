package packageofamazon.Project_Maven_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage 
{
	WebDriver driver;
	//step 1
	@FindBy(xpath= "(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement Productshoe;

	//step 2
	public void productselection(WebDriver driver) throws InterruptedException
	{
		Productshoe.click();
		Thread.sleep(2000);
		Set<String> window = driver.getWindowHandles();
		Iterator<String> i2 = window.iterator();
		String Parentid = i2.next();
		String Childid = i2.next();
		driver.switchTo().window(Childid);
	}
	//step 3
	public SearchResultPage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
		
}
