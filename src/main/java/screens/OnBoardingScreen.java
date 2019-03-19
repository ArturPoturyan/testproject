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

    private By POPUP_CANCEL_BUTTON = By.id("com.google.android.gms:id/cancel");
    private By CONTINUE_WITH_EMAIL_POPUP = By.id("com.google.android.gms:id/credential_picker_layout");
    private By FORGOT_PROFILE_PHOTO_POPUP = By.id(APP_PACKAGE_NAME + ":id/pop_up_layout");


    public boolean isSignInButtonPresent() {
        return utils.isElementPresent(REGISTER_STEP_SIGN_IN_BUTTON);
    }

    public void registerStepSignInButton() {
        utils.clickIdButton(REGISTER_STEP_SIGN_IN_BUTTON);
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

    public void clickNextButton() {
        utils.clickIdButton(NEXT_BUTTON);

    }

    public boolean isUsernameCheckPositiveStatePresent() {
        return utils.isElementPresent(USERNAME_CHECK_POSITIVE_STATE);
    }

    public void clickMaybeLaterButton() {
        utils.clickIdButton(NEGATIVE_BUTTON);

    }

    public void clickBirthdaySkipButton() {
        utils.clickIdButton(BIRTHDAY_SKIP_BUTTON);

    }

    public void clickSubscriptionOfferCloseButton() {

        utils.clickIdButton(SUBSCRIPTION_OFFER_CLOSE_BUTTON);

    }

    public void typeUserInfoEmailText() {
        utils.typeText(REGISTER_INPUT_FIELD, utils.randomNumber() + "asd@gmail.com");

    }

    public void typeUserInfoFullNameText() {
        utils.typeText(REGISTER_INPUT_FIELD, "asdafsdas");
    }

    public void typeUserInfoUsernameText() {
        utils.typeText(REGISTER_INPUT_FIELD, "asdafasds");
    }

    public void typePassword() {
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


