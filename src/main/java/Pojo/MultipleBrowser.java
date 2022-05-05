package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

public   class MultipleBrowser {
    static WebDriver driver;
	
	public static void openBrowser(String BrowserName){
		if(BrowserName.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", "D:\\selinium-crome\\geckodriver-v0.30.0-win32\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
		if(BrowserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "D:\\practicals\\Zarotha\\src\\main\\resources\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
			
		}
		
		if(BrowserName.equalsIgnoreCase("msedriver")){
			System.setProperty("webdriver.edge.driver", "D:\\practicals\\Zarotha\\src\\main\\resources\\msedgedriver.exe");
			 driver=new EdgeDriver();
			
		}
		
		if(BrowserName.equalsIgnoreCase("fire")){
			System.setProperty("webdriver.gecko.driver", "D:\\practicals\\Zarotha\\src\\main\\resources\\geckodriver.exe");
			 driver=new FirefoxDriver();
			
		}
		
		
	
	}
}
