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
    private By NOTIFICATIONS_TAB_BAR = By.className("android.support.v7.app.ActionBar$Tab");
    private By NOTIFICATIONS_SCREEN_BACK_BUTTON = By.id(APP_PACKAGE_NAME + ":id/pa_upload_btn_back");
    private By NEGATIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_negative");
    private By EDITOR_NEXT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_share");
    private By EMPTY_STATE_TEXT = By.id(APP_PACKAGE_NAME + ":id/tv_title");
    private By PROFILE_TAB_BUTTON = By.id(APP_PACKAGE_NAME + ":id/tab_profile_id");
    private By MY_NETWORK_BUTTON = By.id(APP_PACKAGE_NAME + ":id/tab_my_network_id");
    private By PROFILE_MORE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/profile_menu_icon_top");
    private By PROFILE_LOGOUT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/profile_menu_logout");
    private By DIALOG_OK_BUTTON = By.id(APP_PACKAGE_NAME + ":id/dialog_ok_btn");
    private By PROFILE_FOLLOWINGS_BUTTON = By.id(APP_PACKAGE_NAME + ":id/tv_followings");
    private By DISPLAY_NAME = By.id(APP_PACKAGE_NAME + ":id/display_name");
    private By FOLLOW_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_follow");
    private By IMAGE_BROWSER_MAIN_IMAGE = By.id(APP_PACKAGE_NAME + ":id/image_browser_main_image");
    private By PROFILE_MENU_SETTINGS = By.id(APP_PACKAGE_NAME + ":id/profile_menu_settings");
    private By SETTINGS_TEXT = By.id("android:id/title");
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
    private By NOTIFICATION_TAB = By.id(APP_PACKAGE_NAME + ":id/notification_tab_layout");


    public void clickFollowButton() {
        utils.clickById(FOLLOW_BUTTON);
    }

    public boolean isNotificationScreenPresent() {
        return utils.isElementPresent(NOTIFICATION_TAB);
    }

    public boolean isSendButtonEnabled() {
        return utils.isElementEnabled(SEND_BUTTON);

    }

    public void clickOnRemixChatTab() {
        utils.clickByIndex(NOTIFICATIONS_TAB_BAR, 0);
    }

    public boolean isProfileMoreButtonPresent() {
        return utils.isElementPresent(PROFILE_MORE_BUTTON);
    }


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


    public void clickCommentInputField() {
        utils.clickById(COMMENT_INPUT_FIELD);
    }

    public void clickSettingsButton() {
        utils.clickById(PROFILE_MENU_SETTINGS);
    }


    public boolean isPicsArtUserPresent() {
        return utils.getText(DISPLAY_NAME).equals("PicsArt");
    }

    public void clickFollowingsButton() {
        utils.clickById(PROFILE_FOLLOWINGS_BUTTON);
    }

    public void clickDialogOkButton() {
        utils.clickById(DIALOG_OK_BUTTON);
    }

    public void clickProfileLogoutButton() {
        utils.clickById(PROFILE_LOGOUT_BUTTON);
    }

    public void clickProfileMoreButton() {
        utils.clickById(PROFILE_MORE_BUTTON);
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
        utils.clickById(PRIMARY_BUTTON);
    }

    public void clickFeedsTab() {
        utils.clickById(MY_NETWORK_BUTTON);

    }

    public void clickProfileTab() {
        utils.clickById(PROFILE_TAB_BUTTON);
    }


    public void clickEditorNextButton() {
        utils.clickById(EDITOR_NEXT_BUTTON);

    }

    public void swipeHomeImageToLeft() {
        utils.horizontalSwipeFromCenterToLeft(IMAGE_BROWSER_MAIN_IMAGE);

    }

    public void swipeHomeImageToRight() {
        utils.horizontalSwipeFromCenterToRight(IMAGE_BROWSER_MAIN_IMAGE);
    }

    public void scrollHomeToUp() {
        utils.scrollVerticalFromCenterToUp(HOME_PAGING_RECYCLER_VIEW);
    }

    public void clickGoldPopupSkipButton() {
        utils.clickById(NEGATIVE_BUTTON);
    }

    public void clickNotificationButton() {
        utils.clickById(NOTIFICATION_BUTTON);

    }

    public void clickPermissionLetIsGoButton() {
        utils.clickById(POSITIVE_BUTTON);
    }

    public void clickPermissionAllowButton() {
        utils.clickById(PERMISSION_ALLOW_BUTTON);
    }

    public void clickBackImageButton() {
        utils.clickById(BACK_IMAGE_BUTTON);
    }

    public void clickUploadImageButton() {
        utils.clickById(PRIMARY_BUTTON);
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


    public boolean isPicsArtGoldPopupPresent() {
        return utils.isElementPresent(TRY_GOLD_FOR_FREE);
    }


    public boolean isChooseEmailClientTextPresent() {
        return utils.getText(CHOOSE_EMAIL_CLIENT).equals("Choose Email Client");
    }


    public boolean isFindPeopleToFollowTextPresent() {
        return utils.getText(EMPTY_STATE_TEXT).equals("Find People to Follow");
    }


    public boolean isYouHaveNoActivityTextPresent() {
        return utils.getText(EMPTY_STATE_TEXT).equals("You have no activity : (");
    }

    public boolean isContactSupportTextPresent() {
        return utils.isElementByTextPresent(SETTINGS_TEXT, "Contact Support");
    }


    public boolean isNoResultTextPresent() {
        return utils.getText(EMPTY_STATE_TEXT).equals("No Result");
    }

}
