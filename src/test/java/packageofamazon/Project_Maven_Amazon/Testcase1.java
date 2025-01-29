package packageofamazon.Project_Maven_Amazon;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testcase1 extends LaunchQuit
{
@Test

public void login_searchproduct_logout() throws InterruptedException
{
	//ChromeDriver driver = new ChromeDriver();
	HomePage homepage = new HomePage(driver);
	homepage.hoverover(driver);
	homepage.signin();
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.un();
	loginpage.ctn();
	loginpage.pwd();
	loginpage.signbtn();
	
	homepage.searching();
	homepage.hoverover(driver);
	homepage.signout();
}
}
