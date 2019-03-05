package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class Utils {

    private AppiumDriver<MobileElement> driver;

    public Utils(AppiumDriver driver) {
        this.driver = driver;
    }


    //Horizontal Swipe by percentages
    public void horizontalSwipeByPercentage(double x_startPercentage, double x_endPercentage, double startYPercentage) {
        Dimension size = driver.manage().window().getSize();
//        Dimension scrollup = driver.findElement((by)).getSize();
        int x_width = (int) (size.width * x_endPercentage);
        int x_startPoint = (int) (size.width * x_startPercentage);
        int y_height = (int) (size.height * startYPercentage);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(point(x_startPoint, y_height))
                .waitAction()
                .moveTo(point(x_width, y_height))
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
                .moveTo(point(x_width, y_height))
                .release().perform();
    }

    public void clickIdButton(By buttonId) {
        driver.findElement(buttonId).click();
    }


    public void typeText(By view, String text) {
        driver.findElement(view).sendKeys(text);

    }

    public void clearTextField(By by) {
        driver.findElement(by).clear();
    }

    public boolean isElementEnabled(By by) {
        return driver.findElement(by).isEnabled();
    }

    public boolean isElementSelected(By by) {
        return driver.findElement(by).isSelected();
    }

    public boolean isElementSelectedByIndex(By by, int index) {
        return driver.findElements(by).get(index).isSelected();
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

    public boolean findElementByText(By by, String text) {
        List<MobileElement> list = driver.findElements(by);
        for (MobileElement el : list) {
            if (el.getText().equals(text)) {
                return true;
            }
        }
        return false;
    }


    public void clickElementByText(By by, String text) {
        List<MobileElement> list = driver.findElements(by);
        for (MobileElement el : list) {
            if (el.getText().equals(text)) {
                el.click();
                break;
            }
        }
    }

    public void horizontalSwipeFromCenterToLeft(By by) {
        MobileElement element = driver.findElement(by);
        int widthX = element.getLocation().getX();
        int heightY = element.getLocation().getY();
        int width = widthX + element.getSize().getWidth() / 2;
        int height = heightY + element.getSize().getHeight() / 2;
        int widthEnd = element.getLocation().getX() + 2;
        TouchAction swipe = new TouchAction(driver);
        swipe.press(point(width, height))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(point(widthEnd, height))
                .release().perform();
    }

    public void horizontalSwipeFromCenterToLeft(By by, int number) {
        MobileElement element = driver.findElements(by).get(number);
        int widthX = element.getLocation().getX();
        int heightY = element.getLocation().getY();
        int width = widthX + element.getSize().getWidth() / 2;
        int height = heightY + element.getSize().getHeight() / 2;
        int widthEnd = element.getLocation().getX() + 2;
        TouchAction swipe = new TouchAction(driver);
        swipe.press(point(width, height))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(point(widthEnd, height))
                .release().perform();
    }

    public void horizontalSwipeFromCenterToRight(By by) {
        MobileElement element = driver.findElement(by);
        int widthX = element.getLocation().getX();
        int heightY = element.getLocation().getY();
        int width = widthX + element.getSize().getWidth() / 2;
        int height = heightY + element.getSize().getHeight() / 2;
        int widthEnd = element.getSize().getWidth() - 2;


        TouchAction swipe = new TouchAction(driver);
        swipe.press(point(width, height))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(point(widthEnd, height))
                .release().perform();


    }

    public void horizontalSwipeFromCenterToRight(By by, int number) {
        MobileElement element = driver.findElements(by).get(number);
        int widthX = element.getLocation().getX();
        int heightY = element.getLocation().getY();
        int width = widthX + element.getSize().getWidth() / 2;
        int height = heightY + element.getSize().getHeight() / 2;
        int widthEnd = element.getSize().getWidth() - 2;


        TouchAction swipe = new TouchAction(driver);
        swipe.press(point(width, height))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(point(widthEnd, height))
                .release().perform();
    }


    public void scrollVerticalFromCenterToUp(By by) {
        MobileElement element = driver.findElement(by);
        int widthX = element.getLocation().getX();
        int heightY = element.getLocation().getY();
        int width = widthX + element.getSize().getWidth() / 2;
        int height = heightY + element.getSize().getHeight() / 2;
        int heightEnd = element.getLocation().getY();


        TouchAction scrollDown = new TouchAction(driver);
        scrollDown.press(point(width, height))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(point(width, heightEnd)).release().perform();


    }

    public void scrollVerticalFromCenterToUp(By by, int number) {
        MobileElement element = driver.findElements(by).get(number);
        int widthX = element.getLocation().getX();
        int heightY = element.getLocation().getY();
        int width = widthX + element.getSize().getWidth() / 2;
        int height = heightY + element.getSize().getHeight() / 2;
        int heightEnd = element.getLocation().getY();

        TouchAction scrollDown = new TouchAction(driver);
        scrollDown.press(point(width, height))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(point(width, heightEnd)).release().perform();
    }

    public void scrollVerticalFromCenterToDown(By by) {
        MobileElement element = driver.findElement(by);
        int widthX = element.getLocation().getX();
        int heightY = element.getLocation().getY();
        int width = widthX + element.getSize().getWidth() / 2;
        int height = heightY + element.getSize().getHeight() / 2;
        int heightEnd = heightY + element.getSize().getHeight() - 1;

        TouchAction scrollDown = new TouchAction(driver);
        scrollDown.press(point(width, height))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(point(width, heightEnd)).release().perform();

    }

    public void scrollVerticalFromCenterToDown(By by, int number) {
        MobileElement element = driver.findElements(by).get(number);
        int widthX = element.getLocation().getX();
        int heightY = element.getLocation().getY();
        int width = widthX + element.getSize().getWidth() / 2;
        int height = heightY + element.getSize().getHeight() / 2;
        int heightEnd = heightY + element.getSize().getHeight() - 1;
        TouchAction scrollDown = new TouchAction(driver);
        scrollDown.press(point(width, height))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(point(width, heightEnd)).release().perform();

    }

//
//    public void pullToRefresh(double startYPercentage, double endYPercentage, double startXPercentage) {
//        verticalSwipeByPercentages(startYPercentage, endYPercentage, startXPercentage);
//    }

    public void resetApp() {
        driver.resetApp();
    }
}
