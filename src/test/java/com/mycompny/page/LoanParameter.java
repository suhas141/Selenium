package com.mycompny.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycomapny.test.TestBase;

public class LoanParameter extends TestBase {
	// Locators
	@FindBy(name = "ma")
	WebElement pp;

	@FindBy(xpath = "html/body/center/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/form[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/input")
	WebElement dp;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Calculator;
	
	// Methods

	public LoanParameter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void inputDiffererntParameter(String purP, String dowpay, String Calcul) {

		clearAndSendKeys(pp, purP);
		clearAndSendKeys(dp, dowpay);
		Calculator.click();
	}
	
}
