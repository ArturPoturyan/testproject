package steps;

import io.appium.java_client.AppiumDriver;
import screens.CreateFlowScreen;
import screens.EditorScreen;
import screens.ExploreScreen;
import screens.PhotoChooserScreen;

public class EditorSteps {


    private EditorScreen editorScreen;
    private CreateFlowScreen createFlowScreen;
    private PhotoChooserScreen photoChooserScreen;
    private PhotoChooserSteps photoChooserSteps;
    private ExploreScreen exploreScreen;
    private ShopSteps shopSteps;


    public EditorSteps(AppiumDriver driver) {
        editorScreen = new EditorScreen(driver);
        createFlowScreen = new CreateFlowScreen(driver);
        photoChooserScreen = new PhotoChooserScreen(driver);
        photoChooserSteps = new PhotoChooserSteps(driver);
        exploreScreen = new ExploreScreen(driver);
        shopSteps = new ShopSteps(driver);
    }



    public void openEditorWithFreeToEditImage() {
        exploreScreen.clickFubButton();
        createFlowScreen.clickAllPhotoButton();
        photoChooserScreen.clickArrowButton();
        photoChooserScreen.clickFreeToEditButton();
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        shopSteps.skipSubscriptionPopup();
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
        exploreScreen.clickFubButton();
        createFlowScreen.clickAllPhotoButton();
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        shopSteps.skipSubscriptionPopup();
    }

    public void goToDrawScreenFromCreateFlow() {
        exploreScreen.clickFubButton();
        int repeat = 4;
        while (!createFlowScreen.isCreateNewButtonPresent() && repeat > 0) {
            createFlowScreen.scrollToUp();
            repeat--;
        }
        createFlowScreen.clickCreateNewButton();
    }

}
