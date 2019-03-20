package register;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.OnBoardingScreen;
import steps.OnBoardingSteps;
import utils.AppiumServerStartSession;

import static org.testng.Assert.assertTrue;


public class RegisterTest extends AppiumServerStartSession {


    private OnBoardingSteps onboardingSteps;
    private OnBoardingScreen onboardingScreen;

    @BeforeClass
    public void setup() {
        onboardingSteps = new OnBoardingSteps(driver);
        onboardingScreen = new OnBoardingScreen(driver);

    }

    @Test
    public void verifyFunctionalityOfRegister() {
        onboardingScreen.clickNextButton();
        onboardingScreen.typeUserInfoEmailText();
        assertTrue(onboardingScreen.isNextButtonEnabled(), "User info email next button in not enable ");
        onboardingScreen.clickNextButton();
        onboardingScreen.typePassword();
        assertTrue(onboardingScreen.isNextButtonEnabled(), "password next button is not enable ");
        onboardingScreen.clickNextButton();
        onboardingScreen.clickNextButton();

        if (onboardingScreen.isForgotToAddProfilePhotoPopupPresent()) {
            onboardingScreen.clickMaybeLaterButton();
        }
        assertTrue(onboardingScreen.isSubscriptionBannerPresent(), "payment button offer screen is not present on the screen");
        onboardingScreen.clickSubscriptionOfferCloseButton();
    }
}
