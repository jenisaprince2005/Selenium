package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaucedemoCheckoutPage {
WebDriver driver;
	
	By checkout_title = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By firstname_field = By.id("first-name");
	By lastname_field = By.id("last-name");
	By postal_code_field = By.id("postal-code");
	By continue_button = By.id("continue");
	By total_amount_checkout = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]");
	By finish_button = By.id("finish");
	
	public SaucedemoCheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String checkoutTitleVerify()
	{
		return driver.findElement(checkout_title).getText();
	}
	
	public void fillOutForm(String f_name, String l_name, String pin)
	{
		driver.findElement(firstname_field).sendKeys(f_name);
		driver.findElement(lastname_field).sendKeys(l_name);
		driver.findElement(postal_code_field).sendKeys(pin);
	}
	
	public void clickContinue()
	{
		driver.findElement(continue_button).click();
	}
	
	public String displayTotalAmount()
	{
		return driver.findElement(total_amount_checkout).getText();
	}
	
	public void clickFinish()
	{
		driver.findElement(finish_button).click();
	}
}
