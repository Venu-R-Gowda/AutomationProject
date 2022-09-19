package Quali.Mobile_World;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpMOB {
	@Test

	public void fName() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venu.R\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
        driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[class='btn btn-warning my-2 my-sm-0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body > div > div > div > div > div > p > a")).click();
		driver.findElement(By.className("form-control")).sendKeys("Venu");
		driver.findElement(By.cssSelector("#myForm > div:nth-child(4) > div:nth-child(3) > input")).sendKeys("R Gowda");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#myForm > div:nth-child(6) > div.col-md-10 > input:nth-child(1)\r\n"+ "")).sendKeys("venukarna.ar@gmail.com");
		driver.findElement(By.cssSelector("#myForm > div:nth-child(6) > div.col-md-10 > input:nth-child(3)")).sendKeys("venukarna.ar@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#myForm > div:nth-child(9) > div.col-md-5 > input\r\n")).sendKeys("09/07/2022");
		driver.findElement(By.cssSelector("#myForm > div:nth-child(9) > div.col-md-2 > input[type=radio]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#myForm > div:nth-child(12) > div.col-md-10 > input")).sendKeys("919945676259");
		driver.findElement(By.cssSelector("#myForm > div:nth-child(14) > div.col-md-10 > textarea")).sendKeys("I am a Rockstar");
		Thread.sleep(1000);
		
		driver.findElement(By.className("btn-info")).click();		
		driver.close();
		driver.quit();


		
	}

}
