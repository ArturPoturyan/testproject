package steps;

import io.appium.java_client.AppiumDriver;
import screens.*;
import utils.Utils;

public class EditorSteps {


    private AppiumDriver driver;
    private EditorScreen editorScreen;
    private Utils utils;
    private CreateFlowSteps createFlowSteps;
    private CreateFlowScreen createFlowScreen;
    private PhotoChooserScreen photoChooserScreen;
    private PhotoChooserSteps photoChooserSteps;
    private ExploreScreen exploreScreen;
    private ShopSteps shopSteps;


    public EditorSteps(AppiumDriver driver) {
        this.driver = driver;
        editorScreen = new EditorScreen(driver);
        utils = new Utils(driver);
        createFlowSteps = new CreateFlowSteps(driver);
        createFlowScreen = new CreateFlowScreen(driver);
        photoChooserScreen = new PhotoChooserScreen(driver);
        photoChooserSteps = new PhotoChooserSteps(driver);
        exploreScreen = new ExploreScreen(driver);
        shopSteps = new ShopSteps(driver);

    }



    public void openEditorWithFreeToEditImage() {
        exploreScreen.clickFubButton();
//        createFlowSteps.accessPhotoPermission(); //todo harcnel toxnel mna esi te jnjem ?
        createFlowScreen.clickAllPhotoButton();
        photoChooserScreen.clickArrowButton();
        photoChooserScreen.clickFreeToEditButton();
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        shopSteps.skipGoldPopup();
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
//        createFlowSteps.accessPhotoPermission();
        createFlowScreen.clickAllPhotoButton();
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        shopSteps.skipGoldPopup();
    }

    public void goToDrawScreenFromCreateFlow() {
        exploreScreen.clickFubButton();
//        createFlowSteps.accessPhotoPermission();
        int repeat = 4;
        while (!createFlowScreen.isCreateNewButtonPresent() && repeat > 0) {
            createFlowScreen.scrollVerticalFromCenterToUpCreateFLowScreen();
            repeat--;
        }
        createFlowScreen.clickCreateNewButton();
    }

}
