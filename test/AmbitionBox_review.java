package test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
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

public class AmbitionBox_review {

    public static void main(String[] args) throws AWTException, InterruptedException {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "C://Workspace//Webdriver//chromedriver-win64//chromedriver-win64//chromedriver.exe");

        // Create ChromeOptions instance and set options
//          ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
//        options.addArguments("accept-language=en-US,en;q=0.9");
//        options.addArguments("accept-encoding=gzip, deflate, br");
//        options.addArguments("window-size=1200x600");
//        options.addArguments("--headless=new");
//          options.addArguments("--incognito");

        // Initialize the ChromeDriver with options
        //WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
  

        // User data
        String username = "nilos98563@fna6.com";
        String password = "Hunterr@123";
        
        String jobtitle = "HR Manager";
        String location = "Gurgaon";
        String Employer = "NMG Technologies";
        String firstname = "Ashish";
        String lastname = "Rikhari";
        String total_yoe = "5";
        String relevent_yoe = "2";
        String review_headline = "Worst Experience as a HR Manager";
        String pros = "I have nothing that I can say is a Pros";
        String cons = "As an HR Manager at NMG Technologies, I feel compelled to share my concerns about the deeply troubling work culture and environment within the company. Here are the key issues:\r\n"
                + "\r\n"
                + "Pervasive Favoritism and Politics: Meritocracy is virtually non-existent. Promotions and recognitions are frequently based on personal connections rather than performance or skills, leading to a demoralizing atmosphere where hard work goes unnoticed.\r\n"
                + "\r\n"
                + "Oppressive Management Style: Constructive feedback is rare and often delivered in a condescending manner. The lack of empathy and understanding from the higher-ups creates an environment where employees feel neither valued nor respected. Instead of promoting collaboration and positivity, management focuses on blame and criticism.\r\n"
                + "\r\n"
                + "Overwhelming Workload and Unrealistic Expectations: Employees are consistently faced with unrealistic deadlines and expectations, with little regard for work-life balance. Long hours are expected without any recognition or compensation, leading to high levels of stress and burnout.\r\n"
                + "\r\n"
                + "Poor Communication: There is a significant lack of transparency, with important information often being withheld or miscommunicated. This adds to frustration and confusion, making it difficult for employees to perform effectively.\r\n"
                + "\r\n"
                + "Lack of Professional Growth Opportunities: Training and mentorship opportunities are almost non-existent, leaving employees feeling stagnant and unchallenged. This hinders professional development and contributes to low job satisfaction.\r\n"
                + "\r\n"
                + "High Turnover Rate: Due to the toxic environment, many talented individuals are choosing to leave the company. This not only impacts team morale but also the overall productivity and success of the organization.\r\n"
                + "\r\n"
                + "In conclusion, the toxic work culture and environment at NMG Technologies make it an incredibly challenging place to work. As an HR Manager, it is disheartening to see such a negative impact on the well-being and job satisfaction of our employees. I strongly advise potential candidates to consider these issues before joining the company.";
        String base_pay = "660000";

        // Launch URL
        driver.get("https://www.ambitionbox.com/contribute/company-review-v3?campaign=company_info_header&company_name=NMG%20Technologies");
        driver.manage().window().maximize();

        // Add a delay to mimic human interaction
        Thread.sleep(2000);

//        WebElement object1 = driver.findElement(By.xpath("//input[@id='homeTypeahead']"));
//        Thread.sleep(5000);
//        object1.click();
//        Thread.sleep(5000);
//        object1.sendKeys(Employer);
//        Thread.sleep(2000);
//        object1.sendKeys(Keys.RETURN);
//        Robot r = new Robot();
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//        String url = driver.getCurrentUrl();
//        Thread.sleep(2000);
//        System.out.println(url);
//        System.out.println("Launched");
//        WebElement button = driver.findElement(By.xpath("(//span[@class='g-btn__label g-btn__label--md g-btn__label--filled g-btn__label--loader'])[1]"));
 
        
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
//        
        
//        button.click();

        // Additional code to handle the result of the button click
        // ...

 
        
        WebElement designation=driver.findElement(By.xpath("//input[@id='jobProfileName']"));
        designation.sendKeys(jobtitle);
        Thread.sleep(10000);
        Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
        driver.findElement(By.xpath("(//i[@class='icon icon-star-round'])[5]")).click(); // select Overall Rating
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[@class='icon icon-star-round'])[10]")).click(); // select Work-Life balance
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[@class='icon icon-star-round'])[15]")).click();// select salary and benfiets
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[@class='icon icon-star-round'])[20]")).click(); // select Promotions / Appraisal
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[@class='icon icon-star-round'])[25]")).click();// select Job security
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[@class='icon icon-star-round'])[30]")).click();// Skill Development / Learning
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[@class='icon icon-star-round'])[35]")).click();//Work Satisfaction
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[@class='icon icon-star-round'])[40]")).click();//Company Culture
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//textarea[@id='likesText']")).sendKeys(pros);  // Enter Likes/ Pros
        driver.findElement(By.xpath("//textarea[@id='disLikesText']")).sendKeys(cons); // Enter Dislikes/Cons
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//p[@class='body-large heading'])[9]")).click();
        driver.findElement(By.xpath("(//span[@class='label-text'])[1]")).click();//Does your job require you to travel for work?
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//p[@class='body-large heading'])[10]")).click();
        driver.findElement(By.xpath("(//span[@class='label-text'])[3]")).click();//What are your working days?
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//p[@class='body-large heading'])[11]")).click();
        driver.findElement(By.xpath("(//span[@class='label-text'])[9]")).click();//Are your working hours strict or flexible?
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//p[@class='body-large heading'])[12]")).click();
        driver.findElement(By.xpath("(//span[@class='label-text'])[12]")).click();//What gender do you identify with?
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//p[@class='body-large heading'])[13]")).click();
        driver.findElement(By.xpath("(//span[@class='label-text'])[16]")).click();//What is the work policy at NMG Technologies?*
        Thread.sleep(2000);
        WebElement select_location=driver.findElement(By.xpath("//input[@id='jobLocation']"));// Select Location
//        select_location.click();
        select_location.sendKeys(location);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//p[@class='body-large heading'])[14]")).click();
        driver.findElement(By.xpath("(//span[@class='label-text'])[19]")).click();//Do you currently work here?*
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='dropdown__text-area'])[3]")).click();//select month 
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@class='dropdown-list__list-label-text'])[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='dropdown__text-area'])[4]")).click();// select year
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='dropdown-list__list-label-text'])[4]")).click();// select Year
        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//div[@class='dropdown__text-area'])[7]")).click();// select Employment Type 
//        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='input-btn'])[1]")).click();
        Thread.sleep(8000);
        
        System.out.println("test11");
        WebElement select_department=driver.findElement(By.xpath("//div[@class='m-input m--in-active set-margin']"));	
        System.out.println("test22");
        select_department.click();
        System.out.println("test33");
        Thread.sleep(2000);
        select_department.sendKeys("Software Development");
        
        
//        driver.findElement(By.xpath("(//span[@class='g-btn__label g-btn__label--md g-btn__label--filled g-btn__label--loader'])[1]")).click();
        
//        String url2 = driver.getCurrentUrl();
//        Thread.sleep(2000);
//        System.out.println(url2);
//        System.out.println("Launched 2");
        Thread.sleep(5000);
        // Close the driver
        driver.quit();
    }
}

