package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import POM.POM_LoginFunctionality;
import POM.POM_StockSelection;
import Pojo.OpenBrowser;
import Utility.Excle;
import jxl.Sheet;
import jxl.read.biff.BiffException;

public class StockSeection {

	 WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser2() throws BiffException, IOException{
		driver=OpenBrowser.OpenBrowser1();
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
	
	@Test(priority=1)
	public void Test_SelectStock() throws BiffException, IOException{
		POM_StockSelection pom2=new POM_StockSelection(driver);
	Sheet Stock=Excle.Excle();
	for(int i=0;i<Stock.getRows();i++){
   String stock=Stock.getCell(3, i).getContents();
		pom2.SendStock(driver, stock);
		pom2.SendClick();
	}
	}
	
	@Test(priority=2)
	public void BuyStock() throws InterruptedException{
		Thread.sleep(2000);
		POM_StockSelection pom2=new POM_StockSelection(driver);
		Actions act=new Actions(driver);
	     WebElement option=	driver.findElement(By.xpath("//*[@id='app']/div[2]/div[1]/div/div[2]/div/div[4]/div/div"));
	     act.moveToElement(option).build().perform();
	     Thread.sleep(2000);
	    WebElement namea=driver.findElement(By.xpath("//button[contains(text(),'B')]"));
	     act.moveToElement(namea).click().build().perform();
	     
	     pom2.ClickOnIntaDay();
	     pom2.ClickOnMarket();
	     pom2.EntreStock("124");
	     pom2.ClickOnSubmit();
	}
	
	@Test(priority=3)
	public void Error() throws InterruptedException{
		Thread.sleep(2000);
		POM_StockSelection pom2=new POM_StockSelection(driver);
		Actions act=new Actions(driver);
		WebElement a= driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/span"));
		act.moveToElement(a);
		act.click().build().perform();
		driver.findElement(By.xpath("//*[@id='app']/form/section/div/footer/div[2]/button[2]")).click();
		pom2.Dashbord();
	}
	@AfterClass
	public void CloseBrowser() throws IOException{
		driver.close();
	}
	}
	

