package testeditor;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.EditorScreen;
import steps.EditorSteps;
import utils.DesiredCapsManager;

import static org.testng.Assert.assertTrue;

public class EditorScreenTest extends DesiredCapsManager {

    private EditorScreen editorScreen;
    private EditorSteps editorSteps;


    @BeforeClass
    public void setup() {
        editorScreen = new EditorScreen(driver);
        editorSteps = new EditorSteps(driver);
    }


    //TODO Test Case 1 By Serg
    //image shared successfully
    @Test
    public void verifyFunctionalityOfImageSharedSuccessfully() {
        editorSteps.openFreeToEditPhotoInEditor();
        editorSteps.skipGoldPopup();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        int repeat = 5;
        while (!editorScreen.isEffectsCategoryPresent() && repeat > 0) {
            editorScreen.swipeEditorPanelToLeft();
            repeat--;
        }
        editorScreen.clickEffectsCategoryButton();
        editorScreen.clickBlurEffectsCategory();
        editorScreen.clickBlurCategoryItem();
        editorScreen.clickBlurCategoryItem();
        editorScreen.swipeSeekBarToRight();
        editorScreen.clickApplyDoneButton();
        editorScreen.clickEditorNextButton();
        editorScreen.clickUploadShareButton();
        editorScreen.clickUploadDoneButton();
        //stugi share exela photon te che

    }


    //TODO Test Case 3 By Serg
    @Test
    public void verifyFunctionalityArtisticAndBlurCategory() {
        editorSteps.openFreeToEditPhotoInEditor();
        editorScreen.clickEffectsCategoryButton();
        editorScreen.clickArtisticEffectsCategory();
        assertTrue(editorScreen.isArtisticButtonSelected(), "not present");

//        assertTrue(editorScreen.isOilPaintingEffectsNamePresent()
//                , "Artistic effects category is not present");


        editorScreen.clickOilPaintingArtisticEffect();
        editorScreen.clickPolygonArtisticEffect();
        editorScreen.clickPosterArtisticEffect();
        editorScreen.swipeArtisticCategoryToLeft();
        editorScreen.clickHalfToneDotsArtisticEffect();
        editorScreen.clickMotionArtisticEffect();
        editorScreen.clickShearArtisticEffect();
        editorScreen.clickPastedArtisticEffect();
        editorScreen.clickComicArtisticEffect();
        editorScreen.clickGouacheArtisticEffect();
        editorScreen.clickOldPaperArtisticEffect();
        editorScreen.clickNeonArtisticEffect();



    }
}
