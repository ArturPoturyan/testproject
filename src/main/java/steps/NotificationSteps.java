package steps;

import io.appium.java_client.android.AndroidDriver;
import screens.NotificationScreen;

import static org.testng.AssertJUnit.assertTrue;

public class NotificationSteps {

    private NotificationScreen notificationScreen;

    public NotificationSteps(AndroidDriver driver) {
        notificationScreen = new NotificationScreen(driver);
    }


    public void skipGoldPopup() {
        if (notificationScreen.isPicsArtGoldPopupPresent()) {
            notificationScreen.clickGoldPopupSkipButton();
        }
    }

    public void logOutFromPicsArt() {
        assertTrue("profile tab is not present", notificationScreen.isProfileTabPresent());
        notificationScreen.clickProfileTab();
        notificationScreen.clickProfileMoreButton();
        notificationScreen.clickProfileLogoutButton();
        notificationScreen.clickDialogOkButton();
    }
}
