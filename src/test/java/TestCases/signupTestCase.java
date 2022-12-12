package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LognInPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constant;

public class signupTestCase extends baseClass {
	
	@Test
	public void verifySignup() throws IOException, InterruptedException {
		
		
		LognInPageObjects LPO=new LognInPageObjects(driver);
		
		Thread.sleep(5000);
		
		LPO.clickOnTryForFree().click();
		driver.manage().window().fullscreen();
		
		SignUpPageObjects SPO=new SignUpPageObjects(driver);
		
		SPO.enterFirstname().sendKeys(constant.firstname);
		SPO.enterLastname().sendKeys(constant.lastname);
		SPO.enterJobTitle().sendKeys(constant.jobTitle);
		
		SPO.enterEmail().sendKeys(constant.email);
		SPO.enterPhone().sendKeys(constant.phone);
		
		commonMethods.selectDropdown(SPO.enterEmployees(), 1);
		//Select s=new Select(SPO.enterEmployees());
		//s.selectByIndex(1);
		
		SPO.enterCompanyname().clear();
		SPO.enterCompanyname().sendKeys(constant.companyname);
		
		commonMethods.selectDropdown(SPO.enterCompanycounty(),2);
		//Select s1=new Select(SPO.enterCompanycounty());
		//s1.selectByVisibleText("India");
		
		//SPO.Usingsalesforcechkbox().click();
		//SPO.ServiceAgreementchkbox().click();
		
	}
}
