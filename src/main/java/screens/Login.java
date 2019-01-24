package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.Utils;

public class Login {
    private AndroidDriver driver;
    private Utils utils;


    public Login(AndroidDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);
    }

    private By REGISTER_BUTTON_CLICK = By.id("com.picsart.studio:id/register_step_sign_in");
    private By POPUP_CANCEL_BUTTON = By.id("com.google.android.gms:id/cancel");
    private By USERNAME_FIELD = By.id("com.picsart.studio:id/sign_in_username");
    private By PASSWORD_FIELD = By.id("com.picsart.studio:id/sign_in_password");
    private By FINAL_SIGN_IN_BUTTON = By.id("com.picsart.studio:id/picsart_button_text");
    private By SIGN_IN_USERNAME = By.id("com.picsart.studio:id/sign_in_username");
    private By SIGN_IN_PASSWORD = By.id("com.picsart.studio:id/sign_in_password");


    public void clickRegister() {
//        driver.findElement(REGISTER_BUTTON_CLICK).click();
        utils.clickIdButton(REGISTER_BUTTON_CLICK);
    }

    public void popUpCancelButton() {
        utils.clickIdButton(POPUP_CANCEL_BUTTON);

    }

    public void userNameField() {
        utils.clickIdButton(USERNAME_FIELD);

    }

    public void passwordField() {
        utils.clickIdButton(PASSWORD_FIELD);

    }

    public void finalSignInButton() {
        utils.clickIdButton(FINAL_SIGN_IN_BUTTON);

    }

    public void signInUsername() {
        utils.signInUserNameKey(SIGN_IN_USERNAME, "kakao60");


    }

    public void signInPassword() {

        utils.signInUserPasswordKey(SIGN_IN_PASSWORD, "qwertya");
    }
}

