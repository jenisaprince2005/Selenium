package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basepkg.BaseClass;

public class SausedemoCartTest extends BaseClass{
	@Test(priority = 1)
	public void cartTitleTextVerify()
	{
		String actual_cart_title_text = Cart.cartTitleTextVerify();
		Assert.assertEquals(actual_cart_title_text, "Your Cart");
	}
	
	@Test(priority = 2)
	public void continueShoppingButtonCheck()
	{
		boolean csb =  Cart.checkContinueShoppingButtonEnabled();
		Assert.assertEquals(csb, true);
	}
	
	@Test(priority = 3)
	public void checkCheckoutButtonEnabled()
	{
		boolean cb = Cart.checkCheckoutButtonEnabled();
		Assert.assertEquals(cb, true);
	}
	
	@Test(priority = 4)
	public void checkoutButtonClick()
	{
		Cart.checkoutButtonClick();
	}
	
	

		}
		
		
