package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class MyNetworkScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public MyNetworkScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }

    //Buttons

    private By ZOOMABLE_ITEM = By.id(APP_PACKAGE_NAME + ":id/zoomable_item_id");
    private By MORE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/more_button");
    private By MENU_EDIT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/menu_edit");
    private By IMAGE_DESCRIPTION = By.id(APP_PACKAGE_NAME + ":id/image_description_txt");


    //Views


    public void clickEditButton() {
        utils.clickById(MENU_EDIT_BUTTON);
    }

    public boolean isImageSettingsPresent() {
        return utils.isElementPresent(MENU_EDIT_BUTTON);
    }

    public void clickMoreButton() {
        utils.clickById(MORE_BUTTON);
    }

    public void clickImageMyNetworkTab() {
        utils.clickByIndex(ZOOMABLE_ITEM, 0);

    }

    public boolean isZoomableItemPresent() {
        return utils.isElementPresent(ZOOMABLE_ITEM);
    }


    public String getDescriptionText(){
        return utils.getText(IMAGE_DESCRIPTION);
    }
}
