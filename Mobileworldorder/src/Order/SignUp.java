package Order;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {
	@Test
	public  void sigin() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venu.R\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com");
	Landingpage sup = new Landingpage(driver);
	sup.SignUp("Venu","R","venurqualitestgroup@gmail.com","venu@123","07/09/1999","9945676259","hakuna matata");



}
}
