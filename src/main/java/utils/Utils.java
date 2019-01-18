package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class Utils {

    private AndroidDriver driver;

    public Utils(AndroidDriver driver) {
        this.driver = driver;


    }

    public void clickIdButton(By buttonId) {
        driver.findElement(buttonId).click();
    }

    public void signInUserNameKey(By signInUserNameTextKey, String sendSignInUsername) {
        driver.findElement(signInUserNameTextKey).sendKeys(sendSignInUsername);

    }

    public void signInUserPasswordKey(By userNamePasswordKey, String sendSignInPasswordKey) {

        driver.findElement(userNamePasswordKey).sendKeys(sendSignInPasswordKey);
    }

    public void userEmailKey(By userNameEmailKey, String emailKey) {
        driver.findElement(userNameEmailKey).
                sendKeys(RandomGeneratingNumbers.randomNumber() + emailKey);

    }

    public void registerFullNameKey(By registerFullNameKey, String sendRegisterFullNameKey) {
        driver.findElement(registerFullNameKey).sendKeys(sendRegisterFullNameKey);


    }

    public void registerUsernameKey(By registerUsernameKey, String sendRegisterUsernameKey) {
        driver.findElement(registerUsernameKey).sendKeys(sendRegisterUsernameKey);
    }

}
