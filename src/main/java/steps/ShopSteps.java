package steps;

import io.appium.java_client.AppiumDriver;
import screens.ShopScreen;

public class ShopSteps {
    private AppiumDriver driver;
    private ShopScreen shopScreen;

    public ShopSteps(AppiumDriver driver) {
        this.driver = driver;
        shopScreen = new ShopScreen(driver);

    }


    public void skipGoldPopup() {
        if (shopScreen.isPicsArtGoldPopupPresent()) {
            shopScreen.clickGoldPopupSkipButton();
        }
    }
    public void skipGoldOfferScreen() {
        if (shopScreen.isSubscriptionOfferScreenPresent()) {
            shopScreen.clickXButtonInOfferScreen();
        }
    }
    public void skipContactUsScreen(){
        if (shopScreen.isContactUsScreenPresent()){
            shopScreen.clickXButtonInContactUsScreen();
        }
    }
}
