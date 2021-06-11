package com.qmetry.qaf.Qlo.test;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class TC_006 extends WebDriverTestCase {

	@QAFDataProvider(dataFile = "testdata\\Qlodata.xls", sheetName = "login")
	@Test(description = "Login", groups = { "SMOKE" })

	public void Contact(Map<String, String> userData) throws InterruptedException {
		get("/");
		getDriver().manage().window().maximize();
		click("qlo_threedot");
		Thread.sleep(3000);
		click("qlo_contact");
		Thread.sleep(3000);
		click("Subject");
		Thread.sleep(3000);
		click("qlo_customerservice");
		sendKeys(userData.get("email1"), "qlo_contactemail");
		sendKeys(" THANK YOU", "qlo_message");
		Thread.sleep(3000);
		// click("upload");
		click("qlo_sendmessage");
		Thread.sleep(3000);
		Reporter.logWithScreenShot("pass");
	}
}