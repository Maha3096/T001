package project1.Novemberproject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class BrowserLunch {
	@Test
	static void Browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahal\\eclipse-workspace\\Selenium\\updatedchromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		
	}

}
