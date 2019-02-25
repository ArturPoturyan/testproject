package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.Utils;

import static utils.CommonValues.APP_PACKAGE_NAME;


public class EditorScreen {


    private AppiumDriver driver;
    private Utils utils;


    public EditorScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);
    }


    //Buttons


    private By EDITOR_FUB_BUTTON = By.id(APP_PACKAGE_NAME + ":id/center_button_create_id");
    private By ARROW_BUTTON = By.id(APP_PACKAGE_NAME + ":id/arrow_down");
    private By FOLDER_NAME = By.id(APP_PACKAGE_NAME + ":id/folder_name");
    private By GRID_IMAGE_LIST_ITEM = By.id(APP_PACKAGE_NAME + ":id/grid_image");
    private By NEGATIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_negative");
    private By EFFECTS_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_effect");
    private By EFFECTS_CATEGORY_NAME = By.id(APP_PACKAGE_NAME + ":id/category_name");
    private By SET_SIZE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/dialog_ok_btn");
    private By ADAPTER_IMAGE_ID = By.id(APP_PACKAGE_NAME + ":id/adapter_image_id");
    private By APPLY_DONE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/button_done");
    private By EDITOR_NEXT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_share");
    private By UPLOAD_SHARE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/share_in_bottom");
    private By UPLOAD_DONE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_done");


    //Views
    private By CREATE_FLOW_CARD_TEXT = By.id(APP_PACKAGE_NAME + ":id/card_text");
    private By EDITOR_BOTTOM_PANEL = By.id(APP_PACKAGE_NAME + ":id/panel_bottom");
    private By SEEK_BAR = By.className("android.widget.SeekBar");
    private By ADAPTER_TEXT_ID = By.id(APP_PACKAGE_NAME + ":id/adapter_text_id");
    private By EFFECTS_THUMBS_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/effects_thumbs_recycler_view");


    public void clickEditorFubButton() {
        utils.clickIdButton(EDITOR_FUB_BUTTON);

    }

    public void clickUploadDoneButton() {
        utils.clickIdButton(UPLOAD_DONE_BUTTON);
    }

    public void clickUploadShareButton() {
        utils.clickIdButton(UPLOAD_SHARE_BUTTON);
    }

    public void clickEditorNextButton() {
        utils.clickIdButton(EDITOR_NEXT_BUTTON);

    }

    public void clickApplyDoneButton() {
        utils.clickIdButton(APPLY_DONE_BUTTON);
    }

    public void clickPastedArtisticEffect() {
        utils.clickElementByText(ADAPTER_TEXT_ID, "Pastel");
    }

    public void clickComicArtisticEffect() {
        utils.clickElementByText(ADAPTER_TEXT_ID, "Comic");
    }

    public void clickGouacheArtisticEffect() {
        utils.clickElementByText(ADAPTER_TEXT_ID, "Gouache");
    }

    public void clickOldPaperArtisticEffect() {

        utils.clickElementByText(ADAPTER_TEXT_ID, "Old Paper");
    }

    public void clickNeonArtisticEffect() {
        utils.clickElementByText(ADAPTER_TEXT_ID, "Neon");
    }


    public void clickMotionArtisticEffect() {
        utils.clickElementByText(ADAPTER_TEXT_ID, "Motion");
    }

    public void clickShearArtisticEffect() {
        utils.clickElementByText(ADAPTER_TEXT_ID, "Shear");
    }

    public void clickHalfToneDotsArtisticEffect() {
        utils.clickElementByText(ADAPTER_TEXT_ID, "Halftone Dots");
    }

    public void clickOilPaintingArtisticEffect() {
        utils.clickElementByText(ADAPTER_TEXT_ID, "OilPainting");

    }

    public void clickPolygonArtisticEffect() {
        utils.clickElementByText(ADAPTER_TEXT_ID, "Polygon");

    }

    public void clickPosterArtisticEffect() {
        utils.clickElementByText(ADAPTER_TEXT_ID, "Poster");
    }


    public boolean isOilPaintingEffectsNamePresent() {
        return utils.findElementByText(ADAPTER_TEXT_ID, "OilPainting");
    }

    public void clickArtisticEffectsCategory() {

        utils.clickElementByText(EFFECTS_CATEGORY_NAME, "ARTISTIC");
    }

    public boolean isArtisticButtonSelected() {
        return utils.isElementTextSelected(EFFECTS_CATEGORY_NAME, "ARTISTIC");
    }

    public void swipeSeekBarToRight() {
        utils.horizontalSwipeFromCenterToRight(SEEK_BAR, 0);
    }

    public void swipeArtisticCategoryToLeft() {
        utils.horizontalSwipeFromCenterToLeft(EFFECTS_THUMBS_RECYCLER_VIEW, 0);
    }

    public void clickBlurCategoryItem() {
        utils.clickByIndex(ADAPTER_IMAGE_ID, 1);
    }


    public void clickSetSizeButton() {
        utils.clickIdButton(SET_SIZE_BUTTON);
    }

    public boolean isChooseImageSizePopupPresent() {
        return utils.isElementPresent(SET_SIZE_BUTTON);
    }

    public void clickBlurEffectsCategory() {
        utils.clickElementByText(EFFECTS_CATEGORY_NAME, "BLUR");
    }

    public void clickEffectsCategoryButton() {

        utils.clickIdButton(EFFECTS_BUTTON);
    }

    public void clickGoldPopupSkipButton() {
        utils.clickIdButton(NEGATIVE_BUTTON);
    }

    public boolean isPicsArtGoldPopupPresent() {
        return utils.isElementPresent(NEGATIVE_BUTTON);
    }

    public void clickAllPhotoButton() {
        utils.clickByIndex(CREATE_FLOW_CARD_TEXT, 0);
    }

    public void clickArrowButton() {
        utils.clickIdButton(ARROW_BUTTON);

    }

    public void clickFreeTOEditButton() {
        utils.clickByIndex(FOLDER_NAME, 0);
    }

    public void clickOnPhoto() {
        utils.clickByIndex(GRID_IMAGE_LIST_ITEM, 4);
    }

    public boolean isEditorScreenPresent() {
        return utils.isElementPresent(EDITOR_BOTTOM_PANEL);
    }

    public boolean isEffectsCategoryPresent() {
        return utils.isElementPresent(EFFECTS_BUTTON);
    }

    public void swipeEditorPanelToLeft() {
        utils.horizontalSwipeFromCenterToLeft(EDITOR_BOTTOM_PANEL, 0);

    }
}
