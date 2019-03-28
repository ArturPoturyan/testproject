package steps;

import io.appium.java_client.AppiumDriver;
import screens.CreateFlowScreen;

public class CreateFlowSteps {
    private AppiumDriver driver;
    private CreateFlowScreen createFlowScreen;

    public CreateFlowSteps(AppiumDriver driver) {
        this.driver = driver;
        createFlowScreen = new CreateFlowScreen(driver);
    }

    public void accessPhotoPermission() {
        if (createFlowScreen.isStoragePermissionPopupPresent()) {
            createFlowScreen.clickPermissionLetIsGoButton();
            createFlowScreen.clickPermissionAllowButton();
            createFlowScreen.clickBackImageButton();
        }
    }

}