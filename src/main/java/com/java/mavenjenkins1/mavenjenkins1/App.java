package com.java.mavenjenkins1.mavenjenkins1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    //public static void main( String[] args )
    public void FirstTest()
	{
    	
    	WebDriver uidriver;
    	WebDriverManager.chromedriver().setup();
    	uidriver = new ChromeDriver();
    	uidriver.get("https://mvnrepository.com/");
    	uidriver.manage().window().maximize();
    	uidriver.close();
        System.out.println( "Hello World!" );
    }

}