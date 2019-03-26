package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class ExploreScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public ExploreScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }

    //Buttons


    private By FUB_BUTTON = By.id(APP_PACKAGE_NAME + ":id/center_button_create_id");
    private By SEARCH_PLATE = By.id(APP_PACKAGE_NAME + ":id/search_plate");
    private By EXPLORE_TAB = By.id(APP_PACKAGE_NAME + ":id/tab_explore_id");
    private By GALLERY_COMMENT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/gallery_item_comment_button");
    private By ACTIONABLE_FOLLOW_BUTTON = By.id(APP_PACKAGE_NAME + ":id/actionable_follow_button");
    private By BACK_BTN = By.id(APP_PACKAGE_NAME + ":id/back_btn");
    private By BACK_BUTTON_MENU = By.id(APP_PACKAGE_NAME + ":id/back_btn_menu");
    private By ZOOMABLE_ITEM = By.id(APP_PACKAGE_NAME + ":id/zoomable_item_id");
    private By REMIX_BUTTON = By.id(APP_PACKAGE_NAME + ":id/remix_button_id");
    private By IMAGE_BROWSER_MAIN_IMAGE = By.id(APP_PACKAGE_NAME + ":id/image_browser_main_image");
    private By GALLERY_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/gallery_recycler_view");
    private By TITLE_FRAGMENT = By.id(APP_PACKAGE_NAME + ":id/title_fragment");


    //Views
    public void clickFubButton() {//todo rename
        utils.clickById(FUB_BUTTON);

    }

    public boolean isSimilarTitlePresent() {
        return utils.isElementByTextPresent(TITLE_FRAGMENT, "Similar");

    }

    public void scrollToUpImageBrowser() {
        utils.scrollVerticalFromCenterToUp(GALLERY_RECYCLER_VIEW);
    }

    public void scrollToDownImageBrowser() {
        utils.scrollVerticalFromCenterToDown(GALLERY_RECYCLER_VIEW);
    }


    public void swipeExploreImageToLeft() {
        utils.horizontalSwipeFromCenterToLeft(IMAGE_BROWSER_MAIN_IMAGE);

    }

    public boolean isRemixButtonPresent() {
        return utils.isElementPresent(REMIX_BUTTON);
    }

    public void clickRemixButton() {
        utils.clickById(REMIX_BUTTON);
    }

    public void clickBackButtonInHashtagScreen() {
        utils.clickById(BACK_BTN);
    }

    public void clickBackButtonInImageBrowser() {
        utils.clickById(BACK_BUTTON_MENU);
    }

    public boolean isActionableFollowButtonPresent() {
        return utils.isElementPresent(ACTIONABLE_FOLLOW_BUTTON);
    }

    public void clickExploreTab() {
        utils.clickById(EXPLORE_TAB);
    }

    public void clickSearchBar() {
        utils.clickById(SEARCH_PLATE);
    }

    public boolean isGalleryCommentButtonPresent() {
        return utils.isElementPresent(GALLERY_COMMENT_BUTTON);
    }

    public void clickGalleryCommentButton() {
        utils.clickById(GALLERY_COMMENT_BUTTON);
    }


    public void clickImageByIndexExploreTab() {
        utils.clickByIndex(ZOOMABLE_ITEM, 0);
    }

}
