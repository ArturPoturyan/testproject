package steps;

import io.appium.java_client.android.AndroidDriver;
import screens.NotificationScreen;

public class NotificationSteps {

    private NotificationScreen notificationScreen;
    AndroidDriver driver;

    public NotificationSteps(AndroidDriver driver) {
        this.driver = driver;
        notificationScreen = new NotificationScreen(driver);
    }

    public void accessPhotoPermission() {
        if (notificationScreen.isStoragePermissionPopupPresent()) {
            notificationScreen.clickPermissionLetIsGoButton();
        }
        if (notificationScreen.isDevicePhotosPermissionPopupPresent()) {
            notificationScreen.clickPermissionAllowButton();
        }
        if (notificationScreen.isCreateFlowScreenPresent()) {
            notificationScreen.clickCloseCreateFlowButton();
        }
    }

    public void skipGoldPopup() {
        if (notificationScreen.isPicsArtGoldPopupPresent()) {
            notificationScreen.clickGoldPopupSkipButton();
        }
    }
}