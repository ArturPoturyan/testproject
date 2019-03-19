package steps;

import io.appium.java_client.AppiumDriver;
import screens.CreateFlowScreen;
import screens.EditorScreen;
import screens.PhotoChooserScreen;
import utils.Utils;

public class EditorSteps {


    private AppiumDriver driver;
    private EditorScreen editorScreen;
    private Utils utils;
    private CreateFlowSteps createFlowSteps;
    private CreateFlowScreen createFlowScreen;
    private PhotoChooserScreen photoChooserScreen;
    private PhotoChooserSteps photoChooserSteps;


    public EditorSteps(AppiumDriver driver) {
        this.driver = driver;
        editorScreen = new EditorScreen(driver);
        utils = new Utils(driver);
        createFlowSteps = new CreateFlowSteps(driver);
        createFlowScreen = new CreateFlowScreen(driver);
        photoChooserScreen = new PhotoChooserScreen(driver);
        photoChooserSteps = new PhotoChooserSteps(driver);

    }

    public void skipGoldPopup() {//todo poxel
        if (editorScreen.isPicsArtGoldPopupPresent()) {
            editorScreen.clickGoldPopupSkipButton();
        }
    }

    public void openEditorWithFreeToEditImage() {
        editorScreen.clickFubButton();//todo poxel
        createFlowSteps.accessPhotoPermission();
        createFlowScreen.clickAllPhotoButton();
        photoChooserScreen.clickArrowButton();
        photoChooserScreen.clickFreeToEditButton();
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        skipGoldPopup();
    }

    public void skipGoldOfferScreen() {//todo poxel
        if (editorScreen.isSubscriptionOfferScreenPresent()) {
            editorScreen.clickXButtonInOfferScreen();
        }
    }

    public void applyAllArtisticEffects() {

        for (int i = 0; i < editorScreen.ARTISTIC_CATEGORY.length; i++) {
            editorScreen.clickEffectByName(editorScreen.ARTISTIC_CATEGORY[i]);
            editorScreen.waitUntilProgressBarIsDisappear();
        }
    }

    public void applyAllBlurEffects() {
        for (int i = 0; i < editorScreen.BLUR_CATEGORY.length; i++) {
            editorScreen.clickEffectByName(editorScreen.BLUR_CATEGORY[i]);
            editorScreen.waitUntilProgressBarIsDisappear();
        }
    }

    public void goToEditorScreenFromRecentImage() {
        editorScreen.clickFubButton(); //todo poxel
        createFlowSteps.accessPhotoPermission();
        createFlowScreen.clickAllPhotoButton();
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        skipGoldPopup();

    }

    public void goToDrawScreenFromCreateFlow() {
        editorScreen.clickFubButton();
        createFlowSteps.accessPhotoPermission();
        int repeat = 4;
        while (!createFlowScreen.isCreateNewButtonPresent() && repeat > 0) {
            editorScreen.scrollVerticalCreateFLowScreen();
            repeat--;
        }
        createFlowScreen.clickCreateNewButton();
    }
}
