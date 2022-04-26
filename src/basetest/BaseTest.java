package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;



    public void openBrowser(String baseUrl) {

        // Setting up browser in incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Get url
        driver.get(baseUrl);
        // Maximize window
        driver.manage().window().maximize();
        // Give implicitTime to window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        driver.quit();
    }
}
