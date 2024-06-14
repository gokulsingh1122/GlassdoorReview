package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UnifiedLogin {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver", "D://Workspace//Automation//Drivers//chromedriver.exe");
		// Intialize Webdriver Interface and chrome driver class
		WebDriver driver= new ChromeDriver();
		
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
		driver.findElement(By.cssSelector("button[title='Sign Out']")).click();
		// Click on Manage Client Users 
		// driver.findElement(By.cssSelector("div.v-list-item__title")).click();
		
		Thread.sleep(2000);
		
		// Login with wrong user credentials 
		
		
	
		//Verify Landing page url 
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		  driver.quit(); // closed only current window driver.quit(); // closed all window
		  
		  
		 		
	}

}
