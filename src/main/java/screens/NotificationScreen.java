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
        utils = new Utils((AndroidDriver) this.driver);

    }

    //Buttons
    private By NOTIFICATION_BUTTON = By.id("com.picsart.studio:id/menu_main_notification");
    private By LET_IS_GO_BUTTON = By.id("com.picsart.studio:id/btn_positive");
    private By PERMISSION_ALLOW_BUTTON = By.id("com.android.packageinstaller:id/permission_allow_button");
    private By CLOSE_CREATE_FLOW = new By.ByClassName("android.widget.ImageButton");
    private By UPLOAD_IMAGE_BUTTON = By.id("com.picsart.studio:id/btn_primary");
    private By PHOTO_CHOOSER_IMAGE_LIST = By.id("com.picsart.studio:id/grid_image");
    private By FAB_BUTTON = By.id("com.picsart.studio:id/center_button_create_id");
    private By CLICK_NOTIFICATION_TAB = By.className("android.support.v7.app.ActionBar$Tab");
    private By NOTIFICATION_BACK_BUTTON = By.id("com.picsart.studio:id/pa_upload_btn_back");
    private By GOLD_SKIP_BUTTON = By.id("com.picsart.studio:id/btn_negative");
    private By EDITOR_NEXT_BUTTON = By.id("com.picsart.studio:id/btn_share");
    private By UPLOAD_SHARE_BUTTON = By.id("com.picsart.studio:id/share_in_bottom");
    private By UPLOAD_DONE_BUTTON = By.id("com.picsart.studio:id/btn_done");
    private By FIND_PEOPLE_TO_FOLLOW = By.id("com.picsart.studio:id/tv_title");


    //Views
    private By STORAGE_PERMISSION_POPUP = By.id("com.picsart.studio:id/pop_up_layout");
    private By PHOTO_ACCESS_PERMISSION_POPUP = By.id("com.android.packageinstaller:id/dialog_container");
    private By CREATE_FLOW_SCREEN = By.id("com.picsart.studio:id/recycler_view");
    private By TRY_GOLD_FOR_FREE = By.id("com.picsart.studio:id/main_content");


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

        utils.clickByIndex(PHOTO_CHOOSER_IMAGE_LIST, 8);
    }

    public void clickNotificationBackButton() {
        utils.clickIdButton(NOTIFICATION_BACK_BUTTON);
    }

    public void clickGoldPopupSkipButton() {
        utils.clickIdButton(GOLD_SKIP_BUTTON);
    }

    public void clickNotificationButton() {
        utils.clickIdButton(NOTIFICATION_BUTTON);

    }

    public void clickPermissionLetIsGoButton() {
        utils.clickIdButton(LET_IS_GO_BUTTON);
    }

    public void clickPermissionAllowButton() {
        utils.clickIdButton(PERMISSION_ALLOW_BUTTON);
    }

    public void clickCloseCreateFlowButton() {
        utils.clickIdButton(CLOSE_CREATE_FLOW);
    }

//    public void clickFubPlusButton() {
//        utils.clickIdButton(FAB_BUTTON);
//    }


    public void clickUploadImageButton() {
        utils.clickIdButton(UPLOAD_IMAGE_BUTTON);
    }

    public void clickOnMeTab() {
        utils.clickByIndex(CLICK_NOTIFICATION_TAB, 1);

    }

    public void clickOnFollowingTab() {
        utils.clickByIndex(CLICK_NOTIFICATION_TAB, 2);


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
        return utils.isElementPresent(PHOTO_CHOOSER_IMAGE_LIST);
    }

    public boolean isPicsArtGoldPopupPresent() {
        return utils.isElementPresent(TRY_GOLD_FOR_FREE);
    }

    public boolean isFindPeopleToFollowPresent() {
        return utils.isElementPresent(FIND_PEOPLE_TO_FOLLOW);
    }
}
