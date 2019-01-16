package teststeps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import screens.Register;

public class RegisterSteps {

    AndroidDriver driver;
    Register registerScreen;

    public RegisterSteps(AndroidDriver androidDriver) {
        this.driver = androidDriver;
        registerScreen = new Register(driver);
    }

    public void register() throws InterruptedException {

        registerScreen.createAccountButton();
        registerScreen.userInfoEmailText();
        Thread.sleep(2000);
        registerScreen.nextButton();
        registerScreen.userInfoFullNameText();
        registerScreen.nextButton();
        registerScreen.userInfoUsernameText();
        Thread.sleep(2000);
        registerScreen.nextButton();
        registerScreen.nextButton();
        Thread.sleep(2000);
        if (driver.findElements(By.id("com.picsart.studio:id/pop_up_layout")).size() > 0) {
            registerScreen.maybeLater();
        }
        registerScreen.birthdaySkipButton();
        if (driver.findElements(By.id("com.picsart.studio:id/subscription_payment_button_1")).size() > 0) {
            registerScreen.subscriptionOfferCloseButton();
        }
    }
}
