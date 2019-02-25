package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonValues.APP_PACKAGE_NAME;


public class LoginScreenPageObjectFactory {
    private AppiumDriver<MobileElement> driver;

    public LoginScreenPageObjectFactory(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }


    @AndroidFindBy(id = APP_PACKAGE_NAME + ":id/register_step_sign_in")
    private AndroidElement firstSignInButton;


    @AndroidFindBy(id = APP_PACKAGE_NAME + ":id/sign_in_username")
    private AndroidElement usernameButton;


    @AndroidFindBy(id = APP_PACKAGE_NAME + ":id/sign_in_password")
    private AndroidElement passwordButton;


    @AndroidFindBy(id = APP_PACKAGE_NAME + ":id/sign_in_button")
    private AndroidElement signInButton;

    @AndroidFindBy(id = "com.google.android.gms:id/cancel")
    private AndroidElement continueWithEmailPopupCancelButton;

    @AndroidFindBy(id = "com.google.android.gms:id/cancel")
    private AndroidElement popupCancelButton;

    private void clickPopUpCancelButton() {
        popupCancelButton.click();
    }

    private void clickFirstSignInButton() {
        firstSignInButton.click();
    }


    private boolean isElementEnabled() {
        return signInButton.isEnabled();
    }

    private void typeUserName(String username) {
        usernameButton.sendKeys(username);
    }

    private void typePassword(String password) {
        passwordButton.sendKeys(password);
    }

    private void clickSignInButton() {
        signInButton.click();
    }

    public boolean isElementPresent() {
        return continueWithEmailPopupCancelButton.isDisplayed();
    }


    public void signInPicsArt(String username, String password) {
        clickFirstSignInButton();
        if (isElementPresent()) {
            clickPopUpCancelButton();
        }
        typeUserName(username);
        typePassword(password);
        isElementEnabled();
        clickSignInButton();
    }
}
