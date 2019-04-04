package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class CreateFlowScreen implements CommonValues {

    private AppiumDriver driver;
    private Utils utils;

    public CreateFlowScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);
    }

    //Button
    private By STORAGE_PERMISSION_POPUP = By.id(APP_PACKAGE_NAME + ":id/pop_up_layout");
    private By POSITIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_positive");
    private By PERMISSION_ALLOW_BUTTON = By.id("com.android.packageinstaller:id/permission_allow_button");
    private By BACK_IMAGE_BUTTON = By.className("android.widget.ImageButton");
    private By CREATE_FLOW_CARD_TEXT = By.id(APP_PACKAGE_NAME + ":id/card_text");
    private By DESCRIPTION = By.id(APP_PACKAGE_NAME + ":id/description");
    private By CREATE_FLOW_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/recycler_view");
    private By CREATE_FLOW_SEARCH = By.id(APP_PACKAGE_NAME + ":id/menu_create_flow_search");


    //Views

    public void clickCreateNewButton() {
        utils.clickElementByText(DESCRIPTION, "Create New");

    }

    public boolean isCreateFlowScreenPresent() {
        return utils.isElementPresent(CREATE_FLOW_SEARCH);
    }

    public void clickBackImageButton() {
        utils.clickById(BACK_IMAGE_BUTTON);
    }


    public void scrollToUp() {
        utils.scrollVerticalFromCenterToUp(CREATE_FLOW_RECYCLER_VIEW);

    }


    public boolean isCreateNewButtonPresent() {
        return utils.isElementByTextPresent(DESCRIPTION, "Create New");
    }

    public boolean isCameraButtonPresent() {
        return utils.isElementByTextPresent(DESCRIPTION, "Camera");

    }

    public void clickCameraButton() {
        utils.clickElementByText(DESCRIPTION, "Camera");
    }


    public void clickAllPhotoButton() {
        utils.clickByIndex(CREATE_FLOW_CARD_TEXT, 0);
    }


}
