package com.mycompny.page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycomapny.test.TestBase;

public class Result extends TestBase{
	
	@FindBy(xpath = "html/body/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table[1]/tbody/tr/td/table/tbody/tr[1]/td[1]")
	public
	WebElement mp;
	
	public Result(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void printRes() {
		assertEquals(this.mp.getText(), "$399.32");
		//System.out.println("Value"+this.mp.getText());
	}

}
