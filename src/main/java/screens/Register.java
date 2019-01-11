package screens;

import org.openqa.selenium.By;
import utils.DesiredCapsManager;
import utils.Utils;

public class Register extends DesiredCapsManager {
    private static By CREATE_ACCOUNT_BUTTON = By.id("com.picsart.studio:id/picsart_button_text");
    private static By NEXT_BUTTON = CREATE_ACCOUNT_BUTTON;
    private static By MAYBE_LATER = By.id("com.picsart.studio:id/btn_negative");
    private static By BIRTHDAY_SKIP_BUTTON = By.id("com.picsart.studio:id/skip_button");
    private static By SUBSCRIPTION_OFFER_CLOSE_BUTTON = By.className("android.widget.ImageButton");
    private static By USER_INFO_EMAIL_TEXT = By.id("com.picsart.studio:id/user_info_edit_text");
    private static By USER_INFO_FULL_NAME_TEXT = By.id("com.picsart.studio:id/user_info_edit_text");
    private static By USER_INFO_USERNAME_TEXT = By.id("com.picsart.studio:id/user_info_edit_text");


    public void createAccountButton() {

        Utils.clickIdButton(driver, CREATE_ACCOUNT_BUTTON);


    }

    public void nextButton() {
        Utils.clickIdButton(driver, NEXT_BUTTON);

    }

    public void maybeLater() {
        Utils.clickIdButton(driver, MAYBE_LATER);

    }

    public void birthdaySkipButton() {
        Utils.clickIdButton(driver, BIRTHDAY_SKIP_BUTTON);

    }

    public void subscriptionOfferCloseButton() {

        Utils.clickIdButton(driver, SUBSCRIPTION_OFFER_CLOSE_BUTTON);

    }

    public void userInfoEmailText() {
        Utils.userEmailKey(driver, USER_INFO_EMAIL_TEXT, "asd@gmail.com");

    }

    public void userInfoFullNameText() {
        Utils.registerFullNameKey(driver, USER_INFO_FULL_NAME_TEXT, "asdasdad");
    }

    public void userInfoUsernameText() {
        Utils.registerUsernameKey(driver, USER_INFO_USERNAME_TEXT, "hagsdhj");
    }
}
