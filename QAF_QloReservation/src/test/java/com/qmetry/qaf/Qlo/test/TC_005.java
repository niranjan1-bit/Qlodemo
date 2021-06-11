package com.qmetry.qaf.Qlo.test;

import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import com.qmetry.qaf.automation.util.Reporter;

public class TC_005 extends QAFWebDriverCommandAdapter {
	@QAFDataProvider(dataFile = "testdata\\Qlodata.xls", sheetName = "login")
	@Test(description = "Login", groups = { "SMOKE" })

	public void PersonalAddress(Map<String, String> data) throws InterruptedException {

		// Logger log=Logger.getLogger(dataLoginExcel.class);
		get("https://demo.qloapps.com/login?back=my-account");
		// getDriver().manage().window().maximize();
		clear("LEmail");
		sendKeys(data.get("email1"), "LEmail");
		clear("LPassword");
		sendKeys(data.get("pswd"), "LPassword");
		Thread.sleep(3000);
		click("LButton");
		Thread.sleep(3000);
		click("personal");
		Thread.sleep(3000);
		clear("input.firstname1");
		sendKeys(data.get("Firstname"), "input.firstname1");
		clear("input.lastname1");
		sendKeys(data.get("Lastname"), "input.lastname1");
		Thread.sleep(3000);
		clear("LEmail");
		sendKeys(data.get("email1"), "LEmail");
		sendKeys(String.valueOf(data.get("days")), "input.days");
		sendKeys(String.valueOf(data.get("month")), "input.months");
		sendKeys(String.valueOf(data.get("year")), "input.years");
		sendKeys(data.get("pswd"), "Currentpwd");
		click("save");
		Thread.sleep(3000);
		Reporter.logWithScreenShot("pass");
	}
}