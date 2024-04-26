package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingAllBrowser {
	
	//I will check the different Browser in one platform
	
	WebDriver driver;
	
	@Parameters({"browserName", "Url"})
	@Test
	
	//Create the Method Name : BrowserTest	
	
	public void BrowserTest(String browserName, String Url) throws InterruptedException {
		
		if(browserName.equals("chrome")) {
		  driver = new ChromeDriver();
		}
		
		else if (browserName.equals("Edge")) {
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("InterExplore")) {
			driver = new EdgeDriver();
		}
		
		else {
			System.out.println("Browser Is Not worK");
		}
	
		driver.get(Url);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.quit();
	
	}
}
