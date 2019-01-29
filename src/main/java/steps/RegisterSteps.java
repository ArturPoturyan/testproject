package steps;

import io.appium.java_client.android.AndroidDriver;
import screens.RegisterScreen;

public class RegisterSteps {


    private RegisterScreen registerScreen;
    AndroidDriver driver;

    public RegisterSteps(AndroidDriver driver) {
        this.driver = driver;
        registerScreen = new RegisterScreen(driver);
    }

    public void registerNewUser() throws InterruptedException {

        registerScreen.clickCreateAccountButton();
        registerScreen.typeUserInfoEmailText();
        Thread.sleep(2000);
        registerScreen.clickNextButton();
        registerScreen.typeUserInfoFullNameText();
        registerScreen.clickNextButton();
        registerScreen.typeUserInfoUsernameText();
        Thread.sleep(2000);
        registerScreen.clickNextButton();
        registerScreen.clickNextButton();
        Thread.sleep(2000);
        if (registerScreen.isForgotToAddProfilePhotoPopupPresent()) {
            registerScreen.clickMaybeLaterButton();
        }
        registerScreen.clickBirthdaySkipButton();
        if (registerScreen.isPaymentButton1Present()) {
            registerScreen.clickSubscriptionOfferCloseButton();
        }
    }

}