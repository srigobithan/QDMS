package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class initial {

	public static WebDriver driver;
	@Test()
	public void main() throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver =  new ChromeDriver();
				
		driver.manage().window().maximize();
		driver.get("http://192.168.1.35:8083/#/");

}
}