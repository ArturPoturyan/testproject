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
    private By UPLOAD_DONE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_done");


    //Views

    public void addTag() {
//        utils.clearTextField(ET_DESCRIPTION);
        utils.typeText(ET_DESCRIPTION, "#football");
    }

    public void clickNextButton() {
        utils.clickById(NEXT_BUTTON);
    }

    public void clickButtonDone() {
        utils.clickById(BTN_DONE);
    }

    public void clickUploadShareButton() {
        utils.clickElementByText(PICS_ART_BUTTON_TEXT, "SHARE");
    }

    public void clickUploadDoneButton() {
        utils.clickById(UPLOAD_DONE_BUTTON);
    }


}
