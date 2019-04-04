package steps;

import io.appium.java_client.AppiumDriver;
import screens.OnBoardingScreen;

import static org.testng.Assert.assertTrue;

public class OnBoardingSteps {
    private OnBoardingScreen onboardingScreen;


    public OnBoardingSteps(AppiumDriver driver) {
        onboardingScreen = new OnBoardingScreen(driver);

    }

    public void signIn() {

        onboardingScreen.clickSignInButton();
        if (onboardingScreen.isContinueWithEmailPopupPresent()) {
            onboardingScreen.clickPopUpCancelButton();
        }
        onboardingScreen.typeUsername("kakao60");
        onboardingScreen.typeSignInPassword("qwertya");
        onboardingScreen.clickFinalSignInButton();
    }

    public void registerNewUser() {

        onboardingScreen.clickNextButton();
        onboardingScreen.typeEmail();
        assertTrue(onboardingScreen.isNextButtonEnabled(), "User info email next button is not enable ");
        onboardingScreen.clickNextButton();
//        registerScreen.typeUserInfoFullNameText();
        onboardingScreen.typeRegisterPassword();
        assertTrue(onboardingScreen.isNextButtonEnabled(), "password next button is not enable ");
        onboardingScreen.clickNextButton();
        assertTrue(onboardingScreen.isUsernameCheckPositiveStatePresent(), "username check positive state is not present");
//        Thread.sleep(2000);
//        registerScreen.typeUserInfoUsernameText();
//        Thread.sleep(2000);
//            if (registerScreen.isNextButtonEnabled()) {
        onboardingScreen.clickNextButton();
//        }
        if (onboardingScreen.isForgotToAddProfilePhotoPopupPresent()) {
            onboardingScreen.clickMaybeLaterButton();
        }
        if (onboardingScreen.isSubscriptionBannerPresent()) {
            onboardingScreen.clickSubscriptionOfferCloseButton();

        }
//        assertTrue("payment button offer screen is not present on the screen"
//                , registerScreen.isSubscriptionBannerPresent());
//        registerScreen.clickBirthdaySkipButton();
//        registerScreen.clickSubscriptionOfferCloseButton();
    }

    public void skipContinueEmailPopUp() {
        if (onboardingScreen.isContinueWithEmailPopupPresent()) {
            onboardingScreen.clickPopUpCancelButton();
        }
    }
}
