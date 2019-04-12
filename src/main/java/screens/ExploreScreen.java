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
    private By BACK_BTN = By.id(APP_PACKAGE_NAME + ":id/back_btn");
    private By BACK_BUTTON_MENU = By.id(APP_PACKAGE_NAME + ":id/back_btn_menu");
    private By ZOOMABLE_ITEM = By.id(APP_PACKAGE_NAME + ":id/zoomable_item_id");
    private By REMIX_BUTTON = By.id(APP_PACKAGE_NAME + ":id/remix_button_id");
    private By IMAGE_BROWSER_MAIN_IMAGE = By.id(APP_PACKAGE_NAME + ":id/image_browser_main_image");
    private By GALLERY_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/gallery_recycler_view");
    private By TITLE_FRAGMENT = By.id(APP_PACKAGE_NAME + ":id/title_fragment");
    private By ACTION_BAR_TAB = By.id("android.support.v7.app.ActionBar$Tab");
    private By SWIPE_REFRESH = By.id(APP_PACKAGE_NAME + ":id/swipe_refresh");
    private By LIKE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/gallery_item_like_button");
    private By MORE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/more_button");
    private By MORE_REPOST_BUTTON = By.id(APP_PACKAGE_NAME + ":id/menu_repost");
    private By COMMENT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/gallery_item_comment_button");
    private By COMMENT_INPUT_FIELD = By.id(APP_PACKAGE_NAME + ":id/message_edit_text");
    private By IMAGE_BUTTON = By.className("android.widget.ImageButton");
    private By ACCTION_BAR_TAB = By.className("android.support.v7.app.ActionBar$Tab");
    private By PICSART_BUTTON_TEXT = By.id(APP_PACKAGE_NAME + ":id/picsart_button_text");
    private By BOTTOM_ACTION_BUTTON = By.id(APP_PACKAGE_NAME + ":id/bottom_action_btn");




    //Views
    public void clickFubButton() {
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

    public void scrollToUp() {
        utils.scrollVerticalFromCenterToUp(SWIPE_REFRESH);
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

    public void clickOnHashtagScreenBackButton() {
        utils.clickById(BACK_BTN);
    }

    public void clickInImageBrowserBackButton() {
        utils.clickById(BACK_BUTTON_MENU);
    }

    public boolean isActionBarFromHashtagPresent() {
        return utils.isElementPresent(ACTION_BAR_TAB);
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


    public void clickImageFromExploreTab(int index) {
        utils.clickByIndex(ZOOMABLE_ITEM, index);
    }

    public boolean isZoomableItemPresent() {
        return utils.isElementPresent(ZOOMABLE_ITEM);
    }

    public void swipeImageToLeft() {
        utils.horizontalSwipeFromCenterToLeft(IMAGE_BROWSER_MAIN_IMAGE);
    }

    public boolean isLikeButtonPresent() {
        return utils.isElementPresent(LIKE_BUTTON);
    }

    public void clickLikeButton() {
        utils.clickById(LIKE_BUTTON);
    }

    public boolean isImageBorwserMoreButtonPresent() {
        return utils.isElementPresent(MORE_BUTTON);
    }

    public void clickImageBrowserMoreButton() {
        utils.clickById(MORE_BUTTON);
    }

    public void clickFromMoreMenuRepostButton() {
        utils.clickById(MORE_REPOST_BUTTON);
    }

    public void clickCommentButton() {
        utils.clickById(COMMENT_BUTTON);
    }

    public void typeCommentText() {
        utils.typeText(COMMENT_INPUT_FIELD, "oh");
    }

    public void clickFromActivityBackButton() {
        utils.clickById(IMAGE_BUTTON);

    }
    public void clickActivityTabBarByIndex(int index) {
        utils.clickByIndex(ACCTION_BAR_TAB, index);
    }
    public boolean isRepostButtonPresent() {
        return utils.isElementByTextPresent(PICSART_BUTTON_TEXT, "REPOST");
    }

    public void clickRepostButton() {
        utils.clickById(BOTTOM_ACTION_BUTTON);
    }
    public boolean isRepostedButtonPresent() {
        return utils.isElementByTextPresent(PICSART_BUTTON_TEXT, "REPOSTED");
    }

}
