package com.qmetry.qaf.Qlo.test;

import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.core.TestBaseProvider;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class TC_003 extends WebDriverTestCase {

	@QAFDataProvider(dataFile = "testdata\\Qlodata.xls", sheetName = "login")
	@Test(description = "Login", groups = { "SMOKE" })
	@QAFTestStep(description = "switch to {driverName}")

	public void Contact(Map<String, String> userData) throws InterruptedException {
		get("/");
		getDriver().manage().window().maximize();
		click("BookHThreeLines");
		Thread.sleep(3000);
		click("BookHRooms");
		Thread.sleep(3000);
		click("BookHBookNow");
		Thread.sleep(3000);
		String parentHandle = getDriver().getWindowHandle();
		for (String winHandle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
		}

		Thread.sleep(8000);
		click("in");
		Thread.sleep(3000);
		click("hotel_inD");
		Thread.sleep(3000);
		click("out");
		Thread.sleep(3000);
		click("hotel_ouD");
		click("BookHBookNow2");
		Thread.sleep(6000);
		// click("BookHPTCout");
		click("BookHProceedBtn");
		Thread.sleep(3000);
		click("Proceed");
		Thread.sleep(3000);
		click("BookHLoginnow");
		sendKeys(userData.get("email1"), "BookHEmail");
		// clear("LPassword");
		sendKeys(userData.get("pswd"), "BookHPassword");
		Thread.sleep(3000);
		click("BookHSubmitLogin");
		Thread.sleep(6000);
		click("BookHProceedBtn2");
		Thread.sleep(4000);
		click("BookHAgreeCheckBox");
		Thread.sleep(4000);
		click("BookHBankwire");
		Thread.sleep(4000);
		click("BookHConfirmMyOrder");
		Thread.sleep(4000);
		Reporter.logWithScreenShot("pass");
	}

}