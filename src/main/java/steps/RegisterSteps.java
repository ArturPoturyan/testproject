package steps;

import io.appium.java_client.android.AndroidDriver;
import screens.RegisterScreen;

import static org.testng.Assert.assertTrue;

public class RegisterSteps {


    private RegisterScreen registerScreen;
    AndroidDriver driver;

    public RegisterSteps(AndroidDriver driver) {
        this.driver = driver;
        registerScreen = new RegisterScreen(driver);
    }

    public void registerNewUser() {

        registerScreen.clickNextButton();
        registerScreen.typeUserInfoEmailText();
        assertTrue(registerScreen.isNextButtonEnabled(), "User info email next button is not enable ");
        registerScreen.clickNextButton();
//        registerScreen.typeUserInfoFullNameText();
        registerScreen.typePassword();
        assertTrue(registerScreen.isNextButtonEnabled(), "password next button is not enable ");
        registerScreen.clickNextButton();
        assertTrue(registerScreen.isUsernameCheckPositiveStatePresent(), "username check positive state is not present");
//        Thread.sleep(2000);
//        registerScreen.typeUserInfoUsernameText();
//        Thread.sleep(2000);
//            if (registerScreen.isNextButtonEnabled()) {
        registerScreen.clickNextButton();
//        }
        if (registerScreen.isForgotToAddProfilePhotoPopupPresent()) {
            registerScreen.clickMaybeLaterButton();
        }
        if (registerScreen.isSubscriptionBannerPresent()) {
            registerScreen.clickSubscriptionOfferCloseButton();

        }
//        assertTrue("payment button offer screen is not present on the screen"
//                , registerScreen.isSubscriptionBannerPresent());
//        registerScreen.clickBirthdaySkipButton();
//        registerScreen.clickSubscriptionOfferCloseButton();
    }
}