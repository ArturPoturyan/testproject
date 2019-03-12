package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class LoginScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;


    public LoginScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);
    }

    //Buttons
    private By SIGN_IN_BUTTON = By.id(APP_PACKAGE_NAME + ":id/sign_in_button");
    private By USERNAME_FIELD = By.id(APP_PACKAGE_NAME + ":id/sign_in_username");
    private By PASSWORD_FIELD = By.id(APP_PACKAGE_NAME + ":id/sign_in_password");
    private By REGISTER_STEP_SIGNIN_BUTTON = By.id(APP_PACKAGE_NAME + ":id/register_step_sign_in");


    //PopupViews
    private By POPUP_CANCEL_BUTTON = By.id("com.google.android.gms:id/cancel");
    private By CONTINUE_WITH_EMAIL_POPUP = By.id("com.google.android.gms:id/credential_picker_layout");

    public boolean isSignInButtonPresent() {
        return utils.isElementPresent(REGISTER_STEP_SIGNIN_BUTTON);
    }

    public void registerStepSignInButton() {
        utils.clickIdButton(REGISTER_STEP_SIGNIN_BUTTON);
    }

    public void clickPopUpCancelButton() {
        utils.clickIdButton(POPUP_CANCEL_BUTTON);

    }

    public void clickFinalSignInButton() {
        utils.clickIdButton(SIGN_IN_BUTTON);

    }

    public void typeSignInUsername() {
        utils.typeText(USERNAME_FIELD, "kakao60");


    }

    public void typeSignInPassword() {
        utils.typeText(PASSWORD_FIELD, "qwertya");

    }

    public boolean isContinueWithEmailPopupPresent() {
        return utils.isElementPresent(CONTINUE_WITH_EMAIL_POPUP);
    }
}

