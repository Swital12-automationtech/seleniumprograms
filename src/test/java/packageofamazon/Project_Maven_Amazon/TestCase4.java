package packageofamazon.Project_Maven_Amazon;

import org.testng.annotations.Test;

public class TestCase4 extends LaunchQuit
{
@Test(retryAnalyzer=IRetry_Logic.class)
public void login_searching_wishlist_decProductqty() throws InterruptedException
{

	HomePage homepage = new HomePage(driver);
	homepage.hoverover(driver);
	homepage.signin();
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.un();
	loginpage.ctn();
	loginpage.pwd();
	loginpage.signbtn();
	
	homepage.searching();

	SearchResultPage searchpage = new SearchResultPage(driver);
	searchpage.productselection(driver);
	
	Product1_AddPage product1page = new Product1_AddPage(driver);
	product1page.productaddtowishlist();
	product1page.productcontinueshop();
	product1page.productaddtocart();
	
	ShoppingCartPage cartpage = new ShoppingCartPage(driver);
	cartpage.cartbtn();
	cartpage.productqtyremove();
	Thread.sleep(4000);
	homepage.hoverover(driver);
	homepage.signout(); 
}
}
