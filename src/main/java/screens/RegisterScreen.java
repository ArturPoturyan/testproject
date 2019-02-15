package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.Utils;
import static utils.CommonValues.APP_PACKAGE_NAME;

public class RegisterScreen {
    private AndroidDriver driver;
    private Utils utils;

    public RegisterScreen(AndroidDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);
    }

    //Buttons
    private By NEXT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/picsart_button_text");
    private By BIRTHDAY_SKIP_BUTTON = By.id(APP_PACKAGE_NAME + ":id/skip_button");
    private By SUBSCRIPTION_OFFER_CLOSE_BUTTON = By.className("android.widget.ImageButton");
    private By REGISTER_INPUT_FIELD = By.id(APP_PACKAGE_NAME + ":id/user_info_edit_text");
    private By SUBSCRIPTION_PAYMENT_BUTTON_1 = By.id(APP_PACKAGE_NAME + ":id/subscription_payment_button_1");
    private By NEGATIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_negative");


    //PopupViews
    private By FORGOT_PROFILE_PHOTO_POPUP = By.id(APP_PACKAGE_NAME + ":id/pop_up_layout");


    public void clickNextButton() {
        utils.clickIdButton(NEXT_BUTTON);

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

    public boolean isPaymentButton1Present() {
        return utils.isElementPresent(SUBSCRIPTION_PAYMENT_BUTTON_1);
    }

    public boolean isNextButtonEnabled() {
        return utils.isElementEnabled(NEXT_BUTTON);
    }
}
