package copilot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium2 {
    
    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    
 
    @Test
    public void test1(){

        //Search nokia Mobile in flipkart.com and add it into the cart
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.className("_3704LK")).sendKeys("nokia mobile");
        driver.findElement(By.className("L0Z3Pu")).click();
        driver.findElement(By.xpath("//div[text()='Nokia 105 SS 2021 (Single SIM, Black)']")).click();
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
        driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
        driver.findElement(By.xpath("//span[text()='Place Order']")).click();
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
            
            
        //take screenshot in selenium
        //driver.get("https://www.flipkart.com/");
        //File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(src, new File("C:\\Users\\sudha\\Desktop\\screenshot.png"));
        //driver.close();
        
       }
            
    
}
