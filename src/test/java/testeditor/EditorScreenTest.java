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
        editorSteps.goToEditorScreenFromRecentImage();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        int repeat = 5;
        while (!editorScreen.isEffectsButtonPresent() && repeat > 0) {
            editorScreen.swipeEditorPanelToLeft();
            repeat--;
        }
        editorScreen.clickEffectsButton();
        editorScreen.chooseBlurCategoryByName();
        editorScreen.clickBlurEffect();
        editorScreen.clickBlurEffect();
        editorScreen.swipeSeekBarToRight();
        editorScreen.clickApplyDoneButton();
        editorScreen.clickEditorNextButton();
        assertTrue(editorScreen.isUploadShareButtonPresent(),
                "Upload share button is not present ");
    }


    //TODO Test Case 2 By Serg
    @Test
    public void verifyFunctionalityArtisticAndBlurCategory() throws InterruptedException {
        editorSteps.openEditorWithFreeToEditImage();
        editorScreen.clickEffectsButton();
        editorScreen.chooseArtisticCategoryByName();
        assertTrue(editorScreen.isOilPaintingEffectsNamePresent(), "Artistic effects category is not present");
        editorSteps.applyAllArtisticEffects();
        editorScreen.chooseBlurCategoryByName();
        assertTrue(editorScreen.isBlurEffectNamePresent(), "Blur effect name is not present");
        editorSteps.applyAllBlurEffects();

    }

    @Test
    public void verifyDrawFunctionality() throws InterruptedException {

        editorSteps.goToDrawScreenFromCreateFlow();
        assertTrue(editorScreen.isBrushButtonPresent(), "Draw brush mode is not present");
        for (int i = 0; i < 5; i++) {
            editorScreen.drawWithBrush();
            Thread.sleep(2000);
            assertTrue(editorScreen.isUndoButtonEnabled(), "Undo button is not enabled");
            editorScreen.clickUndoButton();
            editorScreen.clickDrawBrashMode();
            editorScreen.clickDrawingBrushItem(i);
            editorScreen.clickSetButton();
        }
    }
}
