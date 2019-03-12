package notificationtest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.NotificationScreen;
import steps.LoginSteps;
import steps.NotificationSteps;
import steps.RegisterSteps;
import utils.AppiumServerStartSession;

import static org.testng.Assert.assertTrue;

public class NotificationScreenTest extends AppiumServerStartSession {


    private RegisterSteps registerSteps;
    private NotificationScreen notificationScreen;
    private NotificationSteps notificationSteps;
    private LoginScreen loginScreen;
    private LoginSteps loginSteps;


    @BeforeClass
    public void setup() {

        registerSteps = new RegisterSteps(driver);
        notificationScreen = new NotificationScreen(driver);
        notificationSteps = new NotificationSteps(driver);
        loginScreen = new LoginScreen(driver);
        loginSteps = new LoginSteps(driver);
        if (loginScreen.isSignInButtonPresent()) {
            loginSteps.signIn();
        }
    }

    //    //TODO PIA-53631
    //[InApp_Notifications] Verify the appearance of  "Empty State" if there is no notification in Following tab
    @Test(priority = 1)
    public void verifyAppearanceOfEmptyStateInFollowingTab() throws InterruptedException {
        notificationSteps.logOutFromPicsArt();
        registerSteps.registerNewUser();
        notificationSteps.accessPhotoPermission();
        notificationScreen.clickProfileTab();
        notificationScreen.clickFollowingsButton();
        notificationScreen.clickFollowButton();
        notificationScreen.clickBackImageButton();
        notificationScreen.clickFeedsTab();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnFollowingTab();
        assertTrue(notificationScreen.isNoResultTextPresent(), "No Result is not present on the notification Following tab");

    }

    //TODO PIA-53635,TODO PIA-53641

    // [InApp_Notifications] verify appearance and functionality upload image button
    @Test(priority = 2, dependsOnMethods = {"verifyAppearanceOfEmptyStateInFollowingTab"})
    public void verifyAppearanceAndFunctionalityUploadImageButton() {
        notificationScreen.clickFeedsTab();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        assertTrue(notificationScreen.isYouHaveNoActivityTextPresent(), "You have no activity :( is not present on the notification me tab"
        );
        notificationScreen.clickUploadImageButton();
        assertTrue(notificationScreen.isPhotoChooserImageListPresent(), "Photo chooser is not present on the screen");

    }

    //TODO PIA-53614,PIA-53620
    //[InApp_Notifications] verify appearance and functionality of let is start button
    @Test(priority = 3, dependsOnMethods = {"verifyAppearanceOfEmptyStateInFollowingTab"})
    public void verifyAppearanceAndFunctionalityOfLetIsStartButton() {
        notificationScreen.clickFeedsTab();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        notificationScreen.clickUploadImageButton();
        notificationScreen.clickOnPhoto();
        notificationSteps.skipGoldPopup();
        notificationScreen.clickEditorNextButton();
        notificationScreen.clickUploadShareButton();
        notificationScreen.clickUploadDoneButton();
        notificationScreen.clickProfileTab();
        assertTrue(notificationScreen.isProfileMoreButtonPresent(), "Profile more button is not present ");
        notificationScreen.pullToRefreshInProfilePage();
        notificationScreen.clickFeedsTab();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        assertTrue(notificationScreen.isFindPeopleToFollowTextPresent(), "Find People to Follow text is not present on the notification Me tab");
        notificationScreen.clickLetIsStartButton();
        assertTrue(notificationScreen.isDiscoverArtistsPresent(), "Discover Artists title is not present on the discover screen");
    }

    //TODO PIA-56760,PIA-56762
    //[Notifications_Settings] Verify the appearance and functionality of contact support button
    @Test(priority = 4, dependsOnMethods = {"verifyAppearanceOfEmptyStateInFollowingTab"})
    public void verifyAppearanceAndFunctionalityOfContactSupportButton() {
        notificationScreen.clickProfileTab();
        notificationScreen.clickProfileMoreButton();
        notificationScreen.clickSettingsButton();
        int k = 0;
        while (!notificationScreen.isContactSupportTextPresent() && k < 10) {
            notificationScreen.verticalScrollToUpSettingsScreen();
            k++;
        }
        assertTrue(notificationScreen.isContactSupportTextPresent(), "Contact Support title is not present on the settings page");
        notificationScreen.clickContactSupportButton();
        assertTrue(notificationScreen.isChooseEmailClientTextPresent(), "Choose Email Client is not present ");
    }

    @Test
    public void swipeLeftAndRight() {
        notificationScreen.clickFeedsTab();
        int repeat = 10;
        while (!notificationScreen.isZoomableItemPresent() && repeat > 0) {
            notificationScreen.scrollHomeToUp();
            repeat--;
        }
        notificationScreen.clickImageMyNetworkTab();
        assertTrue(notificationScreen.isUserAvatarIconPresent(), "actions panel is not present ");
        for (int i = 0; i < 5; i++) {
            notificationScreen.swipeHomeImageToLeft();
        }
        for (int i = 0; i < 5; i++) {
            notificationScreen.swipeHomeImageToRight();
        }
        int swipeTryes = 10;
        while (!notificationScreen.isGalleryCommentButtonPresent() && swipeTryes > 0) {
            notificationScreen.swipeHomeImageToLeft();
            swipeTryes--;
        }
        notificationScreen.clickGalleryCommentButton();
        notificationScreen.clickCommentInputField();
        notificationScreen.typeCommentText();
        assertTrue(notificationScreen.isSendButtonEnabled(), "Send button is not enabled ");
    }
}