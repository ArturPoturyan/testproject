package teststeps;

import org.openqa.selenium.By;
import screens.Register;
import utils.DesiredCapsManager;

public class RegisterSteps {


    private Register registerScreen;


    public void register() throws InterruptedException {

        registerScreen = new Register();
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
        if (DesiredCapsManager.driver.findElements(By.id("com.picsart.studio:id/pop_up_layout")).size() > 0) {
            registerScreen.maybeLater();
        }
        registerScreen.birthdaySkipButton();
        if (DesiredCapsManager.driver.findElements(By.id("com.picsart.studio:id/subscription_payment_button_1")).size() > 0) {
            registerScreen.subscriptionOfferCloseButton();
        }
    }
}
