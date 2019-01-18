package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.Utils;

public class Register {
    private AndroidDriver driver;
    private Utils utils;

    public Register(AndroidDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);
    }

    private By CREATE_ACCOUNT_BUTTON = By.id("com.picsart.studio:id/picsart_button_text");
    private By NEXT_BUTTON = CREATE_ACCOUNT_BUTTON;
    private By MAYBE_LATER = By.id("com.picsart.studio:id/btn_negative");
    private By BIRTHDAY_SKIP_BUTTON = By.id("com.picsart.studio:id/skip_button");
    private By SUBSCRIPTION_OFFER_CLOSE_BUTTON = By.className("android.widget.ImageButton");
    private By USER_INFO_EMAIL_TEXT = By.id("com.picsart.studio:id/user_info_edit_text");
    private By USER_INFO_FULL_NAME_TEXT = By.id("com.picsart.studio:id/user_info_edit_text");
    private By USER_INFO_USERNAME_TEXT = By.id("com.picsart.studio:id/user_info_edit_text");


    public void createAccountButton() {

        utils.clickIdButton(CREATE_ACCOUNT_BUTTON);


    }

    public void nextButton() {
        utils.clickIdButton(NEXT_BUTTON);

    }

    public void maybeLater() {
        utils.clickIdButton(MAYBE_LATER);

    }

    public void birthdaySkipButton() {
        utils.clickIdButton(BIRTHDAY_SKIP_BUTTON);

    }

    public void subscriptionOfferCloseButton() {

        utils.clickIdButton(SUBSCRIPTION_OFFER_CLOSE_BUTTON);

    }

    public void userInfoEmailText() {
        utils.userEmailKey(USER_INFO_EMAIL_TEXT, "asd@gmail.com");

    }

    public void userInfoFullNameText() {
        utils.registerFullNameKey(USER_INFO_FULL_NAME_TEXT, "asdasdad");
    }

    public void userInfoUsernameText() {
        utils.registerUsernameKey(USER_INFO_USERNAME_TEXT, "hagsdhj");
    }
}
