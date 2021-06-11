package com.qmetry.qaf.Qlo.test;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import com.qmetry.qaf.automation.util.Reporter;

public class TC_001 extends QAFWebDriverCommandAdapter {
	@QAFDataProvider(dataFile = "testdata\\Qlodata.xls", sheetName = "login")
	@Test(description = "Createaccount", groups = { "SMOKE" })

	public void Createaccount(Map<String, String> data) throws InterruptedException {

		get("/");
		click("click.sigin");
		Thread.sleep(5000);
		sendKeys("Test012@gmail.com", "input.Email");
		click("click.create");
		Thread.sleep(3000);
		click("click.mrs");
		sendKeys(data.get("Firstname"), "input.firstname");
		sendKeys(data.get("Lastname"), "input.lastname");
		sendKeys(data.get("pswd"), "input.password");
		sendKeys(String.valueOf(data.get("days")), "input.days");
		sendKeys(String.valueOf(data.get("month")), "input.months");
		sendKeys(String.valueOf(data.get("year")), "input.years");
		click("click.register");
		Thread.sleep(6000);
		Reporter.logWithScreenShot("pass");

	}

}
