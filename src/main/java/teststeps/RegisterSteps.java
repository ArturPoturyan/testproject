package teststeps;

import org.openqa.selenium.By;
import screens.Register;
import utils.DesiredCapsManager;

public class RegisterSteps extends DesiredCapsManager {
    Register register = new Register();

    public void register() throws InterruptedException {

        register.createAccountButton();
        register.userInfoEmailText();
        Thread.sleep(2000);
        register.nextButton();
        register.userInfoFullNameText();
        register.nextButton();
        register.userInfoUsernameText();
        Thread.sleep(2000);
        register.nextButton();
        register.nextButton();
        Thread.sleep(2000);
        if (driver.findElements(By.id("com.picsart.studio:id/pop_up_layout")).size() > 0) {
            register.maybeLater();
        }
        register.birthdaySkipButton();
        if (driver.findElements(By.id("com.picsart.studio:id/subscription_payment_button_1")).size() > 0) {
            register.subscriptionOfferCloseButton();
        }
        Thread.sleep(2000);
    }
}
