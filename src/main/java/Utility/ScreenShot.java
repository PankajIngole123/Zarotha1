package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShot {

 public static void ScreenShot1(WebDriver driver) throws IOException{
	
	 DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy_MM_dd hh mm ss");
		LocalDateTime now=LocalDateTime.now();
		String Date=date.format(now);
	    
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Source=new File("D:\\practicals\\Zarotha\\ScreenShot\\" +Date+ ".png");
		FileUtils.copyFile(file, Source);
 }
}
