
package ManojYedla.Subscription_Assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    public static WebDriver driver;

    public BaseClass() {
        // Set the path to the ChromeDriver executable (you should download this driver)
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        
        // Initialize the ChromeDriver instance
        this.driver = new ChromeDriver();
    }
    
    @BeforeTest
    public void configureDriver() {
        // Navigate to a URL
        this.driver.get("https://subscribe.stctv.com/");
        driver.manage().window().maximize();
    }
    
    @AfterTest
    public void closeDriver() {
        // Close the WebDriver instance when done
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}


