package Searching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_search_07 {

	WebDriver cDriver;
	 @BeforeMethod
	    void setUp()
	     {
		  WebDriverManager.chromedriver().setup();
		  cDriver= new ChromeDriver();
	     }
    @Test
	      
	     
	 void checkSearch_button() throws InterruptedException {
		 cDriver.get("https://www.amazon.in/");
		// cDriver.findElement(By.id("nav_search"));
		 WebElement searchbar=cDriver.findElement(By.xpath("//*[@id=\"nav-search\"]"));
 		 Boolean b_searchbar=searchbar.isDisplayed();
 	     if(b_searchbar)
 		  {
 	 		System.out.println("Search option is available ,Test cases passed");
 		  }
 		 else 
 		  {
 			System.out.println("test is failed");	
 		  }
		 
	 }

	 @AfterMethod
	 void tearDown()
	 {
	cDriver.close();
}
}



