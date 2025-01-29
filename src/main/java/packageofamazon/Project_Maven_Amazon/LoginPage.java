package packageofamazon.Project_Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
WebDriver driver;
//step 1
@FindBy(name="email")
WebElement username;
@FindBy(id="continue")
WebElement cont;
@FindBy(id="ap_password")
WebElement passwordbox;
@FindBy(id="signInSubmit")
WebElement signinbtn;

//step 2
public void un()
{
	username.sendKeys("9409044218");
}
public void ctn()
{
	cont.click();
}
public void pwd() throws InterruptedException
{
	Thread.sleep(2000);
	passwordbox.sendKeys("Test@123456");
}
public void signbtn()
{
	signinbtn.click();
}
//step 3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
