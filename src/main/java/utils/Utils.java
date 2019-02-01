package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;


import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.Random;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

public class Utils {

    private AppiumDriver<MobileElement> driver;

    public Utils(AppiumDriver driver) {
        this.driver = driver;


    }

    //Tap to an element for 250 milliseconds
    public void tapByElementMills(AndroidElement androidElement) {
        new TouchAction(driver)
                .tap(tapOptions().withElement(element(androidElement)))
                .waitAction().perform();
    }

    //Tap by coordinates
    public void tapByCoordinates(int x, int y) {
        new TouchAction(driver)
                .tap(point(x, y))
                .waitAction().perform();
    }


    //Press by element
    public void pressByElement(AndroidElement element, long seconds) {
        new TouchAction(driver)
                .press(element(element))
                .waitAction(waitOptions(ofSeconds(seconds)))
                .release()
                .perform();
    }


    //Press by coordinates
    public void pressByCoordinates(int x, int y, long seconds) {
        new TouchAction(driver)
                .press(point(x, y))
                .waitAction(waitOptions(ofSeconds(seconds)))
                .release()
                .perform();
    }

    //Horizontal Swipe by percentages
    public void horizontalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);


        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }

    //Vertical Swipe by percentages
    public void verticalSwipeByPercentages(double y_startPercentage, double y_endPercentage, double startXPercentage) {
        Dimension size = driver.manage().window().getSize();
        int x_width = (int) (size.width * startXPercentage);
        int y_startPoint = (int) (size.height * y_startPercentage);
        int y_height = (int) (size.height * y_endPercentage);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(point(x_width, y_startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(x_width, y_height))
                .release().perform();
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

    public String getText(By by) {

        return driver.findElement(by).getText();

    }

    public int randomNumber() {

        Random random = new Random();
        return random.nextInt(10000);


    }


    public void resetData() {
        driver.resetApp();
    }
}
