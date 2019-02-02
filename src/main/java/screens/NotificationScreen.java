package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.Utils;

public class NotificationScreen {

    private AppiumDriver<MobileElement> driver;
    private Utils utils;

    public NotificationScreen(AndroidDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }

    //Buttons
    private By NOTIFICATION_BUTTON = By.id("com.picsart.studio:id/menu_main_notification");
    private By POSITIVE_BUTTON = By.id("com.picsart.studio:id/btn_positive");
    private By PERMISSION_ALLOW_BUTTON = By.id("com.android.packageinstaller:id/permission_allow_button");
    private By BACK_IMAGE_BUTTON = new By.ByClassName("android.widget.ImageButton");
    private By PRIMARY_BUTTON = By.id("com.picsart.studio:id/btn_primary");
    private By GRID_IMAGE_LIST_ITEM = By.id("com.picsart.studio:id/grid_image");
    private By NOTIFICATIONS_TAB_BAR = By.className("android.support.v7.app.ActionBar$Tab");
    private By NOTIFICATIONS_SCREEN_BACK_BUTTON = By.id("com.picsart.studio:id/pa_upload_btn_back");
    private By NEGATIVE_BUTTON = By.id("com.picsart.studio:id/btn_negative");
    private By EDITOR_NEXT_BUTTON = By.id("com.picsart.studio:id/btn_share");
    private By UPLOAD_SHARE_BUTTON = By.id("com.picsart.studio:id/share_in_bottom");
    private By UPLOAD_DONE_BUTTON = By.id("com.picsart.studio:id/btn_done");
    private By EMPTY_STATE_TEXT = By.id("com.picsart.studio:id/tv_title");
    private By PROFILE_TAB_BUTTON = By.id("com.picsart.studio:id/tab_profile_id");
    private By MY_NETWORK_BUTTON = By.id("com.picsart.studio:id/tab_my_network_id");
    private By DISCOVER_ARTISTS_TITLE = new By.ByClassName("android.widget.TextView");
    private By PROFILE_MORE_BUTTON = By.id("com.picsart.studio:id/profile_menu_icon_top");
    private By PROFILE_LOGOUT_BUTTON = By.id("com.picsart.studio:id/profile_menu_logout");
    private By DIALOG_OK_BUTTON = By.id("com.picsart.studio:id/dialog_ok_btn");
    private By PROFILE_FOLLOWINGS_BUTTON = By.id("com.picsart.studio:id/tv_followings");
    private By DISPLAY_NAME = By.id("com.picsart.studio:id/display_name");
    private By FOLLOW_BUTTON = By.id("com.picsart.studio:id/btn_follow");


    //Views
    private By STORAGE_PERMISSION_POPUP = By.id("com.picsart.studio:id/pop_up_layout");
    private By PHOTO_ACCESS_PERMISSION_POPUP = By.id("com.android.packageinstaller:id/dialog_container");
    private By CREATE_FLOW_SCREEN = By.id("com.picsart.studio:id/recycler_view");
    private By TRY_GOLD_FOR_FREE = By.id("com.picsart.studio:id/main_content");

    public void clickFollowButton() {
        utils.clickIdButton(FOLLOW_BUTTON);

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

    public void verticalSwipe(double startYPercentage, double endYPercentage, double startXPercentage) {
        utils.verticalSwipeByPercentages(startYPercentage, endYPercentage, startXPercentage);

    }

    public void clickLetIsStartButton() {
        utils.clickIdButton(PRIMARY_BUTTON);
    }

    public void clickMyNetworkTab() {
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

    public void clickOnPhoto() {

        utils.clickByIndex(GRID_IMAGE_LIST_ITEM, 8);
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
        utils.resetData();
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
        return utils.isElementPresent(GRID_IMAGE_LIST_ITEM);
    }

    public boolean isPicsArtGoldPopupPresent() {
        return utils.isElementPresent(TRY_GOLD_FOR_FREE);
    }

    public boolean isDiscoverArtistsPresent() {
        return utils.getText(DISCOVER_ARTISTS_TITLE).equals("Discover Artists");
    }

    public boolean isFindPeopleToFollowTextPresent() {
        return utils.getText(EMPTY_STATE_TEXT).equals("Find People to Follow");
    }

    public boolean isYouHaveNoActivityTextPresent() {
        return utils.getText(EMPTY_STATE_TEXT).equals("You have no activity : (");
    }

    public boolean isNoResultTextPresent() {
        return utils.getText(EMPTY_STATE_TEXT).equals("No Result");
    }

}
