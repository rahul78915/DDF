package com.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
	
	@Test
	@Parameters({ "browser","url","emailId"})
	public void yahooLoginTest( String Chrome,String url,String emailId){
		if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\Desktop\\Selenium\\selenium driver\\chromedriver.exe");
		 driver =new ChromeDriver();
	}else if(browser.equals("firefox")){
		System.setProperty("webdriver.gekco.driver","C:\\Users\\rahul\\Desktop\\Selenium\\selenium driver\\gekco.exe");
		driver =new FirefoxDriver();
		
	}
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		 driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailId);
		 driver.findElement(By.xpath("//*[@id='login-signin']")).click();
	}

}
