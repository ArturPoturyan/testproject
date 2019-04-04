package steps;

import io.appium.java_client.AppiumDriver;
import screens.CreateFlowScreen;
import screens.ExploreScreen;

public class CameraSteps {
    private ExploreScreen exploreScreen;
    private CreateFlowScreen createFlowScreen;


    public CameraSteps(AppiumDriver driver) {
        exploreScreen = new ExploreScreen(driver);
        createFlowScreen = new CreateFlowScreen(driver);
    }


    public void goToCameraFromCreateFlow() {
        exploreScreen.clickFubButton();
        int repeat = 4;
        while (!createFlowScreen.isCameraButtonPresent() && repeat > 0) {
            createFlowScreen.scrollToUp();
            repeat--;
        }
        createFlowScreen.clickCameraButton();
    }
}
