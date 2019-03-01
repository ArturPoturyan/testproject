package testnotification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.NotificationScreen;
import steps.LoginSteps;
import steps.NotificationSteps;
import steps.RegisterSteps;
import utils.DesiredCapsManager;

import static org.testng.AssertJUnit.assertTrue;

public class NotificationScreenTest extends DesiredCapsManager {


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
    @Test
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
        assertTrue("No Result is not present on the notification Following tab"
                , notificationScreen.isNoResultTextPresent());

    }
    //TODO PIA-53635

    // [InApp_Notifications] Verify the appearance of "Empty State" in "Me" tab in case there is no notification available && has no post
    @Test
    public void verifyAppearanceOfUploadImageButton() {
        notificationScreen.clickFeedsTab();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        assertTrue("You have no activity :( is not present on the notification me tab"
                , notificationScreen.isYouHaveNoActivityTextPresent());

    }

    //TODO PIA-53641
    //[InApp_Notifications] Verify the functionality of taping "Upload image" button in case there is no notification available && has no post
    @Test(dependsOnMethods = {"verifyAppearanceOfUploadImageButton"})
    public void verifyFunctionalityOfUploadImageButton() {
        notificationScreen.clickFeedsTab();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        notificationScreen.clickUploadImageButton();
        assertTrue("Photo chooser is not present on the screen",
                notificationScreen.isPhotoChooserImageListPresent());
    }


    //TODO PIA-53614
    //[InApp_Notifications] Verify the appearance of Empty State in "Me" tab in case there is "no notification available && has posts"
    @Test(dependsOnMethods = {"verifyFunctionalityOfUploadImageButton"})
    public void verifyAppearanceOfLetIsStartButton() {
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        notificationScreen.clickUploadImageButton();
        notificationScreen.clickOnPhoto();
        notificationSteps.skipGoldPopup();
        notificationScreen.clickEditorNextButton();
        notificationScreen.clickUploadShareButton();
        notificationScreen.clickUploadDoneButton();
        notificationScreen.clickProfileTab();
        notificationScreen.verticalScrollToUpSettingsScreen();//todo refresh

        notificationScreen.clickFeedsTab();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        assertTrue("Find People to Follow text is not present on the notification Me tab",
                notificationScreen.isFindPeopleToFollowTextPresent());
    }

    //TODO PIA-53620
    //[InApp_Notifications] Verify the functionality of Taping "Let's Start" button in empty state in case there is no "notification available && has posts"
    @Test(dependsOnMethods = {"verifyAppearanceOfLetIsStartButton"})
    public void verifyFunctionalityOfLetIsStartButton() {
        notificationScreen.clickFeedsTab();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        notificationScreen.clickLetIsStartButton();
        assertTrue("Discover Artists title is not present on the discover screen"
                , notificationScreen.isDiscoverArtistsPresent());

    }


    //TODO PIA-56760
    //[Notifications_Settings] Verify the appearance of "Contact Support" button in about section from App settings
    @Test
    public void verifyAppearanceOfContactSupportButton() {
        notificationScreen.clickProfileTab();
        notificationScreen.clickProfileMoreButton();
        notificationScreen.clickSettingsButton();
        int k = 0;
        while (!notificationScreen.isContactSupportTextPresent() && k < 10) {
            notificationScreen.verticalScrollToUpSettingsScreen();
            k++;
        }
        assertTrue("Contact Support title is not present on the settings page", notificationScreen.isContactSupportTextPresent());
    }


    //TODO PIA-56762
    //[Notifications_Settings] Verify the functionality of taping on the "Contact Support" button form app settings
    @Test
    public void verifyFunctionalityOfContactSupportButton() {
        notificationScreen.clickProfileTab();
        notificationScreen.clickProfileMoreButton();
        notificationScreen.clickSettingsButton();
        int k = 0;
        while (!notificationScreen.isContactSupportTextPresent() && k < 10) {
            notificationScreen.scrollSettingsToUp();
            k++;
        }
        assertTrue("Contact Support button is not present on settings screen",
                notificationScreen.isContactSupportTextPresent());
        notificationScreen.clickContactSupportButton();
        assertTrue("Choose Email Client is not present ", notificationScreen.isChooseEmailClientTextPresent());
    }

//
//    @Test
//    public void swipeLeftAndRight() {
//        notificationScreen.clickFeedsTab();
//        int repeat = 10;
//        while (!notificationScreen.isZoomableItemPresent() && repeat > 0) {
//            notificationScreen.scrollHomeToUp();
//            repeat--;
//        }
//        notificationScreen.clickImageMyNetworkTab();
//        assertTrue("actions panel is not present ", notificationScreen.isUserAvatarIconPresent());
//        for (int i = 0; i < 5; i++) {
//            notificationScreen.swipeHomeImageToLeft();
//        }
//        for (int i = 0; i < 5; i++) {
//            notificationScreen.swipeHomeImageToRight();
//        }
//        int swipeTryes = 10;
//        while (!notificationScreen.isGalleryCommentButtonPresent() && swipeTryes > 0) {
//            notificationScreen.swipeHomeImageToLeft();
//            swipeTryes--;
//        }
//        notificationScreen.clickGalleryCommentButton();
//        notificationScreen.clickCommentInputField();
//        notificationScreen.typeCommentText();
//        assertTrue("Send button is not enabled ", notificationScreen.isSendButtonEnabled());
//    }
}