package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LognInPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constant;

public class LoginTestCase extends baseClass {
	
	@Test
	public void Login() throws IOException {
		
		
		
		LognInPageObjects LPO=new LognInPageObjects(driver);
		
		LPO.enterUsername().sendKeys(constant.username);
		LPO.enterPassword().sendKeys(constant.password);
		LPO.clickonLogin().click();
		
		commonMethods.handleAssertion(LPO.errormsg().getText(), constant.errormessage);
	}

}
