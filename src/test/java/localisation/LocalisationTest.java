package localisation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.*;
import steps.CreateFlowSteps;
import steps.EditorSteps;
import steps.OnBoardingSteps;
import steps.PhotoChooserSteps;
import utils.AppiumServerStartSession;

import static org.testng.Assert.assertTrue;

public class LocalisationTest extends AppiumServerStartSession {
    private EditorScreen editorScreen;
    private EditorSteps editorSteps;
    private OnBoardingScreen onboardingScreen;
    private OnBoardingSteps onboardingSteps;
    private CreateFlowSteps createFlowSteps;
    private CreateFlowScreen createFlowScreen;
    private PhotoChooserScreen photoChooserScreen;
    private PhotoChooserSteps photoChooserSteps;
    private MyNetworkScreen myNetworkScreen;
    private ShareScreen shareScreen;
    private DiscoverScreen discoverScreen;
    private ProfileScreen profileScreen;


    @BeforeClass
    public void setup() {
        editorScreen = new EditorScreen(driver);
        editorSteps = new EditorSteps(driver);
        onboardingScreen = new OnBoardingScreen(driver);
        onboardingSteps = new OnBoardingSteps(driver);
        createFlowSteps = new CreateFlowSteps(driver);
        createFlowScreen = new CreateFlowScreen(driver);
        photoChooserScreen = new PhotoChooserScreen(driver);
        photoChooserSteps = new PhotoChooserSteps(driver);
        myNetworkScreen = new MyNetworkScreen(driver);
        discoverScreen = new DiscoverScreen(driver);
        profileScreen = new ProfileScreen(driver);

        shareScreen = new ShareScreen(driver);
        if (onboardingScreen.isSignInButtonPresent()) {
            onboardingSteps.signIn();
        }
    }

    // Verify the functionality of following artists on Discover artists page
    @Test
    public void step_1_verifyFunctionalityOfFollowingArtistsOnDiscoverPage() {
        profileScreen.clickProfileTab();
//        assertTrue(profileScreen.isProfileMoreButtonPresent(), "Profile tab is not open"); //todo stugel mejeti button ov
        profileScreen.clickProfileMoreButton();
        profileScreen.clickDiscoverArtistsButton();
        assertTrue(discoverScreen.isDiscoverArtistsPresent(), "Discover Artists title is not present on the discover screen");
        discoverScreen.verticalScrollToUpDiscoverArtistsScreen();
        for (int i = 0; i < 2; i++) {
            discoverScreen.clickFollowButtonByIndex(i);
            assertTrue(discoverScreen.isFollowingButtonTextPresent(i),"FOllOWING TEXT is not present");
            discoverScreen.clickFollowButtonByIndex(i);
        }

    }

    @Test
    //Editor Share flow
    public void step_2_verifyFunctionalityEditorShareFlow() {

//        assertTrue(); explore page
//        editorSteps.goToEditorScreenFromRecentImage();
        editorScreen.clickFubButton(); //todo harcnel fub button vor screen i meja mtnum
        createFlowSteps.accessPhotoPermission(); //todo arji stepic ogtvel esi ?
        createFlowScreen.clickAllPhotoButton();
        assertTrue(photoChooserScreen.isPhotoChooserImageListPresent(), "Photo chooser is not present on the screen");
        photoChooserScreen.clickOnPhoto();
        editorSteps.skipGoldPopup();
        photoChooserSteps.skipChooseImageSize();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        int repeat = 5;
        while (!editorScreen.isEffectsButtonPresent() && repeat > 0) {
            editorScreen.swipeEditorPanelToLeft();
            repeat--;
        }
        editorScreen.clickEffectsButton();
        editorScreen.chooseMagicCategoryByName();
        editorScreen.clickApplyDoneButton();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        while (!editorScreen.isDrawButtonPresent() && repeat > 0) {
            editorScreen.swipeEditorPanelToLeft();
            repeat--;
        }
        editorScreen.clickDrawButton();
        editorScreen.clickPicsArtDrawingButton();
        editorScreen.clickAddPhotoButton();
        editorScreen.clickDrawingAddPhotoButton();
        photoChooserScreen.clickOnPhoto();
        shareScreen.clickButtonDone();
        editorScreen.clickButtonActionDone();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        while (!editorScreen.isStickerButtonPresent() && repeat > 0) {
            editorScreen.swipeEditorPanelToRight();
            repeat--;
        }
        editorScreen.clickStickerButton();
        editorScreen.clickOnSticker();
        shareScreen.clickButtonDone();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        int againSwipe = 5;
        while (!editorScreen.isShopButtonPresent() && againSwipe > 0) {
            editorScreen.swipeEditorPanelToRight();
            againSwipe--;
        }
        editorScreen.clickShopButton();
        assertTrue(editorScreen.isSubscriptionOfferScreenPresent(), "Offer screen is not present");
        editorScreen.clickXButtonInOfferScreen();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        editorScreen.clickEditorNextButton();
        assertTrue(editorScreen.isUploadShareButtonPresent(), "Share screen is not present");
        shareScreen.clickUploadShareButton();//todo upload ha fail a gnum
        shareScreen.clickButtonDone();
        myNetworkScreen.clickImageMyNetworkTab();
        myNetworkScreen.clickMoreButton();
        assertTrue(myNetworkScreen.isImageSettingsPresent(), "image settings is not present");
        myNetworkScreen.clickEditButton();
        shareScreen.addTag();
        shareScreen.clickNextButton();
//        assertTrue(myNetworkScreen.isImageDescriptionTextPresent(), "#football tag is not updated"); //todo misht freetoedit mnuma share aneluc
    }
}