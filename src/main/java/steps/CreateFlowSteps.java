package steps;

import io.appium.java_client.AppiumDriver;
import screens.CreateFlowScreen;

public class CreateFlowSteps {
    private CreateFlowScreen createFlowScreen;

    public CreateFlowSteps(AppiumDriver driver) {
        createFlowScreen = new CreateFlowScreen(driver);
    }

    public void clickFromCreateFlowScreenXbutton() {
        if (createFlowScreen.isCreateFlowScreenPresent()) {
            createFlowScreen.clickBackImageButton();
        }
    }
}