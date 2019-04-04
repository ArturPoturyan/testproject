package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class PhotoChooserScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public PhotoChooserScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }

    //Buttons
    private By GRID_IMAGE_ITEM = By.id(APP_PACKAGE_NAME + ":id/grid_image");
    private By ARROW_BUTTON = By.id(APP_PACKAGE_NAME + ":id/arrow_down");
    private By FOLDER_NAME = By.id(APP_PACKAGE_NAME + ":id/folder_name");
    private By SET_SIZE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/dialog_ok_btn");





    //Views
    public boolean isPhotoChooserPresent() {//todo rename
        return utils.isElementPresent(GRID_IMAGE_ITEM);
    }

    public void clickFreeToEditButton() {
        utils.clickByIndex(FOLDER_NAME, 0);
    }
    public boolean isChooseImageSizePopupPresent() {
        return utils.isElementPresent(SET_SIZE_BUTTON);
    }

    public void clickSetSizeButton() {
        utils.clickById(SET_SIZE_BUTTON);
    }

    public void clickOnPhoto() {
        utils.clickByIndex(GRID_IMAGE_ITEM, 4);
    }

    public void clickArrowButton() {
        utils.clickById(ARROW_BUTTON);
    }

}
