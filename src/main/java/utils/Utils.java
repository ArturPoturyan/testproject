package utils;

import org.openqa.selenium.By;


public class Utils {

    public static void clickIdButton(By buttonId) {
        DesiredCapsManager.driver.findElement(buttonId).click();
    }

    public static void signInUserNameKey(By signInUserNameTextKey, String sendSignInUsername) {
        DesiredCapsManager.driver.findElement(signInUserNameTextKey).sendKeys(sendSignInUsername);

    }

    public static void signInUserPasswordKey(By userNamePasswordKey, String sendSignInPasswordKey) {

        DesiredCapsManager.driver.findElement(userNamePasswordKey).sendKeys(sendSignInPasswordKey);
    }

    public static void userEmailKey(By userNameEmailKey, String emailKey) {
        DesiredCapsManager.driver.findElement(userNameEmailKey).
                sendKeys(RandomGeneratingNumbers.randomNumber() + emailKey);

    }

    public static void registerFullNameKey(By registerFullNameKey, String sendRegisterFullNameKey) {
        DesiredCapsManager.driver.findElement(registerFullNameKey).sendKeys(sendRegisterFullNameKey);


    }

    public static void registerUsernameKey(By registerUsernameKey, String sendRegisterUsernameKey) {
        DesiredCapsManager.driver.findElement(registerUsernameKey).sendKeys(sendRegisterUsernameKey);
    }

}
