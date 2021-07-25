package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_existinguser_04 {
	WebDriver cDriver;
	 @BeforeMethod
	    void setUp()
	     {
		  WebDriverManager.chromedriver().setup();
		  cDriver= new ChromeDriver();
	     }
      @Test
	      
	     void invalid_Username() throws InterruptedException
	     {
	    		 cDriver.get("https://www.amazon.in/");
	    		 cDriver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
	    		 WebElement emailidElement1=cDriver.findElement(By.xpath("//input[@id='ap_email']"));
	    		 emailidElement1.sendKeys("suryarajan36@gmail.com");
	         	 cDriver.findElement(By.xpath("//input[@id='continue']")).click();
	         	 System.out.println("Test case passes");
	         	 System.out.println("Invalid EmailAddress");

	             WebElement txt=cDriver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span"));
	             String s=txt.getText();
	             System.out.println(s);
	    	 
	     }
     
      @AfterMethod
   		 void tearDown()
   		 {
   		cDriver.close();
   	}
   	}
