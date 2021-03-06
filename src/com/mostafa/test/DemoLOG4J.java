package com.mostafa.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLOG4J {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("XYwebsite");
		logger.debug("Test script execution started");
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        logger.debug("Chrome browser got launched");
        driver.manage().window().maximize();
        logger.debug("Browser got maximized");
        driver.get("http://www.omayo.blogspot.com");
        logger.debug("Omayo application is opened");
        driver.findElement(By.linkText("compendiumdev")).click();
        logger.debug("Clicked on link and navigated to compendiumdev site");
        driver.navigate().back();
        logger.debug("Navigated back to omayo application");
        driver.navigate().forward();
        logger.debug("Navigated forward to compendium site");
        driver.close();
        logger.debug("Browser got closed");
	}

}
