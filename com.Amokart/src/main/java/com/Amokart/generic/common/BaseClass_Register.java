package com.Amokart.generic.common;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Amokart.generic.propertyfileUtility.ReadPropertiFile;
import com.beust.jcommander.Parameters;

public class BaseClass_Register {
	public static WebDriver driver=null;
	
	
	@BeforeSuite
	public void serverconnection()
	{
		Reporter.log("server_Connection done",true);
	}
	@BeforeTest
	public void dbconnection()
	{
		Reporter.log("db connection done",true);
	}
	//@org.testng.annotations.Parameters("browser")
	@BeforeClass
	//public void broswrsetup(String browser) throws Throwable
	public void broswrsetup() throws Throwable
	{
		System.out.println("Enter Browser :");
	Scanner scr=new Scanner(System.in);
	// String b_name=browser;
	String browser=scr.next();
	 
	
	 
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 
	     driver= new ChromeDriver();
	    
		 
	 }
	 else if(browser.equalsIgnoreCase("edge"))
	 {
		driver= new EdgeDriver();
		
	 }
	 else if(browser.equalsIgnoreCase("firefox"))
	 {
		driver= new FirefoxDriver();
		
	 }
	 else {
		 System.out.println("you have entered invalid browser name");
		 driver=new ChromeDriver();
	 }
	 //navigate application url
	   ReadPropertiFile read=new ReadPropertiFile();
	   System.out.println(read.readData("url"));
		try {
			driver.get(read.readData("url"));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 Reporter.log("broswerSetup sucessful",true);
	
	} 
	@BeforeMethod
	public void login()
	{

		Reporter.log("login sucessful",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close browser sucessful",true);
	}
	//driver.get("file:///C:/Users/sathe/eclipse-workspace/com.Amazokart/src/test/resources/webpage/webpage.html");

}
