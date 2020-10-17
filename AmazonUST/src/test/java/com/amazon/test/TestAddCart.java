package com.amazon.test;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class TestAddCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		    System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\REVATHI R\\Desktop\\UST_Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.manage().window().maximize();

		
		    driver.get("https://www.amazon.in/");
	
		    
	        driver.findElement(By.id("nav-link-accountList"));
		    driver.findElement(By.linkText("Start here.")).click();
		  
		    driver.findElement(By.name("customerName")).sendKeys("SeleniumTest1");
		    driver.findElement(By.id("ap_phone_number")).sendKeys("9876543210");
		    Random randomGenerator = new Random();  
		    int randomInt = randomGenerator.nextInt(1000);  
		    driver.findElement(By.name("secondaryLoginClaim")).sendKeys("username"+ randomInt +"@gmail.com");
		    driver.findElement(By.id("ap_password")).sendKeys("Revathi@12345");
		    driver.findElement(By.id("continue")).click();
		    driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[2]/div[2]/div[2]/a")).click();
			
		
			driver.findElement(By.name("email")).sendKeys("somevalidnumberoremail");
		    driver.findElement(By.id("continue")).click();
		 
		    driver.findElement(By.xpath("//*[@id=\"cvf-page-content\"]/div/div/div[1]/form/div[2]/input")).sendKeys("Enter OTP");
		    driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]/span/input")).click();
		    
		   driver.findElement(By.xpath("//*[@id=\"cvf-page-content\"]/div/div/div/form/div[1]/div[2]/input")).sendKeys("Revathi");
		    driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"ap_fpp_password\"]")).sendKeys("Revathi@2020");
		    driver.findElement(By.id("ap_fpp_password_check")).sendKeys("Revathi@2020");
	
		    driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]")).click();
		   driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		    driver.findElement(By.id("ap_password")).sendKeys("Revathi@2020");
		 
		    driver.findElement(By.id("signInSubmit")).click();
		    
		    
		    
		    
		    
		    driver.findElement(By.id("nav-hamburger-menu")).click();
		    driver.findElement(By.xpath("(//div[@id='hmenu-content']//a)[7]")).click();
		    driver.findElement(By.linkText("All Mobile Phones")).click();
			
			driver.findElement(By.xpath("//*[@id='leftNav']/ul[5]/li/span/a/span")).click();
	        driver.findElement(By.xpath("//*[contains(@title,'Apple')]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"p_36/1318507031\"]/span/a/span")).click();
	    	driver.findElement(By.xpath("//*[contains(@aria-label,'4 Stars & Up')]")).click();
			
			//driver.findElement(By.linkText("Apple AirPods Pro")).click();
		
	    	driver.findElement(By.linkText("Apple iPhone 7 (32GB) - Black")).click();
			String mainWindow=driver.getWindowHandle();
			
			Set<String> set =driver.getWindowHandles();
			Iterator<String> itr= set.iterator();
			while(itr.hasNext()){
			String childWindow=itr.next();
			 
			if(!mainWindow.equals(childWindow)){
			driver.switchTo().window(childWindow);
			System.out.println(driver.switchTo().window(childWindow).getTitle());
		
			}
			}
			// This is to switch to the main window
			//driver.switchTo().window(mainWindow);
			
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.findElement(By.id("attach-sidesheet-view-cart-button")).click();
			driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
			String expectedTitle = "Amazon.in Shopping Cart";
			String actualTitle = "";
			actualTitle = driver.getTitle();
			
			
		
			if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	         
	            
	        }
			
	       Select Quantity = new Select(driver.findElement(By.name("quantity")));
	       Quantity.selectByVisibleText("2");
	       Quantity.selectByValue("2");
	       Quantity.selectByIndex(2);
    
	       Thread.sleep(5000);
	      
	       driver.switchTo().window(mainWindow);
	     
	     
	       driver.findElement(By.id("nav-hamburger-menu")).click();
           driver.findElement(By.xpath("(//div[@id='hmenu-content']//a)[8]")).click();
           driver.findElement(By.linkText("DSLR Cameras")).click();
   
   
           //20,000
           driver.findElement(By.xpath("//*[@id=\"leftNav\"]/ul[3]/div/li[5]/span/a")).click();
           ////*[@id="leftNav"]/ul[3]/div/li[5]/span/a/span
 

           ////*[@id="p_72/1318476031"]/span/a/section/span
           //avg.review
           driver.findElement(By.xpath("//*[@id=\"p_72/1318476031\"]/span/a/section/span")).click();
   

           driver.findElement(By.id("p_n_feature_five_browse-bin/1484884031")).click();
	
	
	       driver.findElement(By.xpath("//*[@id=\"p_89/Canon\"]/span/a/span")).click();
	  
	       driver.findElement(By.xpath("//*[@id=\"p_89/Nikon\"]/span/a/span")).click();
	  
	       driver.findElement(By.linkText("Nikon D5600 Digital Camera 18-55mm VR Kit (Black)")).click();
	  
	       String mainWindow1=driver.getWindowHandle();
		   Set<String> set1 =driver.getWindowHandles();
	       Iterator<String> itr1= set1.iterator();
		   while(itr1.hasNext()){
		   String childWindow=itr1.next();
		  
		   if(!mainWindow1.equals(childWindow)){
		   driver.switchTo().window(childWindow);
		   System.out.println(driver.switchTo().window(childWindow).getTitle());
		
		   }
		   }
	      
	       driver.findElement(By.id("add-to-cart-button")).click();
		   driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		   driver.findElement(By.id("hlb-view-cart")).click();
		   
		   driver.findElement(By.id("nav-link-accountList")).click();
		  
		   driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span")).click();
		
	
		    
		  // driver.findElement(By.id("nav-link-accountList")).click();
		   // driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span")).click();
		
		    driver.findElement(By.id("ap_email")).sendKeys("8754259725");
		    driver.findElement(By.id("continue")).click();
		    driver.findElement(By.id("ap_password")).sendKeys("Revathi@2020");
		    driver.findElement(By.id("signInSubmit")).click();
		    
		    driver.findElement(By.id("nav-cart")).click();
		    Thread.sleep(5000);
		    
		    driver.quit();
		   

   
	
	}
	     
		
			
			
			
			
	}
			
			
	
		
	


