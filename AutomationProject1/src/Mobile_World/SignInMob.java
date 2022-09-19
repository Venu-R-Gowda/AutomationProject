package Quali.Mobile_World;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInMob {
	@Test

	public void fName() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venu.R\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
        driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[class='btn btn-warning my-2 my-sm-0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("venukarna.ar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("venukarna.ar@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.className("custom-control-label")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("btn-block")).click();
		driver.close();
		driver.quit();

	}
}