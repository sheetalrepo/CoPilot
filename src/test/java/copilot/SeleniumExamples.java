package copilot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * 
 * find black shows in amazon.com using selenium
 * Add to cart the first item
 * Verify the item is added to cart
 */
public class SeleniumExamples {
    
    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @Test
    public void test1() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("black shoes");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[text()='Skechers']")).click();
        driver.findElement(By.xpath("//span[text()='Skechers Men\'s Afterburn Memory-Foam Lace-up Sneaker']")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.id("nav-cart-count")).click();
        driver.findElement(By.xpath("//span[text()='Skechers Men\'s Afterburn Memory-Foam Lace-up Sneaker']")).isDisplayed();
    }
    
    public static void main(String[] args) {
        
        
    }
    
    
    
}
