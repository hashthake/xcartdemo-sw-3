package utilities;

import basetest.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UtilitiesTest extends BaseTest {
// Method for click on element
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }
    // Method for get actualText from webelement
    public String getActualText(By by){
       return driver.findElement(by).getText();
    }
    // Method for Mousehover
    public void mouseHoverAction(By by){
        Actions actions = new Actions(driver);
            WebElement mouse = driver.findElement(by);
        actions.moveToElement(mouse).build().perform();
    }
    // Method for Mousehover and click
    public void mouseHoverActionClick(By by) {
        Actions actions = new Actions(driver);
        WebElement mouse1 = driver.findElement(by);
        actions.moveToElement(mouse1).build().perform();
        actions.moveToElement(mouse1).click().build().perform();
    }
    // Method for find element and send data
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public void alert(By by) {
        clickOnElement(by); // Click on Sign in Button
        Alert alert = driver.switchTo().alert();
        alert.accept(); // accepting alert
//       alert.dismiss(); // dismiss alert
//       alert.sendKeys("abc"); // send keys alert
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

}
