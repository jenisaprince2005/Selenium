package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SausedemoLoginPage{
	WebDriver driver;
	By usernamefeild=By.id("username");
	By passwordfeild=By.id("password");
By login=By.id("loginbutton");
	
	public SausedemoLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalue(String username,String password)
	{
		driver.findElement(usernamefeild).sendKeys(username);
		driver.findElement(passwordfeild).sendKeys(password);
	}
	public void logins()
	{
		driver.findElement(login).click();
	}
	
}