package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class ShareScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public ShareScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }

    //Buttons
    private By ET_DESCRIPTION = By.id(APP_PACKAGE_NAME + ":id/et_description");
    private By NEXT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_next");
    private By PICS_ART_BUTTON_TEXT = By.id(APP_PACKAGE_NAME + ":id/picsart_button_text");
    private By BTN_DONE = By.id(APP_PACKAGE_NAME + ":id/btn_done");
    private By UPLOAD_SHARE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/share_in_bottom");
    private By PRIVATE_BTN = By.id(APP_PACKAGE_NAME + ":id/btn_private");
    private By ITEM_CONTAINER = By.id(APP_PACKAGE_NAME + ":id/item_container");





    //Views

    public boolean isUploadShareButtonPresent() {
        return utils.isElementPresent(UPLOAD_SHARE_BUTTON);
    }

    public void clickByIndexOnUploadPrivatelyButton() {
        utils.clickByIndex(ITEM_CONTAINER, 1);
    }

    public void clickSaveButton() {
        utils.clickById(PRIVATE_BTN);

    }

    public void typeTextInTagField(String text) {
        utils.typeText(ET_DESCRIPTION, text);
    }


    public void clickNextButton() {
        utils.clickById(NEXT_BUTTON);
    }

    public void clickDoneButton() {
        utils.clickById(BTN_DONE);
    }

    public void clickUploadShareButton() {
        utils.clickByIndex(PICS_ART_BUTTON_TEXT, 1);
    }




}
