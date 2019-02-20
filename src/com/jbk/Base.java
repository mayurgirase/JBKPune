package com.jbk;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	 static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\madhavi\\Download\\chromedriver.exe");
		driver=new ChromeDriver();
				
		driver.get("https://www.javabykiran.com");
		
		driver.close();
	}
	


}
