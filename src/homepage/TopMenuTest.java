package homepage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.UtilitiesTest;

public class TopMenuTest extends UtilitiesTest {
    String baseUrl = " https://mobile.x-cart.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test

    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        // Find element and click on link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]"));
        // Expected message to verify
        String expectedText = "Shipping";
        // Get actual message from webelement to verify
        String actualText = getActualText(By.id("page-title"));
        // Validate actual message and expected message
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        // Find element and click on link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
        // Expected message to verify
        String expectedText = "New arrivals";
        // Get actual message from webelement to verify
        String actualText = getActualText(By.id("page-title"));
        // Validate actual message and expected message
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() {
        // Find element and click on link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]"));
        // Expected message to verify
        String expectedText = "Coming soon";
        // Get actual message from webelement to verify
        String actualText = getActualText(By.id("page-title"));
        // Validate actual message and expected message
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        // Find element and click on link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]"));
        // Expected message to verify
        String expectedText = "Contact us";
        // Get actual message from webelement to verify
        String actualText = getActualText(By.id("page-title"));
        // Validate actual message and expected message
        Assert.assertEquals(expectedText, actualText);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
