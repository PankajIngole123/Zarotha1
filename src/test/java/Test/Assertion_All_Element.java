package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.AssertClass;
import POM.POM_LoginFunctionality;
import Pojo.OpenBrowser;
import Utility.Excle;
import jxl.Sheet;
import jxl.read.biff.BiffException;

public class Assertion_All_Element {
	
	
	WebDriver driver;
	SoftAssert soft =new SoftAssert();

@BeforeMethod
public void openUrl() throws BiffException, IOException, InterruptedException{
	driver=OpenBrowser.OpenBrowser1();
	POM_LoginFunctionality pom=new POM_LoginFunctionality(driver);
	SoftAssert soft =new SoftAssert();
	AssertClass assertion =new AssertClass(driver);
	Sheet Exclea=Excle.Excle();
	 String username=Exclea.getCell(0, 1).getContents();
	    String Password=Exclea.getCell(1, 1).getContents();
	    String pin=Exclea.getCell(2, 1).getContents();
	    
	    
	pom.UserName(username);
	pom.PassWord(Password);
	pom.ClickOnLoginButton();
	pom.pin(pin, driver);
	pom.continue1s();
	
	assertion.ClickONPankajID();
	assertion.LogOut();
	soft.assertAll();
	
}
@Test
public void Assertion_Test(){
	AssertClass assertion =new AssertClass(driver);
	
	
	String a=assertion.CheckUserID_Visiable();
	System.out.println(a);
	soft.assertEquals(a, "EQ5413");
    
	
	
}
// String OriginalWindow=driver.getTitle();
@Test
public void CreateAccount() throws InterruptedException{
	AssertClass assertion =new AssertClass(driver);
	String Original2=driver.getTitle();
	assertion.CreateAccount();
	String Original=driver.getTitle();
	soft.assertNotEquals(Original, Original2);
	soft.assertAll();
	
	
}
@Test
public void changeUser() throws InterruptedException{
	AssertClass assertion =new AssertClass(driver);
	assertion.ChangeID();
	
	
}
}
