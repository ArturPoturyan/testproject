package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class CameraScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public CameraScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    //Buttons
    private By BTN_POSITIVE = By.id(APP_PACKAGE_NAME + ":id/btn_positive");
    private By PERMISSION_ALLOW_BUTTON = By.id(APP_PACKAGE_NAME + "com.android.packageinstaller:id/permission_allow_button");
    private By BUTTON_POSITIVE_TV = By.id(APP_PACKAGE_NAME + ":id/btn_positive_tv");
    private By NEW_FILTER_RECYCLER = By.id("com.picsart.studio:id/newFilterRecycler");
    private By VIEW_GROUP = By.className("android.view.ViewGroup");
    private By SWAP= By.id("com.picsart.studio:id/swapCameraBtn");


    //Views

    public void swap(){
        utils.clickById(SWAP);
    }

    public boolean isCameraPermissionPresent() {
        return utils.isElementByTextPresent(BUTTON_POSITIVE_TV, "Let's Go");

    }

    public void clickFilterByIndex() {
        utils.clickElementOfListIndex(NEW_FILTER_RECYCLER, VIEW_GROUP, 1);
    }

    public void clickLetIsGoButton() {
        utils.clickById(BTN_POSITIVE);
    }

    public void clickPermissionAllowButton() {
        utils.clickById(PERMISSION_ALLOW_BUTTON);
    }


}
