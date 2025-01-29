package packageofamazon.Project_Maven_Amazon;

import org.testng.annotations.Test;

public class TestCase5 extends LaunchQuit
{
@Test
public void login_cart_cod_logout() throws InterruptedException
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
	product1page.productaddtocart();
	
	ShoppingCartPage cartpage = new ShoppingCartPage(driver);
	cartpage.proceedtocheckoutbtn();
	
	CheckoutPage checkoutpage = new CheckoutPage(driver);
	checkoutpage.paymentmethodbtn(driver);
	checkoutpage.backtocartlink();
	Thread.sleep(4000);
	homepage.hoverover(driver);
	homepage.signout(); 
}
}
