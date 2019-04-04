package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class ProfileScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public ProfileScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);
    }

    //Buttons
    private By PROFILE_TAB_BUTTON = By.id(APP_PACKAGE_NAME + ":id/tab_profile_id");
    private By USER_AVATAR = By.id(APP_PACKAGE_NAME + ":id/iv_avatar");
    private By DISCOVER_ARTISTS_BUTTON = By.id(APP_PACKAGE_NAME + ":id/profile_menu_discover_artists");
    private By SQUARE_IMAGE_ROOT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/square_image_root_frame");
    private By PROFILE_BACK_BUTTON = By.id(APP_PACKAGE_NAME+ ":id/profile_menu_back");
    private By PROFILE_MENU_ICON_TOP = By.id(APP_PACKAGE_NAME+":id/profile_menu_icon_top");


    public void clickProfileBackButton(){
        utils.clickById(PROFILE_BACK_BUTTON);
    }


    public void clickProfileImageButton() {
        utils.clickByIndex(SQUARE_IMAGE_ROOT_BUTTON, 0);
    }
    public void clickProfileTab() {
        utils.clickById(PROFILE_TAB_BUTTON);
    }

    public boolean isUserAvatarPresent() {
        return utils.isElementPresent(USER_AVATAR);
    }

    public void clickProfileMoreButton() {
        utils.clickById(PROFILE_MENU_ICON_TOP);
    }

    public void clickDiscoverArtistsButton() {
        utils.clickById(DISCOVER_ARTISTS_BUTTON);
    }
}
