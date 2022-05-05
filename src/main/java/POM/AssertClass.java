package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssertClass {

@FindBy(xpath="//a[@class='text-light forgot-link']")private WebElement ForgetPassword;
@FindBy(xpath="//a[@class='text-light']")private WebElement CreateAccount;
@FindBy(xpath="//h2[@class='userid']")private WebElement CheckUserID_Visiable;
@FindBy(xpath="//a[@class='remove text-xxsmall']")private WebElement ChangeID;
@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]")private WebElement ClickONPankajID ;

@FindBy(xpath="//*[@id='app']/div[1]/div/div[2]/div[2]/div/div/ul/li[9]/a")private WebElement LogOut ;




public AssertClass(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void ForgetPassword(){
	ForgetPassword.click();
}
public void CreateAccount(){
	CreateAccount.click();
}
public void ChangeID(){
	ChangeID.click();
}
public String CheckUserID_Visiable(){
String Name=	CheckUserID_Visiable.getText();
return Name;
}
public void ClickONPankajID() throws InterruptedException{
	Thread.sleep(3000);
	ClickONPankajID.click();
}
public void LogOut(){
	LogOut.click();
}
}
