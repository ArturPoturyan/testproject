package steps;

import io.appium.java_client.AppiumDriver;
import screens.ShopScreen;

public class ShopSteps {
    private ShopScreen shopScreen;

    public ShopSteps(AppiumDriver driver) {
        shopScreen = new ShopScreen(driver);

    }


    public void skipSubscriptionPopup() {
        if (shopScreen.isPicsArtGoldPopupPresent()) {
            shopScreen.clickGoldPopupSkipButton();
        }
        if (shopScreen.isSubscriptionOfferScreenPresent()) {
            shopScreen.clickOfferScreenXButton();
        }
    }
    public void skipContactUsScreen(){
        if (shopScreen.isContactUsScreenPresent()){
            shopScreen.clickXButtonInContactUsScreen();
        }
    }
}
