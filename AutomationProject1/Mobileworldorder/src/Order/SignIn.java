package Order;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {
	@Test

	public void signin() {
		// TODO Ao-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venu.R\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com");
	Landingpage ob = new Landingpage (driver);
    ob.SignIn("Venukarna", "venu@123");
	}

}
