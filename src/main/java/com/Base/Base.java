package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver(String browser) {
		
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		tdriver.set(new ChromeDriver());
		
	
		}else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		tdriver.set(new FirefoxDriver());
		 
	}else 
		System.out.println("Please define proper browser value");
	getDriver().manage().window().maximize();
	return getDriver();

}
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
}
