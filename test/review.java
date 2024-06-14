package test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.entity.mime.StringBody;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;


public class review {

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws InterruptedException, AWTException, ParseException{
		//System.setProperty("webdriver.chrome.driver", "C://Workspace//Webdriver//chromedriver_win32//chromedriver.exe");
		// Intialize Webdriver Interface and chrome driver class
		WebDriver driver= new ChromeDriver();
		
		
		// Click on Sign in Button
		//driver.findElement(By.cssSelector("buttonp[class='button__button-module__Button button-base__button-base-module__Button']")).click();
		
		
		String password="Hunterr@123";
		String jobtitle="SEO Specialist";
		String location="Gurgaon";
		String Employer="NMG Technologies";
		String firstname="Sachin";
		String lastname="Malik";
//		String newurl ="https://temp-mail.org/en/";
		String total_yoe="5";
		String relevent_yoe="2";
		String review_headline="Toxic Work Culture and Unhealthy Environment at NMG Technologies";
		String pros="I have nothing that i can say is a Pros";
		
		String cons="I regret to say that my experience at NMG Technologies has been far from positive. The work culture here is incredibly toxic, and it has significantly impacted my overall well-being and job satisfaction.\r\n"
				+ "\r\n"
				+ "Favoritism and Office Politics: There is a pervasive atmosphere of favoritism and politics that undermines any sense of fairness or meritocracy. Promotions and recognitions are often based on personal connections rather than performance or skills, creating a demoralizing environment where hard work goes unnoticed, and sycophancy is rewarded.\r\n"
				+ "\r\n"
				+ "Oppressive Management Style: The management style is oppressive and unsupportive. Constructive feedback is rarely given, and when it is, it's often delivered in a condescending manner. There is a clear lack of empathy and understanding from the higher-ups, making it difficult to feel valued or respected as an employee. Instead of fostering a collaborative and positive work environment, the management tends to focus on blame and criticism.\r\n"
				+ "\r\n"
				+ "Overwhelming Workload: The workload is consistently overwhelming, with unrealistic deadlines and expectations. There is little regard for work-life balance, and employees are often expected to put in long hours without any recognition or compensation. This has led to high levels of stress and burnout among the team, with many talented individuals choosing to leave the company as a result.\r\n"
				+ "\r\n"
				+ "Poor Communication: Communication within the company is poor, with important information often being withheld or miscommunicated. This lack of transparency only adds to the frustration and confusion, making it challenging to perform effectively.\r\n"
				+ "\r\n"
				+ "Lack of Professional Growth: There is a significant lack of opportunities for professional growth and development. Training and mentorship are virtually non-existent, leaving employees feeling stagnant and unchallenged.\r\n"
				+ "\r\n"
				+ "In summary, the toxic work culture and environment at NMG Technologies make it an incredibly difficult place to work. I would not recommend this company to anyone looking for a healthy and supportive workplace.";
		
		String base_pay="660000";
		
		//Generate a temp email 
		
		driver.get("https://fakeemail.net/");
	
		driver.manage().window().maximize();	//maximize window 
		

		Thread.sleep(5000); 
		
		// click on delete 
		driver.findElement(By.xpath("//button[@id='click-to-delete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn-rds icon-btn bg-theme click-to-copy copyIconGreenBtn']")).click();
		
		
		String username= getClipboardContents();
		
		
		//Generate Review
		
//		 String apiResponse = makePostApiCall("https://api8-uat.competiscan.com/admin-report/v1/daily-status-report", "param1=value1&param2=value2");
	
		
		//  review 
		
		
		// Navigate to Admin Url
		driver.get("https://www.glassdoor.co.in/index.htm");
		driver.manage().window().maximize();
		
	
		
		// Login
		// Enter User Name
		driver.findElement(By.xpath("//input[@id='inlineUserEmail']")).sendKeys(username);
		
		 //Click on Continue with Email Button
		driver.findElement(By.cssSelector("button[class='Button Button']")).click();
		Thread.sleep(2000);
		//Enter Password
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='TextInput']")).sendKeys(password);
		// Click on Sign in
		
		driver.findElement(By.cssSelector("button[class='Button Button']")).click();
//		//CAPCTA VERIFICATION
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@class=recaptcha-checkbox-checkmark']")).click();

		
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//button[@class='Button_FFvDM Button_E1bic']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='Button_FFvDM Button_E1bic']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='Button_FFvDM Button_E1bic']")).click();
		
		Thread.sleep(2000);
		
		// Select Employment Status  
		driver.findElement(By.xpath("//input[@class='InputElement_nl6gs']")).click();
		
		
		//Select Job Title
		 WebElement autocompleteField1 =driver.findElement(By.xpath("//input[@id='validatedAutocomplete-jobTitle']"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", autocompleteField1);
		 autocompleteField1.sendKeys(jobtitle);
		Robot r = new Robot();
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("xcvzxc");
		
		
		// Select Location
				 //WebElement autocompleteField2 =driver.findElement(By.xpath("//input[@id='validatedAutocomplete-location']"));
				 	//((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", autocompleteField2);
				 //autocompleteField2.sendKeys(location);
		 
		 driver.findElement(By.xpath("//input[@id='validatedAutocomplete-location']")).sendKeys(location);
		 r.delay(2000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.delay(500);
		 r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("test2");
		
		
//		//Select Employer
		driver.findElement(By.xpath("//input[@id='validatedAutocomplete-employer']")).sendKeys(Employer);
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//		//Click Next
		driver.findElement(By.xpath("//button[@class='Button_FFvDM Button_E1bic']")).click();
		
		Thread.sleep(10000);
		//Enter First Name
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
		
		//Enter Last Name
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//button[@class='Button_FFvDM Button_E1bic']")).click();
		
		
		//Select Industry
		Thread.sleep(3000);
		WebElement dropdownElement=driver.findElement(By.xpath("//select[@aria-hidden='true']"));
		Select dropdown = new Select(dropdownElement);
		 dropdown.selectByVisibleText("Tech India");
		 
		//Select Specilization
		Thread.sleep(3000);
		WebElement dropdownElement1=driver.findElement(By.xpath("(//select[@aria-hidden='true'])[2]	"));
		Select dropdown2 = new Select(dropdownElement1);
		dropdown2.selectByVisibleText("Engineering");
			 
		// Click Next
		driver.findElement(By.xpath("//button[@class='Button_FFvDM Button_E1bic']")).click(); 
		Thread.sleep(5000);
		
		driver.quit();
		
		WebDriver driver1= new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(20));
		// Navigate to Admin Url
		driver1.get("https://www.glassdoor.co.in/index.htm");
		driver1.manage().window().maximize();
		
		driver1.findElement(By.id("inlineUserEmail")).sendKeys(username);
		
		//Click on Continue with Email Button
		driver1.findElement(By.cssSelector("button[class='Button Button']")).click();
		Thread.sleep(2000);
		//Enter Password
		Thread.sleep(2000);
		driver1.findElement(By.cssSelector("input[class='TextInput']")).sendKeys(password);
		// Click on Sign in
		driver1.findElement(By.cssSelector("button[class='Button Button']")).click();
		
		Thread.sleep(3000);
		// Click on Companies menu
		//driver1.findElement(By.xpath("//a[@href='/Reviews/index.htm']")).click();
		
		driver1.findElement(By.xpath("(//a[@href='/Reviews/index.htm'])[1]")).click();
		
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@id='companyAutocomplete-companyDiscover-employerSearch']")).sendKeys(Employer);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Click Search

	
		Thread.sleep(5000);
		// Click on Add Review or Salary Button 
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='gd-ui-button fullWidth css-14xfqow evpplnh0']")));
		 ((JavascriptExecutor) driver1).executeScript("arguments[0].scrollIntoView(true);", element);

	        // Ensure the element is enabled and displayed
	        if(element.isDisplayed() && element.isEnabled()) {
	        	
	            element.click();
	        } else {
	            System.out.println("Element not interactable: " + element);
	        }
	       // Click Company Review
	        driver1.findElement(By.xpath("(//div[@class=' css-1pbiyf3 e1lxy69z2'])[1]")).click();
	        
	        // Enter Employer Name
	        driver1.findElement(By.xpath("//input[@id='survey-AddCompany-component-autocomplete-id']")).sendKeys(Employer);
	        Thread.sleep(1000);
	        r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.delay(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
	        //Enter Job Title 
			driver1.findElement(By.xpath("//input[@name='survey-component-jobTitle']")).sendKeys(jobtitle);
			Thread.sleep(1000);
//		    r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
			r.delay(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
			//Enter Location
			driver1.findElement(By.xpath("//input[@name='survey-job-component']")).sendKeys(location);
				   Thread.sleep(1000);
			        r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					r.delay(1000);
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
					
			//Click Next
			driver1.findElement(By.xpath("//button[@class='gd-ui-button css-8atqhb mt-xsm mb-lg mb-md-xxl css-5jp6uo css-1j3q282 e5tvpqr2']")).sendKeys(location);
		   Thread.sleep(1000);
	        r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.delay(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(5000);
			
			// Select rating 
			
			driver1.findElement(By.xpath("//input[@id='survey-AddCompany-component-autocomplete-id']")).click();
			Thread.sleep(1000);
	        r.keyPress(KeyEvent.VK_TAB);
	       
	        r.keyRelease(KeyEvent.VK_TAB);
	        r.delay(1000);
	        r.delay(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(2000);
	        
	        // Select Employment Status
	        
	        driver1.findElement(By.xpath("(//div[@class='selectedLabel'])[1]")).click();
	        r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.delay(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			// Enter Review Headline
			
			driver1.findElement(By.xpath("//input[@id='ReviewHeadline']")).sendKeys(review_headline);
//			driver1.quit();
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//textarea[@id='ProsTextField']")).sendKeys(pros);
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//textarea[@id='ConsTextField']")).sendKeys(cons);	
			
			Thread.sleep(2000);
			
//			driver1.findElement(By.xpath("(//label[@class='css-1olsgwk e1eelu4e0'])[10]")).click();
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//			driver1.findElement(By.xpath("(//label[@class='css-1olsgwk e1eelu4e0'])[11]")).click();
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			driver1.findElement(By.xpath("(//label[@class='css-1olsgwk e1eelu4e0'])[12]")).click();
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			driver1.findElement(By.xpath("(//label[@class='css-1olsgwk e1eelu4e0'])[13]")).click();
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
			
			
			//Click Checkbox
			driver1.findElement(By.xpath("//div[@class='css-9ivpv4 e1ho438e2']")).click();
			
			// Click on Submit Review Button
			driver1.findElement(By.xpath("//button[@class='gd-ui-button css-1dach6o css-5jp6uo css-1j3q282 e5tvpqr2']")).click();
			
			Thread.sleep(5000);
			// Enter Base Pay
			driver1.findElement(By.xpath("//input[@id='comp-base-pay']")).sendKeys(base_pay);
			Thread.sleep(1000);
			driver1.findElement(By.xpath("(//div[@class='selectedLabel'])[2]")).click();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
				
			
			
			
			//Click next
			
			driver1.findElement(By.xpath("//button[@class='gd-ui-button d-flex justify-content-center align-items-center mb-md css-8atqhb css-5jp6uo css-1j3q282 e5tvpqr2']")).click();
			Thread.sleep(3000);
			
			driver1.findElement(By.xpath("//button[@class='gd-ui-button d-flex justify-content-center align-items-center mb-md css-8atqhb css-5jp6uo css-1j3q282 e5tvpqr2']")).click();
			Thread.sleep(3000);
			
			//Enter Job Level
			driver1.findElement(By.xpath("//input[@id='jobLevelInput']")).sendKeys(jobtitle);
			
			//Enter Total YOE
			driver1.findElement(By.xpath("(//input[@id='years-experience-input'])[1]")).sendKeys(total_yoe);
			
			//Enter Total YOE
			driver1.findElement(By.xpath("(//input[@id='years-experience-input'])[2]")).sendKeys(relevent_yoe);
			Thread.sleep(1000);
			
			// select Employment status 
			driver1.findElement(By.xpath("//div[@class='selectedLabel']")).click();
			 r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.delay(1000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			
			// Click Next
			driver1.findElement(By.xpath("//button[@class='gd-ui-button d-flex justify-content-center align-items-center mb-md css-8atqhb css-5jp6uo css-1j3q282 e5tvpqr2']")).click();
			
			
			Thread.sleep(4000);
			
			
			// Click Submit
			driver1.findElement(By.xpath("//button[@class='gd-ui-button d-flex justify-content-center align-items-center mb-md css-8atqhb css-5jp6uo css-1j3q282 e5tvpqr2']")).click();
	
			Thread.sleep(4000);
			
			System.out.println("Review added successfully");
			
			
			//Click on Continue to Glassdoor button
			
			driver1.findElement(By.xpath("//button[@class='gd-ui-button css-5jp6uo css-1mg0y8g e5tvpqr2']")).click();
			
			Thread.sleep(2000);// sleep
			
			
//			//Generate a temp email 
//			
//			driver.get("https://fakeemail.net/");
//		
//			driver.manage().window().maximize();	//maximize window 
//			
//			Thread.sleep(5000); 	
	}

	// Method to make a POST API call and return the response as a string
//    private static String makePostApiCall(String url, String params) throws ParseException {
//        String responseString = "";
//        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
//            HttpPost postRequest = new HttpPost(url);
//            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
//            // Assuming params is a URL-encoded string of parameters
//            String[] paramPairs = params.split("&");
//            for (String paramPair : paramPairs) {
//                String[] keyValue = paramPair.split("=");
//                builder.addPart(keyValue[0], new StringBody(keyValue[1], null));
//            }
//            postRequest.setEntity(builder.build());
//
//            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {
//                responseString = EntityUtils.toString(response.getEntity());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return responseString;
//    }

	private static String getClipboardContents()
	{
        String result = "";
        try 
        {
            result = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } 
        catch (UnsupportedFlavorException | IOException e)
        {
            ((Throwable) e).printStackTrace();
        }
        return result;
    }


}