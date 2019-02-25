package steps;

import io.appium.java_client.AppiumDriver;
import screens.EditorScreen;

public class EditorSteps {


    private AppiumDriver driver;
    private EditorScreen editorScreen;


    public EditorSteps(AppiumDriver driver) {
        this.driver = driver;
        editorScreen = new EditorScreen(driver);

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

    public void openFreeToEditPhotoInEditor() {
        editorScreen.clickEditorFubButton();
        editorScreen.clickAllPhotoButton();
        editorScreen.clickArrowButton();
        editorScreen.clickFreeTOEditButton();
        editorScreen.clickOnPhoto();
        skipChooseImageSize();
        skipGoldPopup();
    }
}
