package testnotification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.NotificationScreen;
import steps.NotificationSteps;
import steps.RegisterSteps;
import utils.DesiredCapsManager;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class NotificationTest extends DesiredCapsManager {


    private RegisterSteps registerSteps;
    private NotificationScreen notificationScreen;
    private NotificationSteps notificationSteps;


    @BeforeClass
    public void setup() {

        registerSteps = new RegisterSteps(driver);
        notificationScreen = new NotificationScreen(driver);
        notificationSteps = new NotificationSteps(driver);
    }


    //TODO PIA-53641
    //[InApp_Notifications] Verify the functionality of taping Upload image button
    @Test(priority = 1)
    public void verifyUploadImageButton() throws InterruptedException {
        registerSteps.registerNewUser();
        notificationSteps.accessPhotoPermission();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        notificationScreen.clickUploadImageButton();
        assertTrue("Photo chooser is not present on the screen",
                notificationScreen.isPhotoChooserImageListPresent());
//        notificationScreen.resetData();
    }


    //TODO PIA-53614
    //[InApp_Notifications] Verify the appearance of Let's Start button in notification ME tab
    @Test(dependsOnMethods = {"verifyUploadImageButton"})
    public void verifyLetIsStartButton() throws InterruptedException {
        notificationScreen.clickOnPhoto();
        notificationSteps.skipGoldPopup();
        notificationScreen.clickEditorNextButton();
        notificationScreen.clickUploadShareButton();
        notificationScreen.clickUploadDoneButton();
        notificationScreen.clickNotificationButton();
        notificationScreen.clickOnMeTab();
        assertTrue("Find People to Folow text is " +
                "not present on the notification Me tab", notificationScreen.isFindPeopleToFollowPresent());


    }
}
