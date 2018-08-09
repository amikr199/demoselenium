package com.flipkart;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.remote.server.log.LoggingOptions;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import net.bytebuddy.description.field.FieldDescription.TypeSubstituting;

public class Login {
 
	public static void  main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
	
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		 
//	 driver.findElement(By.partialLinkText("Login")).click();
	 Thread.sleep(10000);
	
	 driver.findElement(By.id("lst-ib")).sendKeys("testing booklet");
	 java.util.List<WebElement> list  = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbqs_c']"));
	System.out.println(list.size());
	for(int i=0 ; i<list.size(); i++)
	{
		System.out.println(list.get(i).getText());
	}
//       driver.findElement(By.id("userNameInput")).sendKeys("9108684777");
//       JavascriptExecutor js = ((JavascriptExecutor)(driver));
//       js.executeScript("document.getElementById('userNameInput').setAttribute('value', '910')");
//	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//	 driver.findElement(By.cssSelector("div._39M2dM input._2zrpKA._2rqcw-._3v41xv")).sendKeys(Keys.TAB);
//	 driver.findElement(By.cssSelector("div._39M2dM input._2zrpKA._2rqcw-._3v41xv")).sendKeys("Amit@123");
//		driver.findElement(By.linkText("SIGN IN")).click();
//		driver.findElement(By.id("search")).sendKeys("shoes");
//		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.linkText("KIDS"))).build().perform();
//		Thread.sleep(10000);
//		 Actions actions = new Actions(driver);
//			Thread.sleep(10000); 
//	actions.moveToElement(driver.findElement(By.linkText("Share"))).build().perform();
////		 Thread.sleep(10000); 
//		 driver.findElement(By.cssSelector("div.pageUtilities span.iconPrint.printPage.linkStyle.shareTextAlign")).click();
//		
//	System.out.println("done");
//		
}
	
}
