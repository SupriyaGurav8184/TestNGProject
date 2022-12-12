package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonMethods {

	//method for dropdown webelement
	public static void selectDropdown(WebElement dropdown,int index) {
		
		Select s= new Select(dropdown);
		s.selectByIndex(index);
		
	}
	
	public static void  handleAssertion(String actualString,String expectedSting) {
		
		SoftAssert assertion=new SoftAssert();
		String actual=actualString;
		String expected=expectedSting;
		
		assertion.assertEquals(actual,expected );
		assertion.assertAll();
		
	}
}
