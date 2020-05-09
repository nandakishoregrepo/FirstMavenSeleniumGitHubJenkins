package com.java.mavenjenkins1.mavenjenkins1;

import org.apache.log4j.Logger;
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
    	uidriver = new ChromeDriver();
    	uidriver.get("https://facebook.com/");
    	uidriver.manage().window().maximize();
    	uidriver.close();
        System.out.println( "Hello World!" );
    }

}
