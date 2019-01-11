package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class Utils {

    public static void clickIdButton(AndroidDriver<MobileElement> driver, By buttonId) {
        driver.findElement(buttonId).click();
    }

    public static void signInUserNameKey(AndroidDriver<MobileElement> driver, By signInUserNameTextKey, String sendSignInUsername) {
        driver.findElement(signInUserNameTextKey).sendKeys(sendSignInUsername);

    }

    public static void signInUserPasswordKey(AndroidDriver<MobileElement> driver, By userNamePasswordKey, String sendSignInPasswordKey) {

        driver.findElement(userNamePasswordKey).sendKeys(sendSignInPasswordKey);
    }

    public static void userEmailKey(AndroidDriver<MobileElement> driver, By userNameEmailKey, String emailKey) {
        driver.findElement(userNameEmailKey).
                sendKeys(RandomGeneratingNumbers.randomNumber() + emailKey);

    }

    public static void registerFullNameKey(AndroidDriver<MobileElement> driver, By registerFullNameKey, String sendRegisterFullNameKey) {
        driver.findElement(registerFullNameKey).sendKeys(sendRegisterFullNameKey);


    }

    public static void registerUsernameKey(AndroidDriver<MobileElement> driver, By registerUsernameKey, String sendRegisterUsernameKey) {
        driver.findElement(registerUsernameKey).sendKeys(sendRegisterUsernameKey);
    }

}
