package BTLA;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	Properties prop = new Properties();
	public WebDriver initialiseDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\BT\\src\\main\\resources\\url.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		String path= System.getProperty("user.dir");
		System.out.println("project path: "+path);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","E:\\seleniumtrainingByJitendra\\Tools\\Selenium3.141.59_softwares\\Chrome V90\\chromedriver.exe");
			    driver = new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "E:\\SeleniumTrainingByJitendra2\\tools\\Drivers\\Firefox\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		
		else if(browserName.equals("IE")) {
			
			//ie
		}
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
	
	public WebDriver passURLS() {
	 prop.get("url");
		
		return driver;}

}
