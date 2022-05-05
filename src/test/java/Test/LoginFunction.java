package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.POM_LoginFunctionality;
import Pojo.OpenBrowser;
import Utility.Excle;
import Utility.ScreenShot;
import jxl.Sheet;
import jxl.read.biff.BiffException;

public class LoginFunction {


static WebDriver driver;
@BeforeMethod
public void OpenWebBrowser(){
driver=	OpenBrowser.OpenBrowser1();
}



@Test
public void LoginZerothaAndEntrePin() throws BiffException, IOException{
	POM_LoginFunctionality pom=new POM_LoginFunctionality(driver);
	Sheet Exclea=Excle.Excle();
	 String username=Exclea.getCell(0, 1).getContents();
	    String Password=Exclea.getCell(1, 1).getContents();
	    String pin=Exclea.getCell(2, 1).getContents();
	    
	    
	pom.UserName(username);
	pom.PassWord(Password);
	pom.ClickOnLoginButton();
	pom.pin(pin, driver);
	pom.continue1s();
}
@AfterMethod
public void TakeScreenShot() throws IOException{
	ScreenShot.ScreenShot1(driver);
}
@AfterClass
public void CloseBrowser() throws IOException{
	driver.close();
}
public void TakeScredafenShot() throws IOException{
	System.out.println("PANKAJIngole");
	ScreenShot.ScreenShot1(driver);
}
}
