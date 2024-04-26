package BrowserOpen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		driver.quit();

		
	}

}
