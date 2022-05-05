package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pojo.MultipleBrowser;

public class DriverTest {
	

	
	@Test
	@Parameters(value ={"browser"})

public void open(String browser){
		MultipleBrowser.openBrowser(browser);
	System.out.println("OPEN");
}
}
