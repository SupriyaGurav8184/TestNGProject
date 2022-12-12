package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LognInPageObjects {

	public WebDriver driver;
	
	private By username= By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	
	private By tryForFree=By.xpath("//a[@id='signup_link']");
	
	private By errormessage=By.xpath("//div[@id='error']");
	
	
	public LognInPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}


	public WebElement enterUsername() {
		
		return driver.findElement(username);
	}
	
	
	public WebElement enterPassword() {
		
		return driver.findElement(password);
	}
	
	
	public WebElement clickonLogin() {
		
		return driver.findElement(login);
	}
	
	
	public WebElement clickOnTryForFree() {
		
		return driver.findElement(tryForFree);
		
	}
	
	public WebElement errormsg() {
		
		return driver.findElement(errormessage);
	}
}
