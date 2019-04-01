package steps;

import io.appium.java_client.AppiumDriver;
import screens.CameraScreen;
import screens.CreateFlowScreen;
import screens.ExploreScreen;

public class CameraSteps {
    private AppiumDriver driver;
    private ExploreScreen exploreScreen;
    private CreateFlowScreen createFlowScreen;
    private CameraScreen cameraScreen;
    private CreateFlowSteps createFlowSteps;

    public CameraSteps(AppiumDriver driver) {
        this.driver = driver;
        exploreScreen = new ExploreScreen(driver);
        createFlowScreen = new CreateFlowScreen(driver);
        cameraScreen = new CameraScreen(driver);
        createFlowSteps = new CreateFlowSteps(driver);
    }


    public void goToCameraFromCreateFlow() {
        exploreScreen.clickFubButton();
//        createFlowSteps.accessPhotoPermission();
        int repeat = 4;
        while (!createFlowScreen.isCameraButtonPresent() && repeat > 0) {
            createFlowScreen.scrollVerticalFromCenterToUpCreateFLowScreen();
            repeat--;
        }
        createFlowScreen.clickCameraButton();
    }


//    public void accessCameraPermission() {
////        if (cameraScreen.isCameraPermissionPresent()) {
//            cameraScreen.clickLetIsGoButton();
//            cameraScreen.clickPermissionAllowButton();
////        }
//    }
}
