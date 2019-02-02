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
import static org.testng.AssertJUnit.assertFalse;

public class NotificationScreenTest extends DesiredCapsManager {


    private RegisterSteps registerSteps;
    private NotificationScreen notificationScreen;
    private NotificationSteps notificationSteps;
    private LoginScreen loginScreen;
    private LoginSteps loginSteps;


    @BeforeClass
    public void setup() throws InterruptedException {

        registerSteps = new RegisterSteps(driver);
        notificationScreen = new NotificationScreen(driver);
        notificationSteps = new NotificationSteps(driver);
        loginScreen = new LoginScreen(driver);
        loginSteps = new LoginSteps(driver);
        if (loginScreen.isSignInButtonPresent()) {
            loginSteps.signIn();
        }


        //todo ete sign in exac chi, sign in linel
    }

    //todo imanal inchi hamar en gruper@
    //todo avelacnel beforeMethodum start app
    //todo avelacnel afterMethodum kill app


    //    //TODO PIA-53631
    //[InApp_Notifications] Verify the appearance of  "Empty State" if there is no notification in Following tab
    @Test(groups = "empty state")
    public void verifyAppearanceOfEmptyStateInFollowingTab() throws InterruptedException {
        if (notificationScreen.isMyNetworkPresent()) {
            notificationScreen.clickProfileTab();
            notificationScreen.clickProfileMoreButton();
            notificationScreen.clickProfileLogoutButton();
            notificationScreen.clickDialogOkButton();
        }
        //todo ete sing in eghac a, sign out lini
        registerSteps.registerNewUser();
        notificationSteps.accessPhotoPermission();
        if (notificationScreen.isMyNetworkPresent()) {
            notificationScreen.clickProfileTab();
        }
        notificationScreen.clickFollowingsButton();
        if (notificationScreen.isPicsArtUserPresent()) {
            notificationScreen.clickFollowButton();
        }
        notificationScreen.clickBackImageButton();
        notificationScreen.clickMyNetworkTab();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnFollowingTab();
        assertTrue("No Result is not present on the notification Following tab"
                , notificationScreen.isNoResultTextPresent());

    }
    //TODO PIA-53635

    // [InApp_Notifications] Verify the appearance of "Empty State" in "Me" tab in case there is no notification available && has no post
    @Test(groups = "UI test")
    public void verifyAppearanceOfUploadImageButton() {
        //todo ete sing in eghac a, sign out lini
        if (notificationScreen.isMyNetworkPresent()) {
            notificationScreen.clickNotificationButton();
        }
        notificationScreen.clickOnMeTab();
        assertTrue("You have no activity :( is not present on the notification me tab"
                , notificationScreen.isYouHaveNoActivityTextPresent());

    }

    //TODO PIA-53641
    //[InApp_Notifications] Verify the functionality of taping "Upload image" button in case there is no notification available && has no post
    @Test(groups = "empty state", dependsOnMethods = {"verifyAppearanceOfUploadImageButton"})
    public void verifyFunctionalityOfUploadImageButton() {
        //todo steper avelacnel
        if (notificationScreen.isMyNetworkPresent()) {
            notificationScreen.clickNotificationButton();
        }
        notificationScreen.clickOnMeTab();
        notificationScreen.clickUploadImageButton();
        assertTrue("Photo chooser is not present on the screen",
                notificationScreen.isPhotoChooserImageListPresent());
    }


    //TODO PIA-53614
    //[InApp_Notifications] Verify the appearance of Empty State in "Me" tab in case there is "no notification available && has posts"
    @Test(groups = "empty state", dependsOnMethods = {"verifyFunctionalityOfUploadImageButton"})
    public void verifyAppearanceOfLetIsStartButton() {
        //todo steper avelacnel

        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        notificationScreen.clickUploadImageButton();
        notificationScreen.clickOnPhoto();
        notificationSteps.skipGoldPopup();
        notificationScreen.clickEditorNextButton();
        notificationScreen.clickUploadShareButton();
        notificationScreen.clickUploadDoneButton();
        notificationScreen.clickProfileTab();
        notificationScreen.verticalSwipe(0.3, 0.9, 0.5);
        notificationScreen.clickMyNetworkTab();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        assertTrue("Find People to Follow text is not present on the notification Me tab",
                notificationScreen.isFindPeopleToFollowTextPresent());
    }

    //TODO PIA-53620
    //[InApp_Notifications] Verify the functionality of Taping "Let's Start" button in empty state in case there is no "notification available && has posts"
    @Test(groups = "empty state", dependsOnMethods = {"verifyAppearanceOfLetIsStartButton"})
    public void verifyFunctionalityOfLetIsStartButton() {
        //todo steper avelacnel
        if (notificationScreen.isMyNetworkPresent()) {
            notificationScreen.clickNotificationButton();
        }
        notificationScreen.clickOnMeTab();
        notificationScreen.clickLetIsStartButton();
        assertTrue("Discover Artists title is not present on the discover screen"
                , notificationScreen.isDiscoverArtistsPresent());
    }

    //todo mihat test, aranc dependsi, vor swipe ani nkarner@ aj u dzax. erku hat swipe i method Utilsum.


}
