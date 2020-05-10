package com.java.mavenjenkins1.mavenjenkins1;

import org.apache.log4j.*;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App2 
{
	@Test
    //public static void main( String[] args )
    public void FirstTest()
	{
		

		Logger logs = Logger.getLogger("devpinoyLogger");
		PropertyConfigurator.configure("log4j.properties");
    	
    	WebDriver uidriver;
    	WebDriverManager.chromedriver().setup();
    	logs.info("Browser Configuration");
    	uidriver = new ChromeDriver();
    	uidriver.get("https://facebook.com/");
    	logs.info("Launching Facebook");
    	uidriver.manage().window().maximize();
    	logs.info("Browser maximizing");
    	uidriver.close();
        System.out.println( "Hello World!" );
    }

}
