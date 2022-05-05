package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_StockSelection {
	@FindBy(xpath="//*[@id='app']/div[2]/div[1]/div/div[1]/div/div/input")private WebElement Search;
	@FindBy(xpath="//*[@id='app']/form/section/div/div[2]/div[2]/div[1]/div[1]/div/input")private WebElement EntreStock;
	@FindBy(xpath="//*[@id='app']/form/section/div/div[2]/div[1]/div/div[1]/label")private WebElement ClickOnIntaDay;
    @FindBy(xpath="//*[@id='app']/form/section/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/label") private WebElement ClickOnMarket;
    @FindBy(xpath="//*[@id='app']/form/section/div/footer/div[2]/button[1]")private WebElement ClickOnSubmit;
    @FindBy(xpath="/html/body/div[2]/div[6]/div/div/span")private WebElement ErrorMSG;
    @FindBy(xpath="//*[@id='app']/div[1]/div/div[2]/div[1]/a[2]")private WebElement Dashbord;
   
    public  POM_StockSelection(WebDriver driver){
    	PageFactory.initElements(driver, this);
    }
    public void SendStock(WebDriver driver,String nameofstock){
    	WebDriverWait waita=new WebDriverWait(driver,3000);
    	waita.until(ExpectedConditions.visibilityOf(Search));
    		Search.sendKeys(nameofstock);
    		
    	}
    	public void SendClick(){
    		Search.sendKeys(Keys.ENTER);
    	}
    	public void ClickOnIntaDay(){
    		ClickOnIntaDay.click();
    	}
    	public void EntreStock(String StockCount){
    		EntreStock.sendKeys(StockCount);
    	}
    	public void ClickOnMarket(){
    		ClickOnMarket.click();
    	}
    	public void ClickOnSubmit(){
    		ClickOnSubmit.click();
    	}
    	public void ErrorMSG(WebDriver driver){
    		WebDriverWait wait=new WebDriverWait(driver,3000);
    		wait.until(ExpectedConditions.visibilityOf(ErrorMSG));
    		
    		ErrorMSG.click();
    	}
    	public void Dashbord(){
    		Dashbord.click();
    	}
}
