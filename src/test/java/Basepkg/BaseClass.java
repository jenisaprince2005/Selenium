package Basepkg;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import page.SaucedemoCartPage;
import page.SaucedemoCheckoutPage;
import page.SausedemoHomePage;
import page.SausedemoLoginPage;

public class BaseClass {
public static WebDriver driver;
public static WebDriverWait wait;

public static ExtentSparkReporter reporter;
public static ExtentTest test;
public static ExtentReports extent;


public SausedemoLoginPage login;
public SausedemoHomePage Home;
public SaucedemoCartPage Cart;
public SaucedemoCheckoutPage Check;
	
	@BeforeTest
	public void setup()
	{
		reporter=new ExtentSparkReporter("./Reports/MyReport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows 10");
		extent.setSystemInfo("testername", "abs");
		extent.setSystemInfo("Browsername", "Chrome");
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		driver=new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
			}
	@BeforeMethod
	public void tebeforemethod(Method mthd) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		login=new SausedemoLoginPage(driver);
		Home=new SausedemoHomePage(driver);
		Cart=new SaucedemoCartPage(driver);
		Check=new SaucedemoCheckoutPage(driver);
		test=extent.createTest(mthd.getName());
	}
	
}
