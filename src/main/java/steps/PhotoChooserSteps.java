package steps;

import io.appium.java_client.AppiumDriver;
import screens.PhotoChooserScreen;

public class PhotoChooserSteps {
    private AppiumDriver driver;
    private PhotoChooserScreen photoChooserScreen;

    public PhotoChooserSteps(AppiumDriver driver) {
        this.driver = driver;
        photoChooserScreen = new PhotoChooserScreen(driver);
    }

    public void skipChooseImageSize() {
        if (photoChooserScreen.isChooseImageSizePopupPresent()) {
            photoChooserScreen.clickSetSizeButton();

        }
    }
}
