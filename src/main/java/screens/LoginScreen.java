package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.Utils;

public class LoginScreen {
    private AndroidDriver driver;
    private Utils utils;


    public LoginScreen(AndroidDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);
    }

    //Buttons
    private By REGISTER_BUTTON_CLICK = By.id("com.picsart.studio:id/register_step_sign_in");
    private By USERNAME_FIELD = By.id("com.picsart.studio:id/sign_in_username");
    private By PASSWORD_FIELD = By.id("com.picsart.studio:id/sign_in_password");
    private By FINAL_SIGN_IN_BUTTON = By.id("com.picsart.studio:id/picsart_button_text");
    private By SIGN_IN_USERNAME = By.id("com.picsart.studio:id/sign_in_username");
    private By SIGN_IN_PASSWORD = By.id("com.picsart.studio:id/sign_in_password");


    //PopupViews
    private By POPUP_CANCEL_BUTTON = By.id("com.google.android.gms:id/cancel");
    private By CONTINUE_WITH_EMAIL_POPUP = By.id("com.google.android.gms:id/credential_picker_layout");


    public void clickRegisterButton() {
        utils.clickIdButton(REGISTER_BUTTON_CLICK);
    }

    public void clickPopUpCancelButton() {
        utils.clickIdButton(POPUP_CANCEL_BUTTON);

    }

    public void clickUserNameField() {
        utils.clickIdButton(USERNAME_FIELD);

    }

    public void clickPasswordField() {
        utils.clickIdButton(PASSWORD_FIELD);

    }

    public void clickFinalSignInButton() {
        utils.clickIdButton(FINAL_SIGN_IN_BUTTON);

    }

    public void typeSignInUsername() {
        utils.typeText(SIGN_IN_USERNAME, "kakao60");


    }

    public void typeSignInPassword() {
        utils.typeText(SIGN_IN_PASSWORD,"qwertya");

    }

    public boolean isContinueWithEmailPopupPresent() {
        return utils.isElementPresent(CONTINUE_WITH_EMAIL_POPUP);
    }
}

