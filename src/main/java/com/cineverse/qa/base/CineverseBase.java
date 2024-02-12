package com.cineverse.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CineverseBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public CineverseBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/cineverse/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() throws InterruptedException{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			
				driver = new ChromeDriver(); 
		}
		else if(browserName.equals("Firefox")){	
			driver = new FirefoxDriver(); 
	 }
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  //driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(prop.getProperty("url"));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		 
		
		
}
}
