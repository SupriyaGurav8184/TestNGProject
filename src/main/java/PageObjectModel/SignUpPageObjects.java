package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

	public WebDriver driver;
	
	By FirstName= By.xpath("//input[@name='UserFirstName']");
	By LastName=By.xpath("//input[@name='UserLastName']");
	
	By JobTitle=By.xpath("//input[@name='UserTitle']");
	By Email=By.xpath("//input[@name='UserEmail']");	
	By Phone=By.xpath("//input[@name='UserPhone']");
	
	By Employees = By.xpath("//select[@name='CompanyEmployees']");
	By Companyname=By.xpath("//input[@name='CompanyName']");
	By Companycountry= By.xpath("//select[@name='CompanyCountry']");
	
	By Usingsalesforcechkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	By ServiceAgreementchkbox=By.xpath("(//div[@class='checkbox-ui'])[2]");
	
	public SignUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	public WebElement enterFirstname() {
		
		return driver.findElement(FirstName);
	}
	
	public WebElement enterLastname() {
		
		return driver.findElement(LastName);
	}
	
	public WebElement enterJobTitle() {
		
		return driver.findElement(JobTitle);
	}
	
	public WebElement enterEmail() {
		
		return driver.findElement(Email);
	}
	
	public WebElement enterPhone() {
		
		return driver.findElement(Phone);
	}
	
	public WebElement enterEmployees() {
		
		return driver.findElement(Employees);
	}
	
	public WebElement enterCompanyname() {
		
		return driver.findElement(Companyname);
	}
	
	public WebElement enterCompanycounty() {
		
		return driver.findElement(Companycountry);
	}
	
	public WebElement Usingsalesforcechkbox() {
		return driver.findElement(Usingsalesforcechkbox);
	}
	
	public WebElement ServiceAgreementchkbox() {
		
		return driver.findElement(ServiceAgreementchkbox);
	}
}
