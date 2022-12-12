package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	
	public WebDriver driver;
	public void browserInitialization() throws IOException {
		
		//To read properties file
		FileInputStream fis=new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		//To access properties file
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
		 driver= new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			//firefox browser launch code
			
		}else {
			
			System.out.println("Enter vaild browser name");
		}
		
		
	}
	@BeforeMethod
	public void launch() throws IOException {
		
		
		//Common code to launch browser
		browserInitialization();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().fullscreen();
		
	}

}
