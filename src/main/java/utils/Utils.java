package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.List;


public class Utils {

    private AppiumDriver<MobileElement> driver;

    public Utils(AndroidDriver driver) {
        this.driver = driver;


    }

    public void clickIdButton(By buttonId) {
        driver.findElement(buttonId).click();
    }


    public void typeText(By view, String text) {
        driver.findElement(view).sendKeys(text);


    }

    public boolean isElementPresent(By by) {

        return driver.findElements(by).size() > 0;
    }


    public void clickByIndex(By id, int number) {
        driver.findElements(id).get(number).click();
    }


    public void resetData() {
        driver.resetApp();
    }
}
