package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaucedemoCartPage {
WebDriver driver;
By cart_title_text=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
By continue_shopping_button=By.id("continue-shopping");
By checkout_button=By.id("checkout");
public SaucedemoCartPage(WebDriver driver)
{
	this.driver = driver;
}

public String cartTitleTextVerify()
{
	return driver.findElement(cart_title_text).getText();
}

public boolean checkContinueShoppingButtonEnabled()
{
	return driver.findElement(continue_shopping_button).isEnabled();
}

public boolean checkCheckoutButtonEnabled()
{
	return driver.findElement(checkout_button).isEnabled();
}

public void checkoutButtonClick()
{
	driver.findElement(checkout_button).click();
}
}
