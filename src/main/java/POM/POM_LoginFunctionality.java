package POM;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_LoginFunctionality {

	@FindBy(xpath="//*[@id='userid']")private WebElement UserName;
	@FindBy(xpath="//*[@id='password']")private WebElement PassWord;
	@FindBy(xpath="//*[@id='container']/div/div/div/form/div[4]/button")private WebElement Click1;
	@FindBy(xpath="//*[@id='pin']")private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement continue1;
	
   
    public POM_LoginFunctionality(WebDriver driver){
    PageFactory.initElements(driver, this);	
    }
    public void UserName (String username){
		UserName.sendKeys(username);
	}
	public void PassWord(String password){
		PassWord.sendKeys(password);
	}
	public void ClickOnLoginButton(){
		Click1.click();
	}

	public void pin(String pina,WebDriver driver){
		WebDriverWait waite=new WebDriverWait(driver,3000);
		waite.until(ExpectedConditions.visibilityOf(Pin));
		Pin.sendKeys(pina);
		
	}
	public void continue1s(){
		continue1.click();
	
	}
	
}
