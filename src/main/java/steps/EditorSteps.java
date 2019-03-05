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
        editorScreen.clickAllPhotoButton();
        editorScreen.clickArrowButton();
        editorScreen.clickFreeToEditButton();
        editorScreen.clickOnPhoto();
        skipChooseImageSize();
        skipGoldPopup();
    }

    public void skipGoldOffeScreen() {
        if (editorScreen.isSubscriptionOfferScreenPresent()) {
            editorScreen.clickXButtonInOfferScreen();
        }
    }

    public void applyAllArtisticEffects() throws InterruptedException {

        for (int i = 0; i < editorScreen.ARTISTIC_CATEGORY.length; i++) {

            if (editorScreen.isSimpleProgressPresent()) {
                Thread.sleep(2000);
            }
            editorScreen.clickEffectByName(editorScreen.ARTISTIC_CATEGORY[i]);
        }
    }

    public void applyAllBlurEffects() throws InterruptedException {
        for (int i = 0; i < editorScreen.BLUR_CATEGORY.length; i++) {
            if (editorScreen.isSimpleProgressPresent()) {
                Thread.sleep(2000);
            }
            editorScreen.clickEffectByName(editorScreen.BLUR_CATEGORY[i]);
        }
    }

    public void goToEditorScreenFromRecentImage() {
        editorScreen.clickFubButton();
        editorScreen.clickAllPhotoButton();
        editorScreen.clickOnPhoto();
        skipChooseImageSize();
        skipGoldPopup();

    }


    public void goToDrawScreenFromCreateFlow() {
        editorScreen.clickFubButton();
        int repeat = 4;
        while (!editorScreen.isCreateNewButtonPresent() && repeat > 0) {
            editorScreen.scrollVerticalCreateFLowScreen();
            repeat--;
        }
        editorScreen.clickCreateNewButton();
    }
}
