package com.qmetry.qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

 

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.data.ElementInteractor.SelectBox;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;

 
public class CreateAccount extends WebDriverTestCase {
//public class CreateAccount extends QAFWebDriverCommandAdapter { 
    @QAFDataProvider(dataFile = "testdata\\Opencart.xls", sheetName = "login")
    @Test(description = "Createaccount", groups = { "SMOKE" })

 

    public void AccountCreation(Map<String, String> data) throws InterruptedException {
        
        getDriver().get("/");
        getDriver().manage().window().maximize();
        click("click.sigin");
        Thread.sleep(3000);
        sendKeys(data.get("email1"), "input.Email");
        click("click.create");
      //  click("click.mrs");
        sendKeys(data.get("Firstname"), "input.firstname");
        sendKeys(data.get("Lastname"), "input.lastname");
        sendKeys(data.get("pswd"), "input.password");
        Thread.sleep(3000);
       
        WebElement  selectday =getDriver().findElement("input_days");
        Thread.sleep(3000);
      
        Select day=new Select(selectday);

      
        day.selectByIndex(5);
        Thread.sleep(3000);
        WebElement  selectmonth =getDriver().findElement("input_months");
        Thread.sleep(3000);
        Select month=new Select(selectmonth);
        month.selectByIndex(5);
        Thread.sleep(3000);
        WebElement  selectyear =getDriver().findElement("input_years");
        Thread.sleep(3000);
        Select year=new Select(selectyear);
        year.selectByIndex(5);
      
    
        Thread.sleep(6000);
     
       // click("click.register");

 
    }

}