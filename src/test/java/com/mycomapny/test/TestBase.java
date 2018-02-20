package com.mycomapny.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mycomapny.config.Constant;
import com.mycompny.page.LoanParameter;
import com.mycompny.page.Result;

public class TestBase extends Constant {

	protected WebDriver driver;
	private String driverpath = "C:/eccc/Java_Tutorial/fselenium18/Resources";
	private String browser;
	protected LoanParameter lp;
	protected Result res;

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method call");
		launchBrowser(BROWSER);
		driver.manage().timeouts().pageLoadTimeout(Constant.PAGE_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constant.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(Constant.URL);
		createObjectOfPage();
		
		
	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}
	
	public void launchBrowser(String br) {

		System.out.println("Running between");
		if (br.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", driverpath + "/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (br.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", driverpath + "/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else if (br.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", driverpath + "/chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			System.setProperty("webdriver.gecko.driver", driverpath + "/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	public void clearAndSendKeys(WebElement webElement, String tobe) {
		webElement.clear();
		webElement.sendKeys(tobe);
	}
	

	
	public void createObjectOfPage() {
		lp = new LoanParameter(driver);
		res = new Result(driver);
		
		//assertEquals(res., );
	}


	public void destroyObjectOfpage() {
		lp = null;
		res = null;
	}
}
