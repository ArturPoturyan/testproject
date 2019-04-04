package steps;

import io.appium.java_client.AppiumDriver;
import screens.PhotoChooserScreen;

public class PhotoChooserSteps {
    private PhotoChooserScreen photoChooserScreen;

    public PhotoChooserSteps(AppiumDriver driver) {
        photoChooserScreen = new PhotoChooserScreen(driver);
    }

    public void skipChooseImageSize() {
        if (photoChooserScreen.isChooseImageSizePopupPresent()) {
            photoChooserScreen.clickSetSizeButton();

        }
    }
}
