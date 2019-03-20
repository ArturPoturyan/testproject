package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class ExploreScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public ExploreScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }

    //Buttons


    private By FUB_BUTTON = By.id(APP_PACKAGE_NAME + ":id/center_button_create_id");


    //Views
    public void clickFubButton() {//todo rename
        utils.clickById(FUB_BUTTON);

    }

}
