package com.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class h {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
	
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
