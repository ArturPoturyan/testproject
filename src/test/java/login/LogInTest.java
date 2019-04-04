package login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.OnBoardingScreen;
import screens.ProfileScreen;
import steps.CreateFlowSteps;
import steps.OnBoardingSteps;
import steps.ShopSteps;
import utils.AppiumServerStartSession;

import static org.testng.Assert.assertTrue;

public class LogInTest extends AppiumServerStartSession {

    private OnBoardingSteps onboardingSteps;
    private OnBoardingScreen onboardingScreen;
    private ShopSteps shopSteps;
    private ProfileScreen profileScreen;
    private CreateFlowSteps createFlowSteps;

    @BeforeClass
    public void setup() {

        onboardingSteps = new OnBoardingSteps(driver);
        onboardingScreen = new OnBoardingScreen(driver);
        shopSteps = new ShopSteps(driver);
        profileScreen = new ProfileScreen(driver);
        createFlowSteps = new CreateFlowSteps(driver);

    }

    @Test
    public void verifyFunctionalityOfSignIn() {
        onboardingScreen.clickSignInButton();
        onboardingSteps.skipContinueEmailPopUp();
        onboardingScreen.typeUsername("kakao60");
        onboardingScreen.typeSignInPassword("qwertya");
        onboardingScreen.clickFinalSignInButton();
        shopSteps.skipSubscriptionPopup();
        createFlowSteps.clickFromCreateFlowScreenXbutton();
        profileScreen.clickProfileTab();
        assertTrue(profileScreen.isUserAvatarPresent(), "successfully logged in PA ");
    }
}
