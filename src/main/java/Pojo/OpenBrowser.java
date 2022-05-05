package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {

         static WebDriver driver;
	     public static WebDriver OpenBrowser1(){
		 System.setProperty("webdriver.chrome.driver", "D:\\selinium-crome\\geckodriver-v0.30.0-win32\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions km=new ChromeOptions();
		 km.addArguments("disable-notifications");
			 driver=new ChromeDriver(km);
			 driver.get("https://kite.zerodha.com/#loggedout");
			
			 return driver;
}
}