package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgWebdriver {
	WebDriver driver1;
	@BeforeTest
		public void beforetest() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver1=new ChromeDriver(); 
		
		driver1.manage().window().maximize(); 
		driver1.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		}
	@Test(priority = 0)
	public void username() throws InterruptedException {
		driver1.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void password() throws InterruptedException {
		driver1.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	@Test(priority = 2  )
	public void clickloginbutton() throws InterruptedException {
		driver1.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
	}
	@AfterTest
	public void aftertest() {
			System.out.println("bye...");
			driver1.close();
	}
}
