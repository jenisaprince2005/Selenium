package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basepkg.BaseClass;

public class SaucedemoCheckoutTest extends BaseClass {
	@Test(priority = 1)
	public void checkoutTitleVerify()
	{
		String actual_checkout_title = Check.checkoutTitleVerify();
		Assert.assertEquals(actual_checkout_title, "Checkout: Your Information");
	}
	
	@Test(priority = 2)
	public void fillOutForm()
	{
		Check.fillOutForm("Jenisa", "Prince", "680125");
	}
	
	@Test(priority = 3)
	public void clickContinue()
	{
		Check.clickContinue();
	}
	
	@Test(priority = 4)
	public void displayTotalAmount()
	{
		System.out.println("Total amount of Cart Items : "+Check.displayTotalAmount());
	}
	
	@Test(priority = 5)
	public void clickFinish()
	{
		Check.clickFinish();
	}
}
