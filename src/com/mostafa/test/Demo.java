package com.mostafa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
        //on utilisant sysout method
		
        System.out.println("Test script execution started");
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome browser got launched");
        driver.manage().window().maximize();
        System.out.println("Browser got maximized");
        driver.get("http://www.omayo.blogspot.com");
        System.out.println("Omayo application is opened");
        driver.findElement(By.linkText("compendiumdev")).click();
        System.out.println("Clicked on link and navigated to compendiumdev site");
        driver.navigate().back();
        System.out.println("Navigated back to omayo application");
        driver.navigate().forward();
        System.out.println("Navigated forward to compendium site");
        driver.close();
        System.out.println("Browser got closed");
	}
}
