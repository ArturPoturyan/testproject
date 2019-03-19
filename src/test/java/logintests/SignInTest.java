package logintests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.OnBoardingScreen;
import steps.OnBoardingSteps;
import utils.AppiumServerStartSession;

public class SignInTest extends AppiumServerStartSession {

    private OnBoardingSteps onboardingSteps;
    private OnBoardingScreen onboardingScreen;

    @BeforeClass
    public void setup() {

        onboardingSteps = new OnBoardingSteps(driver);
        onboardingSteps = new OnBoardingSteps(driver);

    }

    @Test
    public void verifyFunctionalityOfSignIn() {
        onboardingScreen.registerStepSignInButton();
        if (onboardingScreen.isContinueWithEmailPopupPresent()) {
            onboardingScreen.clickPopUpCancelButton();
        }
        onboardingScreen.typeSignInUsername();
        onboardingScreen.typeSignInPassword();
        onboardingScreen.clickFinalSignInButton();
    }
}
