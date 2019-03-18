package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class NotificationScreen implements CommonValues {

    private AppiumDriver<MobileElement> driver;
    private Utils utils;

    public NotificationScreen(AndroidDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }

    //Buttons
    private By NOTIFICATION_BUTTON = By.id(APP_PACKAGE_NAME + ":id/menu_main_notification");
    private By POSITIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_positive");
    private By PERMISSION_ALLOW_BUTTON = By.id("com.android.packageinstaller:id/permission_allow_button");
    private By BACK_IMAGE_BUTTON = By.className("android.widget.ImageButton");
    private By PRIMARY_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_primary");
    private By GRID_IMAGE_ITEM = By.id(APP_PACKAGE_NAME + ":id/grid_image");
    private By NOTIFICATIONS_TAB_BAR = By.className("android.support.v7.app.ActionBar$Tab");
    private By NOTIFICATIONS_SCREEN_BACK_BUTTON = By.id(APP_PACKAGE_NAME + ":id/pa_upload_btn_back");
    private By NEGATIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_negative");
    private By EDITOR_NEXT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_share");
    private By UPLOAD_SHARE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/share_in_bottom");
    private By UPLOAD_DONE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_done");
    private By EMPTY_STATE_TEXT = By.id(APP_PACKAGE_NAME + ":id/tv_title");
    private By PROFILE_TAB_BUTTON = By.id(APP_PACKAGE_NAME + ":id/tab_profile_id");
    private By MY_NETWORK_BUTTON = By.id(APP_PACKAGE_NAME + ":id/tab_my_network_id");
    private By DISCOVER_ARTISTS_TITLE = By.className("android.widget.TextView");
    private By PROFILE_MORE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/profile_menu_icon_top");
    private By PROFILE_LOGOUT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/profile_menu_logout");
    private By DIALOG_OK_BUTTON = By.id(APP_PACKAGE_NAME + ":id/dialog_ok_btn");
    private By PROFILE_FOLLOWINGS_BUTTON = By.id(APP_PACKAGE_NAME + ":id/tv_followings");
    private By DISPLAY_NAME = By.id(APP_PACKAGE_NAME + ":id/display_name");
    private By FOLLOW_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_follow");
    private By ZOOMABLE_ITEM = By.id(APP_PACKAGE_NAME + ":id/zoomable_item_id");
    private By IMAGE_BROWSER_MAIN_IMAGE = By.id(APP_PACKAGE_NAME + ":id/image_browser_main_image");

    private By PROFILE_MENU_SETTINGS = By.id(APP_PACKAGE_NAME + ":id/profile_menu_settings");
    private By SETTINGS_TEXT = By.id("android:id/title");
    private By GALLERY_COMMENT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/gallery_item_comment_button");
    private By COMMENT_INPUT_FIELD = By.id(APP_PACKAGE_NAME + ":id/message_edit_text");
    private By SEND_BUTTON = By.id(APP_PACKAGE_NAME + ":id/send_btn");
    private By CHOOSE_EMAIL_CLIENT = By.id("android:id/title_default");

    //Views
    private By STORAGE_PERMISSION_POPUP = By.id(APP_PACKAGE_NAME + ":id/pop_up_layout");
    private By PHOTO_ACCESS_PERMISSION_POPUP = By.id("com.android.packageinstaller:id/dialog_container");
    private By CREATE_FLOW_SCREEN = By.id(APP_PACKAGE_NAME + ":id/recycler_view");
    private By TRY_GOLD_FOR_FREE = By.id(APP_PACKAGE_NAME + ":id/main_content");
    private By AVATAR_ICON = By.id(APP_PACKAGE_NAME + ":id/action_bar_avatar");
    private By HOME_PAGING_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/paging_recycler_view_id");
    private By SETTINGS_LIST = By.id("android:id/list");
    private By SWIPE_REFRESH = By.id(APP_PACKAGE_NAME + ":id/swipe_refresh");


    public void clickFollowButton() {
        utils.clickIdButton(FOLLOW_BUTTON);
    }


    public boolean isSendButtonEnabled() {
        return utils.isElementEnabled(SEND_BUTTON);

    }

    public boolean isProfileMoreButtonPresent() {
        return utils.isElementPresent(PROFILE_MORE_BUTTON);
    }

//    public void pullToRefreshProfileTab() {
//        utils.pullToRefresh(0.5, 0.7, 0.5);
//    }

    public void pullToRefreshInProfilePage() {
        utils.scrollVerticalFromCenterToDown(SWIPE_REFRESH);
    }

    public void clickContactSupportButton() {
        utils.clickElementByText(SETTINGS_TEXT, "Contact Support");
    }

    public boolean isUserAvatarIconPresent() {
        return utils.isElementPresent(AVATAR_ICON);
    }


    public void typeCommentText() {
        utils.typeText(COMMENT_INPUT_FIELD, "I LOVE YOU!!!!!");
    }

    public void clearCommentField() {
        utils.clearTextField(COMMENT_INPUT_FIELD);
    }

    public void clickGalleryCommentButton() {
        utils.clickIdButton(GALLERY_COMMENT_BUTTON);
    }

    public void clickCommentInputField() {
        utils.clickIdButton(COMMENT_INPUT_FIELD);
    }

    public void clickSettingsButton() {
        utils.clickIdButton(PROFILE_MENU_SETTINGS);
    }

    public boolean isZoomableItemPresent() {
        return utils.isElementPresent(ZOOMABLE_ITEM);
    }

    public boolean isPicsArtUserPresent() {
        return utils.getText(DISPLAY_NAME).equals("PicsArt");
    }

    public void clickFollowingsButton() {
        utils.clickIdButton(PROFILE_FOLLOWINGS_BUTTON);
    }

    public void clickDialogOkButton() {
        utils.clickIdButton(DIALOG_OK_BUTTON);
    }

    public void clickProfileLogoutButton() {
        utils.clickIdButton(PROFILE_LOGOUT_BUTTON);
    }

    public void clickProfileMoreButton() {
        utils.clickIdButton(PROFILE_MORE_BUTTON);
    }

    public boolean isMyNetworkPresent() {
        return utils.isElementPresent(MY_NETWORK_BUTTON);
    }

    public boolean isProfileTabPresent() {
        return utils.isElementPresent(PROFILE_TAB_BUTTON);
    }


    public void verticalScrollToUpSettingsScreen() {
        utils.scrollVerticalFromCenterToUp(SETTINGS_LIST);

    }

    public void clickLetIsStartButton() {
        utils.clickIdButton(PRIMARY_BUTTON);
    }

    public void clickFeedsTab() {
        utils.clickIdButton(MY_NETWORK_BUTTON);

    }

    public void clickProfileTab() {
        utils.clickIdButton(PROFILE_TAB_BUTTON);
    }

    public void clickUploadDoneButton() {
        utils.clickIdButton(UPLOAD_DONE_BUTTON);
    }

    public void clickUploadShareButton() {
        utils.clickIdButton(UPLOAD_SHARE_BUTTON);
    }

    public void clickEditorNextButton() {
        utils.clickIdButton(EDITOR_NEXT_BUTTON);

    }

    public void clickImageMyNetworkTab() {
        utils.clickByIndex(ZOOMABLE_ITEM, 0);

    }

    public void swipeHomeImageToLeft() {
        utils.horizontalSwipeFromCenterToLeft(IMAGE_BROWSER_MAIN_IMAGE, 0);

    }

    public void swipeHomeImageToRight() {
        utils.horizontalSwipeFromCenterToRight(IMAGE_BROWSER_MAIN_IMAGE, 0);
    }

    public void scrollHomeToUp() {
        utils.scrollVerticalFromCenterToUp(HOME_PAGING_RECYCLER_VIEW);
    }

    public void scrollSettingsToUp() {
        utils.scrollVerticalFromCenterToUp(SETTINGS_LIST);
    }

    public void scrollHomeToDown() {
        utils.scrollVerticalFromCenterToDown(HOME_PAGING_RECYCLER_VIEW);
    }

    public void clickOnPhoto() {
        utils.clickByIndex(GRID_IMAGE_ITEM, 4);
    }

    public void clickNotificationBackButton() {
        utils.clickIdButton(NOTIFICATIONS_SCREEN_BACK_BUTTON);
    }

    public void clickGoldPopupSkipButton() {
        utils.clickIdButton(NEGATIVE_BUTTON);
    }

    public void clickNotificationButton() {
        utils.clickIdButton(NOTIFICATION_BUTTON);

    }

    public void clickPermissionLetIsGoButton() {
        utils.clickIdButton(POSITIVE_BUTTON);
    }

    public void clickPermissionAllowButton() {
        utils.clickIdButton(PERMISSION_ALLOW_BUTTON);
    }

    public void clickBackImageButton() {
        utils.clickIdButton(BACK_IMAGE_BUTTON);
    }

    public void clickUploadImageButton() {
        utils.clickIdButton(PRIMARY_BUTTON);
    }

    public void clickOnMeTab() {
        utils.clickByIndex(NOTIFICATIONS_TAB_BAR, 1);

    }

    public void clickOnFollowingTab() {
        utils.clickByIndex(NOTIFICATIONS_TAB_BAR, 2);


    }

    public void resetPicsArtAppData() {
        utils.resetApp();
    }

    public boolean isCreateFlowScreenPresent() {
        return utils.isElementPresent(CREATE_FLOW_SCREEN);
    }


    public boolean isDevicePhotosPermissionPopupPresent() {
        return utils.isElementPresent(PHOTO_ACCESS_PERMISSION_POPUP);
    }

    public boolean isStoragePermissionPopupPresent() {

        return utils.isElementPresent(STORAGE_PERMISSION_POPUP);
    }

    public boolean isPhotoChooserImageListPresent() {
        return utils.isElementPresent(GRID_IMAGE_ITEM);
    }

    public boolean isPicsArtGoldPopupPresent() {
        return utils.isElementPresent(TRY_GOLD_FOR_FREE);
    }

    public boolean isDiscoverArtistsPresent() {
        return utils.getText(DISCOVER_ARTISTS_TITLE).equals("Discover Artists");
    }

    public boolean isChooseEmailClientTextPresent() {
        return utils.getText(CHOOSE_EMAIL_CLIENT).equals("Choose Email Client");
    }


    public boolean isFindPeopleToFollowTextPresent() {
        return utils.getText(EMPTY_STATE_TEXT).equals("Find People to Follow");
    }

    public boolean isGalleryCommentButtonPresent() {
        return utils.isElementPresent(GALLERY_COMMENT_BUTTON);
    }

    public boolean isYouHaveNoActivityTextPresent() {
        return utils.getText(EMPTY_STATE_TEXT).equals("You have no activity : (");
    }

    public boolean isContactSupportTextPresent() {
        return utils.findElementByText(SETTINGS_TEXT, "Contact Support");
    }


    public boolean isNoResultTextPresent() {
        return utils.getText(EMPTY_STATE_TEXT).equals("No Result");
    }

}
