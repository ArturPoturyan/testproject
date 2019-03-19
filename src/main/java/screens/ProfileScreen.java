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
    private By PROFILE_MORE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/profile_menu_icon_top");
    private By DISCOVER_ARTISTS_BUTTON = By.id(APP_PACKAGE_NAME + ":id/profile_menu_discover_artists");


    public void clickProfileTab() {
        utils.clickIdButton(PROFILE_TAB_BUTTON);
    }

    public boolean isProfileMoreButtonPresent() {
        return utils.isElementPresent(PROFILE_MORE_BUTTON);
    }

    public void clickProfileMoreButton() {
        utils.clickIdButton(PROFILE_MORE_BUTTON);
    }

    public void clickDiscoverArtistsButton() {
        utils.clickIdButton(DISCOVER_ARTISTS_BUTTON);
    }
}
