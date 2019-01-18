package screens;

import org.openqa.selenium.By;
import utils.Utils;

public class Login {


    private static By REGISTER_BUTTON_CLICK = By.id("com.picsart.studio:id/register_step_sign_in");
    private static By POPUP_CANCEL_BUTTON = By.id("com.google.android.gms:id/cancel");
    private static By USERNAME_FIELD = By.id("com.picsart.studio:id/sign_in_username");
    private static By PASSWORD_FIELD = By.id("com.picsart.studio:id/sign_in_password");
    private static By FINAL_SIGN_IN_BUTTON = By.id("com.picsart.studio:id/picsart_button_text");
    private static By SIGN_IN_USERNAME = By.id("com.picsart.studio:id/sign_in_username");
    private static By SIGN_IN_PASSWORD = By.id("com.picsart.studio:id/sign_in_password");


    public void clickRegister() {
        Utils.clickIdButton(REGISTER_BUTTON_CLICK);
    }

    public void popUpCancelButton() {
        Utils.clickIdButton(POPUP_CANCEL_BUTTON);

    }

    public void userNameField() {
        Utils.clickIdButton(USERNAME_FIELD);

    }

    public void passwordField() {
        Utils.clickIdButton(PASSWORD_FIELD);

    }

    public void finalSignInButton() {
        Utils.clickIdButton(FINAL_SIGN_IN_BUTTON);

    }

    public void signInUsername() {
        Utils.signInUserNameKey(SIGN_IN_USERNAME, "kakao60");


    }

    public void signInPassword() {

        Utils.signInUserPasswordKey(SIGN_IN_PASSWORD, "qwertya");
    }
}

