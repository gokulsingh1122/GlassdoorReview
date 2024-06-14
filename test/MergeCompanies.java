package test;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MergeCompanies {

    public static void main(String[] args) throws AWTException, InterruptedException {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "C://Workspace//Webdriver//chromedriver-win64//chromedriver-win64//chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
        
       //  UnifiedLogin login= new UnifiedLogin();
       
        
     // Navigate to Admin Url
     		driver.get("https://admin.uat.competiscan.com/");
     		driver.manage().window().maximize();
     		//Print title of Unified login page 
     		System.out.println("Title: "+ driver.getTitle());
     		
     		// get current page url 
     		System.out.println(driver.getCurrentUrl());
     		
     		//Enter UserName 
     		driver.findElement(By.id("username")).sendKeys("gokulsingh");
     		//Enter Password
     		driver.findElement(By.id("password")).sendKeys("Gokul@nmg12345");
     		//Click on Sign in Button 
     		driver.findElement(By.className("v-btn__content")).click();
     		
     		Thread.sleep(5000);
     		//Verify Landing Admin Page Url
     		System.out.println(driver.getCurrentUrl());
     		
     		// wait 5 secods
     		Thread.sleep(2000);
     		
     		//Click on Logout icon
     		//driver.findElement(By.cssSelector("button[title='Sign Out']")).click();
     		// Click on Manage Client Users 
     		// driver.findElement(By.cssSelector("div.v-list-item__title")).click();
     		
     		Thread.sleep(2000);
     		
     		// Login with wrong user credentials 
     		
     		String comp1="Test1";
     		String comp2="Test2";
     		
     		//Verify Landing page url 
     		System.out.println(driver.getCurrentUrl());
     		
     		
     		driver.findElement(By.xpath("(//div[@class='v-list-item__title'])[3]")).click();// Click on Search Management
     		Thread.sleep(2000);
     		driver.findElement(By.xpath("(//div[@class='v-list-item__title'])[9]")).click();//Click on Merge Companies
     		
     		Thread.sleep(2000);
     		
     		// Verify Merge Companies url
     		String expected_url="https://admin.uat.competiscan.com/merge-company";
     		
     		String actual_url= driver.getCurrentUrl(); //Verify if the Merge companies url is correct or not 
     		if(expected_url.equals(actual_url))
     		{
     			System.out.println("Test Pass Url is: "+ actual_url);
     		}
     		else
     		{
     			System.out.println("Test Failed: Url Mismatch: "+ actual_url);
     		} 
     		
     		
     		
     		WebElement comp_to_merge = driver.findElement(By.xpath("//input[@id='input-142']"));  // locate "Companies to be megred" Inputbox
     		comp_to_merge.click();// click on "Companies to be megred"
//     		Thread.sleep(000); 
     		comp_to_merge.sendKeys(comp1);//Enter "Companies to be megred" in Inputbox
//     		Thread.sleep(10000);
     		WebElement element1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='searchForm__list']")));// select company from suggestion
     		element1.click();
     		
     		Thread.sleep(2000);
     		
     		WebElement merge_with= driver.findElement(By.xpath("//div[@class='v-select__selections']")); // Locate "Merge with company"
     		merge_with.click();
     		
     		driver.findElement(By.xpath("//input[@id='input-145']")).sendKeys(comp2);//Enter "Merge_with" company in Inputbox
     		
     		WebElement element2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='v-list-item__title'])[30]")));// select company from suggestion
     		element2.click();
     		
     		
     		
//     		driver.quit();
     		

     		
     		
     		
     		
}
}

