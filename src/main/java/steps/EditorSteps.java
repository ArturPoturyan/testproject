package steps;

import io.appium.java_client.AppiumDriver;
import screens.EditorScreen;
import utils.Utils;

public class EditorSteps {


    private AppiumDriver driver;
    private EditorScreen editorScreen;
    private Utils utils;


    public EditorSteps(AppiumDriver driver) {
        this.driver = driver;
        editorScreen = new EditorScreen(driver);
        utils = new Utils(driver);

    }


    public void skipChooseImageSize() {
        if (editorScreen.isChooseImageSizePopupPresent()) {
            editorScreen.clickSetSizeButton();

        }
    }

    public void skipGoldPopup() {
        if (editorScreen.isPicsArtGoldPopupPresent()) {
            editorScreen.clickGoldPopupSkipButton();
        }
    }

    public void openEditorWithFreeToEditImage() {
        editorScreen.clickFubButton();
        accessPhotoPermission();
        editorScreen.clickAllPhotoButton();
        editorScreen.clickArrowButton();
        editorScreen.clickFreeToEditButton();
        editorScreen.clickOnPhoto();
        skipChooseImageSize();
        skipGoldPopup();
    }

    public void skipGoldOfferScreen() {
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

    public void accessPhotoPermission() {
        if (editorScreen.isStoragePermissionPopupPresent()) {
            editorScreen.clickPermissionLetIsGoButton();
            editorScreen.clickPermissionAllowButton();
            editorScreen.clickBackImageButton();
        }
//        if (editorScreen.isDevicePhotosPermissionPopupPresent()) {
//            editorScreen.clickPermissionAllowButton();
//        }
//        if (editorScreen.isCreateFlowScreenPresent()) {
//            editorScreen.clickBackImageButton();
//        }
    }

    public void goToEditorScreenFromRecentImage() {
        editorScreen.clickFubButton();
        accessPhotoPermission();
        editorScreen.clickAllPhotoButton();
        editorScreen.clickOnPhoto();
        skipChooseImageSize();
        skipGoldPopup();

    }
    public void goToDrawScreenFromCreateFlow() {
        editorScreen.clickFubButton();
        accessPhotoPermission();
        int repeat = 4;
        while (!editorScreen.isCreateNewButtonPresent() && repeat > 0) {
            editorScreen.scrollVerticalCreateFLowScreen();
            repeat--;
        }
        editorScreen.clickCreateNewButton();
    }
}
