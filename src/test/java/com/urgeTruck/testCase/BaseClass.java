package com.urgeTruck.testCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public String BaseURL = "https://urgetruck.com/login";
    public String username = "Rajesh";
    public String password = "Pass@123";
    public static WebDriver driver;
    public static Logger logger;

    @BeforeClass
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        logger = Logger.getLogger("UT");
        PropertyConfigurator.configure("log4j.properties");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

