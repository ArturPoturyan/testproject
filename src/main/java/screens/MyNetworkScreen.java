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
    private By MY_NETWORK_BUTTON = By.id(APP_PACKAGE_NAME + ":id/tab_my_network_id");
    private By LIKE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/gallery_item_like_button");
    private By MY_NET_MORE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/my_net_more_button");
    private By MORE_REPOST_BUTTON = By.id(APP_PACKAGE_NAME + ":id/menu_repost");
    private By ACCTION_BAR_TAB = By.className("android.support.v7.app.ActionBar$Tab");
    private By COMMENT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/gallery_item_comment_button");
    private By BOTTOM_ACTION_BUTTON = By.id(APP_PACKAGE_NAME + ":id/bottom_action_btn");
    private By IMAGE_BROWSER_MAIN_IMAGE = By.id(APP_PACKAGE_NAME + ":id/image_browser_main_image");
    private By PICSART_BUTTON_TEXT = By.id(APP_PACKAGE_NAME + ":id/picsart_button_text");
    private By COMMENT_INPUT_FIELD = By.id(APP_PACKAGE_NAME + ":id/message_edit_text");
    private By IMAGE_BUTTON = By.className("android.widget.ImageButton");


    //Views

    private By SWIPE_REFRESH = By.id(APP_PACKAGE_NAME + ":id/swipe_refresh");

    public void clickRepostButton() {
        utils.clickById(BOTTOM_ACTION_BUTTON);
    }

    public void scrollToUpImageBrowser() {
        utils.scrollVerticalFromCenterToUp(IMAGE_BROWSER_MAIN_IMAGE);
    }

    public void scrollToDownImageBrowser() {
        utils.scrollVerticalFromCenterToDown(IMAGE_BROWSER_MAIN_IMAGE);
    }


    public void clickFromCommentActivityBackButton() {
        utils.clickById(IMAGE_BUTTON);

    }

    public boolean isRepostedButtonPresent() {
        return utils.isElementByTextPresent(PICSART_BUTTON_TEXT, "REPOSTED");
    }

    public boolean isRepostButtonPresent() {
        return utils.isElementByTextPresent(PICSART_BUTTON_TEXT, "REPOST");
    }

    public void swipeImageToLeft() {
        utils.horizontalSwipeFromCenterToLeft(IMAGE_BROWSER_MAIN_IMAGE);
    }

    public void clickCommentButton() {
        utils.clickById(COMMENT_BUTTON);
    }

    public void typeCommentText() {
        utils.typeText(COMMENT_INPUT_FIELD, "oh");
    }

    public void clickFromMoreMenuRepostButton() {
        utils.clickById(MORE_REPOST_BUTTON);
    }

    public void clickRepostTab() {
        utils.clickByIndex(ACCTION_BAR_TAB, 2);
    }

    public void clickCommentTab() {
        utils.clickByIndex(ACCTION_BAR_TAB, 1);
    }

    public void clickLikeButton() {
        utils.clickById(LIKE_BUTTON);
    }

    public void clickMyNetworkMoreButton() {
        utils.clickById(MY_NET_MORE_BUTTON);
    }


    public void scrollToUp() {
        utils.scrollVerticalFromCenterToUp(SWIPE_REFRESH);
    }

    public void verticalScrollToDownMyNetworkScreen() {
        utils.scrollVerticalFromCenterToDown(SWIPE_REFRESH);
    }


    public void clickMyNetworkTab() {
        utils.clickById(MY_NETWORK_BUTTON);
    }

    public boolean isLikeButtonPresent() {
        return utils.isElementPresent(LIKE_BUTTON);
    }

    public void clickEditButton() {
        utils.clickById(MENU_EDIT_BUTTON);
    }

    public boolean isImageSettingsPresent() {//todo rename
        return utils.isElementPresent(MENU_EDIT_BUTTON);
    }

    public void clickImageBrowserMoreButton() {
        utils.clickById(MORE_BUTTON);
    }

    public boolean isImageBorwserMoreButtonPresent() {
        return utils.isElementPresent(MORE_BUTTON);
    }


    public void clickImageFromMyNetworkTab() {
        utils.clickByIndex(ZOOMABLE_ITEM, 0);

    }

    public boolean isZoomableItemPresent() {
        return utils.isElementPresent(ZOOMABLE_ITEM);
    }


    public String getDescriptionText() {
        return utils.getText(IMAGE_DESCRIPTION);
    }
}
