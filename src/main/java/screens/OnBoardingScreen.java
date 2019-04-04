package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class OnBoardingScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;


    public OnBoardingScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }


    //Buttons
    private By SIGN_IN_BUTTON = By.id(APP_PACKAGE_NAME + ":id/sign_in_button");
    private By USERNAME_FIELD = By.id(APP_PACKAGE_NAME + ":id/sign_in_username");
    private By PASSWORD_FIELD = By.id(APP_PACKAGE_NAME + ":id/sign_in_password");
    private By REGISTER_STEP_SIGN_IN_BUTTON = By.id(APP_PACKAGE_NAME + ":id/register_step_sign_in");
    private By NEXT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/picsart_button_text");
    private By BIRTHDAY_SKIP_BUTTON = By.id(APP_PACKAGE_NAME + ":id/skip_button");
    private By SUBSCRIPTION_OFFER_CLOSE_BUTTON = By.className("android.widget.ImageButton");
    private By REGISTER_INPUT_FIELD = By.id(APP_PACKAGE_NAME + ":id/user_info_edit_text");
    private By SUBSCRIPTION_BANNER = By.id(APP_PACKAGE_NAME + ":id/shop_subscription_banner_container");
    private By NEGATIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_negative");
    private By USERNAME_CHECK_POSITIVE_STATE = By.id(APP_PACKAGE_NAME + ":id/username_check_positive_state");


    //Views

    private By CANCEL_BUTTON = By.id("com.google.android.gms:id/cancel");
    private By FORGOT_PROFILE_PHOTO_POPUP = By.id(APP_PACKAGE_NAME + ":id/pop_up_layout");


    public boolean isSignInButtonPresent() {
        return utils.isElementPresent(REGISTER_STEP_SIGN_IN_BUTTON);
    }

    public void clickSignInButton() {
        utils.clickById(REGISTER_STEP_SIGN_IN_BUTTON);
    }

    public void clickPopUpCancelButton() {
        utils.clickById(CANCEL_BUTTON);

    }

    public void clickFinalSignInButton() {
        utils.clickById(SIGN_IN_BUTTON);

    }

    public void typeUsername(String username) {
        utils.typeText(USERNAME_FIELD, username);


    }

    public void typeSignInPassword(String password) {
        utils.typeText(PASSWORD_FIELD, password);
    }

    public boolean isContinueWithEmailPopupPresent() {
        return utils.isElementPresent(CANCEL_BUTTON);
    }

    public void clickNextButton() {
        utils.clickById(NEXT_BUTTON);

    }

    public boolean isUsernameCheckPositiveStatePresent() {
        return utils.isElementPresent(USERNAME_CHECK_POSITIVE_STATE);
    }

    public void clickMaybeLaterButton() {
        utils.clickById(NEGATIVE_BUTTON);

    }

    public void clickBirthdaySkipButton() {
        utils.clickById(BIRTHDAY_SKIP_BUTTON);

    }

    public void clickSubscriptionOfferCloseButton() {

        utils.clickById(SUBSCRIPTION_OFFER_CLOSE_BUTTON);

    }

    public void typeEmail() {
        utils.typeText(REGISTER_INPUT_FIELD, utils.randomNumber() + "asd@gmail.com");

    }

    public void typeUserInfoFullNameText() {
        utils.typeText(REGISTER_INPUT_FIELD, "asdafsdas");
    }

    public void typeUserInfoUsernameText() {
        utils.typeText(REGISTER_INPUT_FIELD, "asdafasds");
    }

    public void typeRegisterPassword() {
        utils.typeText(REGISTER_INPUT_FIELD, "asdasdasd");
    }

    public boolean isForgotToAddProfilePhotoPopupPresent() {
        return utils.isElementPresent(FORGOT_PROFILE_PHOTO_POPUP);
    }

    public boolean isSubscriptionBannerPresent() {
        return utils.isElementPresent(SUBSCRIPTION_BANNER);
    }

    public boolean isNextButtonEnabled() {
        return utils.isElementEnabled(NEXT_BUTTON);
    }
}


