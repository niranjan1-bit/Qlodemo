package com.qmetry.qaf.Qlo.test;

import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import com.qmetry.qaf.automation.util.Reporter;

public class TC_004 extends WebDriverTestCase {

	@QAFDataProvider(dataFile = "testdata\\Qlodata.xls", sheetName = "login")
	@Test(description = "Login", groups = { "SMOKE" })

	public void Cancel(Map<String, String> data) throws InterruptedException {

		get("https://demo.qloapps.com/login?back=my-account");
		getDriver().manage().window().maximize();
		clear("LEmail");
		sendKeys(data.get("email1"), "LEmail");
		clear("LPassword");
		sendKeys(data.get("pswd"), "LPassword");
		Thread.sleep(3000);
		click("LButton");
		Thread.sleep(3000);
		click("OrderHistory");
		Thread.sleep(3000);
		click("Details");
		Thread.sleep(3000);
		click("Cancel");
		Thread.sleep(3000);
		click("Checkbox");
		Thread.sleep(3000);
		click("Submit");
		Thread.sleep(3000);
		sendKeys("THANK YOU", "reason");
		Thread.sleep(3000);
		click("SubmitReason");
		Thread.sleep(6000);
		Reporter.logWithScreenShot("pass");

	}
}
