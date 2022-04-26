package shopping;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.UtilitiesTest;

public class ShoppingTest extends UtilitiesTest {

    String baseUrl = "https://mobile.x-cart.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyThatUserShoudPlaceOrderSuccessfullyForOllietheAppControlledRobot() throws InterruptedException {
        // Hover mouse on Hot deals tab
        mouseHoverAction(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        // Hover mouse on Bestsellers and click
        mouseHoverActionClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        //Verify text
        String expectedText = "Bestsellers";
        // Get element for actual text
        String actualText = getActualText(By.id("page-title"));
        //Validate expected text and actual test
        Assert.assertEquals(expectedText, actualText);
        // Hover mouse on sort by
        mouseHoverAction(By.xpath("//span[contains(text(),'Sort by:')]"));
        // click on A to z
        mouseHoverActionClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
        Thread.sleep(1000);
        //Hover mouse to Avengers product
        mouseHoverAction(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[4]/div[1]/div[1]/a[1]/img[1]"));
        // Click on add to cart for Avengers product
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[4]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]"));
        // Verify the message "Product has been added to your cart"
        String expectedText1 = "Product has been added to your cart";
        // Get actual text from web
        String actualMessage1 = getActualText(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        // Validate text
        Assert.assertEquals(expectedText1, actualMessage1);
        // Close the message
        clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]"));
        // Click on your cart icon and click on your cart buttton
        Thread.sleep(1000);
        mouseHoverActionClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
        // Verify text
        String expectedText2 = "Your shopping cart - 1 item";
        //get actual text
        String actualText2 = getActualText(By.id("page-title"));
        // Validate text
        Assert.assertEquals(expectedText2, actualText2);
        // Verify subtotal amount
        String expectedText3 = "Subtotal: $14.99";
        //Actual text display
        String actualText3 = getActualText(By.xpath("//ul[@class='sums']//li[@class='subtotal']"));
        //Validate data
        Assert.assertEquals(expectedText3,actualText3);
        // Verify Total amount
        String expectedText4 = "$20.75";
        //Actual text display
        String actualText4 = getActualText(By.xpath("//li[@class='total']"));
        //Validate data
        Assert.assertEquals(expectedText3,actualText3);
        Thread.sleep(1000);
        //Click on go to checkout button
        clickOnElement(By.xpath("//span[contains(text(),'Go to checkout')]"));
        //Verify text as per requirement
        String expectedText6 = "Log in to your account";
        // Get actual text
        String actualText6 = getActualText(By.xpath("//h3[contains(text(),'Log in to your account')]"));
        //Validate text
        Assert.assertEquals(expectedText6, actualText6);
        // Enter email address
        sendTextToElement(By.id("email"), "125@gmail.com");
        //Click on continue button
        clickOnElement(By.xpath("//span[contains(text(),'Continue')]"));
        Thread.sleep(3000);
        // Verify text as per requirement
        String expectedText7 = "Secure Checkout";
        // get actual text from element
        String actualText7 = getActualText(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]"));
        //Validate text
        Assert.assertEquals(expectedText7, actualText7);
        //Enter first name
        sendTextToElement(By.id("shippingaddress-firstname"), "Harry");
        // Enter last name
        sendTextToElement(By.id("shippingaddress-lastname"), "Thake");
        // Enter address
        sendTextToElement(By.id("shippingaddress-street"), "20 Sweet Lane");
        // Enter City
        sendTextToElement(By.id("shippingaddress-city"), "London");
        // Enter State
        sendTextToElement(By.id("shippingaddress-custom-state"), "Middlesex");
        // Zip Code
        sendTextToElement(By.id("shippingaddress-zipcode"), "AB1 2CD");
        // Click on checkbox
        clickOnElement(By.id("create_profile"));
        // Enter password
        sendTextToElement(By.id("password"), "London123");
        Thread.sleep(3000);
        // Select local shipping option
        clickOnElement(By.id("method128"));
        // Select payment method COD
        clickOnElement(By.id("pmethod6"));
        // Verify the total
           String expectedMessage8 ="$21.77";
           String actualMessage8 = getActualText(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]"));
           Assert.assertEquals(actualMessage8,expectedMessage8);
        // mouse hover to place order
        mouseHoverAction((By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]")));
        //Click on place order
      clickOnElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]"));

        // Verify text
        String expectedText5 = "Thank you for your order";
        // Get actual text from element
       String actualText5 = getActualText(By.id("page-title"));
        // Validate text
        Assert.assertEquals(expectedText5,actualText5);
    }
    @Test
    public void verifyUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        // Hover mouse on Hot deals tab
        mouseHoverAction(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        // Hover mouse on Bestsellers and click
        mouseHoverActionClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        //Verify text
        String expectedText = "Bestsellers";
        // Get element for actual text
        String actualText = getActualText(By.id("page-title"));
        //Validate expected text and actual test
        Assert.assertEquals(expectedText, actualText);
        // Hover mouse on sort by
        mouseHoverAction(By.xpath("//span[contains(text(),'Sort by:')]"));
        // click on A to z
        mouseHoverActionClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
        // click on add to cart button of required product
        mouseHoverAction(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[9]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]"));
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[9]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]"));
        // Verify the message "Product has been added to your cart"
        String expectedText1 = "Product has been added to your cart";
        // Get actual text from web
        String actualMessage1 = getActualText(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        // Validate text
        Assert.assertEquals(expectedText1, actualMessage1);
        // Close the message
        clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]"));
        // Click on your cart icon and click on your cart buttton
        mouseHoverActionClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
        // Verify text
        String expectedText2 = "Your shopping cart - 1 item";
        //get actual text
        String actualText2 = getActualText(By.id("page-title"));
        // Validate text
        Assert.assertEquals(expectedText2, actualText2);

        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));
        Thread.sleep(1000);

//         Verify the text “Are you sure you want to clear your cart?” on alert

    Alert alert = driver.switchTo().alert();
    String expectedMessage4 ="Are you sure you want to clear your cart?";
    String actualMessage4 = alert.getText();
    Assert.assertEquals(actualMessage4,expectedMessage4);

        //    1.12 Click “Ok” on alert
        acceptAlert();
        Thread.sleep(1000);

        //Verify text
        String expectedText3 = "Item(s) deleted from your cart";
        String actualText3 = getActualText(By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]"));
        //Validate Text
        Assert.assertEquals(expectedText3,actualText3);
        // Verify text from requirement
        String expectedText4 = "Your cart is empty";
        String actualText4 = getActualText(By.xpath("//h1[@id='page-title']"));
        //Validate text
        Assert.assertEquals(expectedText4,actualText4);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
////    1.11 Verify the text “Are you sure you want to clear your cart?” on alert
//
//    Alert alert = driver.switchTo().alert();
//    String expectedMessage4 ="Are you sure you want to clear your cart?";
//    String actualMessage4 = alert.getText();
//    Assert.assertEquals(actualMessage4,expectedMessage4);
///        1.22 Verify the total $99.00 ($299.00)
//        Thread.sleep(2000);
//        String expectedMessage8 ="$299.00";
//        String actualMessage8 = getTextFromElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]"));
//        Assert.assertEquals(actualMessage8,expectedMessage8);
//
////        1.23 Click on “Place Order” Button
//        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]"));
//        clickOnElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]"));
//
////        1.24 Verify the text “Thank you for your order”
//        String expectedMessage9 ="Thank you for your order";
//        String actualMessage9 = getTextFromElement(By.id("page-title"));
//        Assert.assertEquals(actualMessage9,expectedMessage9);
