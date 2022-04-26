package hotdeals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.UtilitiesTest;

import java.util.ArrayList;
import java.util.List;

public class HotDealsTest extends UtilitiesTest {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifySaleProductsPriceArrangeAToZ() {
        // Move mouse hover as per requirement
        mouseHoverAction(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        mouseHoverActionClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        // Verify text as per requirement
        String expectedText = "Sale";
        // Get actual text from webelements
        String actualText = getActualText(By.id("page-title"));
        // Validate text
        Assert.assertEquals(expectedText, actualText);
        // Hover mouse on "sort by"
        mouseHoverAction(By.xpath("//span[contains(text(),'Sort by:')]"));
        // Hover and select A to Z
        mouseHoverActionClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"));
        //
        ArrayList<String> list = new ArrayList<>();
        List<WebElement> elementsList = driver.findElements(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]"));
        for (WebElement we : elementsList) {
            list.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : list) {
            sortedList.add(s);
        }
    }

    @Test
    public void VerifySaleProductPriceArrangeLowToHigh() {
        // Move mouse hover as per requirement
        mouseHoverAction(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        mouseHoverActionClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        // Verify text as per requirement
        String expectedText = "Sale";
        // Get actual text from webelements
        String actualText = getActualText(By.id("page-title"));
        // Validate text
        Assert.assertEquals(expectedText, actualText);
        // Hover mouse on "sort by"
        mouseHoverAction(By.xpath("//span[contains(text(),'Sort by:')]"));
        // hover and select Price low-high
        mouseHoverActionClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"));
    }

    @Test
    public void verifySalesProductsArrangeByZtoA() {
        // Move mouse hover as per requirement
        mouseHoverAction(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        mouseHoverActionClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        // Verify text as per requirement
        String expectedText = "Sale";
        // Get actual text from webelements
        String actualText = getActualText(By.id("page-title"));
        // Validate text
        Assert.assertEquals(expectedText, actualText);
        // Hover mouse on "sort by"
        mouseHoverAction(By.xpath("//span[contains(text(),'Sort by:')]"));
        // hover mouse and select Rates
        mouseHoverActionClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]"));
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        // Move mouse hover as per requirement
        mouseHoverAction(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        mouseHoverActionClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        // Verify text as per requirement
        String expectedText = "Bestsellers";
        // Get actual text from webelements
        String actualText = getActualText(By.id("page-title"));
        // Validate text
        Assert.assertEquals(expectedText, actualText);
        // Hover mouse on "sort by"
        mouseHoverAction(By.xpath("//span[contains(text(),'Sort by:')]"));
        // Hover mouse and select Name Z-A
        mouseHoverActionClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"));


    }

    @Test
    public void verifyBestSellersProductsPriceArrangedHighToLow() {
        // Move mouse hover as per requirement
        mouseHoverAction(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        mouseHoverActionClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        // Verify text as per requirement
        String expectedText = "Bestsellers";
        // Get actual text from webelements
        String actualText = getActualText(By.id("page-title"));
        // Validate text
        Assert.assertEquals(expectedText, actualText);
        // Hover mouse on "sort by"
        mouseHoverAction(By.xpath("//span[contains(text(),'Sort by:')]"));
        // Hover mouse and select Price High-Low
        mouseHoverActionClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
    }

    @Test
    public void verifyBestSellersProductsArrangedByRates() {
        // Move mouse hover as per requirement
        mouseHoverAction(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        mouseHoverActionClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        // Verify text as per requirement
        String expectedText = "Bestsellers";
        // Get actual text from webelements
        String actualText = getActualText(By.id("page-title"));
        // Validate text
        Assert.assertEquals(expectedText, actualText);
        // Hover mouse on "sort by"
        mouseHoverAction(By.xpath("//span[contains(text(),'Sort by:')]"));
        // Hover mouse and select Price High-Low
        mouseHoverActionClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]"));
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}




