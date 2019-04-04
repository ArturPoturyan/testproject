package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class ShopScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public ShopScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }


    //Button

    private By SUBSCRIPTION_PAYMENT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/subscription_payment_button_1");
    private By SUBSCRIPTION_OFFER_CLOSE_BUTTON = By.className("android.widget.ImageButton");
    private By NEGATIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_negative");
    private By SUBMIT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/submit_button");
    private By IMAGE_BUTTON = By.className("android.widget.ImageButton");


    public boolean isContactUsScreenPresent() {
        return utils.isElementPresent(SUBMIT_BUTTON);
    }

    public void clickXButtonInContactUsScreen() {
        utils.clickById(IMAGE_BUTTON);
    }

    public boolean isSubscriptionOfferScreenPresent() {
        return utils.isElementPresent(SUBSCRIPTION_PAYMENT_BUTTON);
    }

    public void clickOfferScreenXButton() {

        utils.clickById(SUBSCRIPTION_OFFER_CLOSE_BUTTON);
    }

    public void clickGoldPopupSkipButton() {
        utils.clickById(NEGATIVE_BUTTON);
    }

    public boolean isPicsArtGoldPopupPresent() {
        return utils.isElementPresent(NEGATIVE_BUTTON);
    }
}
