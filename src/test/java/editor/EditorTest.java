package editor;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.EditorScreen;
import screens.OnBoardingScreen;
import screens.ShareScreen;
import steps.CreateFlowSteps;
import steps.EditorSteps;
import steps.OnBoardingSteps;
import steps.ShopSteps;
import utils.AppiumServerStartSession;

import static org.testng.Assert.assertTrue;

public class EditorTest extends AppiumServerStartSession {

    private EditorScreen editorScreen;
    private EditorSteps editorSteps;
    private OnBoardingScreen onboardingScreen;
    private OnBoardingSteps onboardingSteps;
    private ShopSteps shopSteps;
    private ShareScreen shareScreen;
    private CreateFlowSteps createFlowSteps;


    @BeforeClass
    public void setup() {
        editorScreen = new EditorScreen(driver);
        editorSteps = new EditorSteps(driver);
        onboardingScreen = new OnBoardingScreen(driver);
        onboardingSteps = new OnBoardingSteps(driver);
        shopSteps = new ShopSteps(driver);
        shareScreen = new ShareScreen(driver);

        if (onboardingScreen.isSignInButtonPresent()) {
            onboardingSteps.signIn();
            createFlowSteps.clickFromCreateFlowScreenXbutton();
        }
    }


    //TODO Test Case 1 By Serg
    //image shared successfully
    @Test
    public void verifyFunctionalityOfImageSharedSuccessfully() {
        editorSteps.goToEditorScreenFromRecentImage();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        editorScreen.swipeTillItemAppear(editorScreen.EFFECTS_BUTTON, editorScreen.EDITOR_BOTTOM_PANEL, 5);
        editorScreen.clickEffectsButton();
        editorScreen.chooseBlurCategoryByName();
        editorScreen.clickBlurEffect();
        editorScreen.clickBlurEffect();
        editorScreen.swipeSeekBarToRight();
        editorScreen.clickApplyDoneButton();
        editorScreen.clickEditorNextButton();
        assertTrue(shareScreen.isUploadShareButtonPresent(), "Upload share button is not present ");

    }

    //TODO Test Case 2 By Serg
    @Test
    public void verifyFunctionalityArtisticAndBlurCategory() {
        editorSteps.openEditorWithFreeToEditImage();
        editorScreen.clickEffectsButton();
        editorScreen.chooseArtisticCategoryByName();
        assertTrue(editorScreen.isOilPaintingEffectsNamePresent(), "Artistic effects category is not present");
        editorSteps.applyAllArtisticEffects();
        editorScreen.chooseBlurCategoryByName();
        assertTrue(editorScreen.isBlurEffectNamePresent(), "Blur effect name is not present");
        editorSteps.applyAllBlurEffects();

    }

    //    //TODO Test Case 3 By Serg
    @Test
    public void verifyDrawFunctionality() {

        editorSteps.goToDrawScreenFromCreateFlow();
        assertTrue(editorScreen.isBrushButtonPresent(), "Draw brush mode is not present");
        for (int i = 0; i < 5; i++) {
            editorScreen.clickDrawBrashMode();
            editorScreen.clickDrawingBrushItem(i);
            editorScreen.clickSetButton();
            editorScreen.drawWithBrush();
            assertTrue(editorScreen.isUndoButtonEnabled(), "Undo button is not enabled");
            editorScreen.clickUndoButton();

        }
    }
}
