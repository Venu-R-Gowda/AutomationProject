package Order;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Order {
	@Test
    public void order() throws InterruptedException{
    
    // TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venu.R\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://mobileworld.banyanpro.com/");
    Landingpage ordr = new Landingpage(driver);
    
    ordr.Order("Venu","karna","venukarnaqualitestgroup@gmail.com", "venu@123", "9945676259","slv world", "Nagawara","Bangalore", "456782", "1", "3");



}

}
