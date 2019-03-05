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


    private By FUB_BUTTON = By.id(APP_PACKAGE_NAME + ":id/center_button_create_id");
    private By ARROW_BUTTON = By.id(APP_PACKAGE_NAME + ":id/arrow_down");
    private By FOLDER_NAME = By.id(APP_PACKAGE_NAME + ":id/folder_name");
    private By GRID_IMAGE_ITEM = By.id(APP_PACKAGE_NAME + ":id/grid_image");
    private By NEGATIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_negative");
    private By EFFECTS_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_effect");
    private By EFFECTS_CATEGORY_NAME = By.id(APP_PACKAGE_NAME + ":id/category_name");
    private By SET_SIZE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/dialog_ok_btn");
    private By APPLY_DONE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/button_done");
    private By EDITOR_NEXT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_share");
    private By UPLOAD_SHARE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/share_in_bottom");
    private By CREATE_FLOW_PHOTOS_CATEGORY = By.id(APP_PACKAGE_NAME + ":id/image");
    private By DRAW_CATEGORY_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_draw");
    private By PICS_ART_DRAWING_BUTTON = By.id(APP_PACKAGE_NAME + ":id/open_picsart_drawing");
    private By DRAW_BRUSH_BUTTON = By.id(APP_PACKAGE_NAME + ":id/mode_draw");
    private By DRAWING_BRUSH_ITEM = By.id(APP_PACKAGE_NAME + ":id/drawing_brush_normal");
    private By OK_BUTTON = By.id(APP_PACKAGE_NAME + ":id/ok");
    private By UNDO_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_undo");
    private By CREATE_NEW = By.id(APP_PACKAGE_NAME + ":id/description");
    private By SHOP_SUBSCRIPTION_FRAGMENT = By.id(APP_PACKAGE_NAME + ":id/shop_subscription_fragment_continer");
    private By SUBSCRIPTION_OFFER_CLOSE_BUTTON = By.className("android.widget.ImageButton");


    //Views
    private By CREATE_FLOW_CARD_TEXT = By.id(APP_PACKAGE_NAME + ":id/card_text");
    private By EDITOR_BOTTOM_PANEL = By.id(APP_PACKAGE_NAME + ":id/panel_bottom");
    private By SEEK_BAR = By.className("android.widget.SeekBar");
    private By ADAPTER_TEXT_ID = By.id(APP_PACKAGE_NAME + ":id/adapter_text_id");
    private By DRAWING_LAYERS_CONTAINER = By.id(APP_PACKAGE_NAME + ":id/drawing_layers_container");
    private By EFFECTS_BOTTOM_PANEL = By.id(APP_PACKAGE_NAME + ":id/effects_category_list");
    private By CREATE_FLOW_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/recycler_view");
    private By EFFECT_THUMBS_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/effects_thumbs_recycler_view");
    private By SIMPLE_PROGGRES = By.id(APP_PACKAGE_NAME + ":id/simple_progress");

    public boolean isSimpleProgressPresent() {
        return utils.isElementPresent(SIMPLE_PROGGRES);
    }

    public void clickFubButton() {//todo rename
        utils.clickIdButton(FUB_BUTTON);

    }

    public void scrollVerticalCreateFLowScreen() {
        utils.scrollVerticalFromCenterToUp(CREATE_FLOW_RECYCLER_VIEW);

    }


    public void clickCreateNewButton() {
        utils.clickElementByText(CREATE_NEW, "Create New");

    }

    public boolean isCreateNewButtonPresent() {
        return utils.findElementByText(CREATE_NEW, "Create New");
    }


    public boolean isNoneTextPresent() {
        return utils.findElementByText(ADAPTER_TEXT_ID, "None");
    }

    public void clickEffectByName(String name) {

        utils.clickElementByText(ADAPTER_TEXT_ID, name);

    }

    public void clickNoneText() {
        clickEffectByName("None");
    }


    public boolean isUploadShareButtonPresent() {
        return utils.isElementPresent(UPLOAD_SHARE_BUTTON);
    }

    public void clickUndoButton() {
        utils.clickIdButton(UNDO_BUTTON);

    }

    public boolean isUndoButtonEnabled() {
        return utils.isElementEnabled(UNDO_BUTTON);
    }

    public void clickSetButton() {
        utils.clickIdButton(OK_BUTTON);
    }


    public void clickDrawBrashMode() {
        utils.clickIdButton(DRAW_BRUSH_BUTTON);

    }


    public boolean isBrushButtonPresent() {
        return utils.isElementPresent(DRAW_BRUSH_BUTTON);
    }

    public void clickPicsArtDrawingButton() {
        utils.clickIdButton(PICS_ART_DRAWING_BUTTON);
    }

    public void clickCreateFlowImage() {
        utils.clickByIndex(CREATE_FLOW_PHOTOS_CATEGORY, 2);
    }


    public void clickEditorNextButton() {
        utils.clickIdButton(EDITOR_NEXT_BUTTON);

    }

    public void clickApplyDoneButton() {
        utils.clickIdButton(APPLY_DONE_BUTTON);
    }

    public String[] ARTISTIC_CATEGORY = {"OilPainting", "Polygon", "Poster", "Halftone Dots", "Motion", "Shear",
            "Pastel", "Comic", "Gouache", "Old Paper", "Neon", "Watercolor", "Sketcher", "Contour", "Pencil", "Oil",
            "Cartoonizer", "Sketcher 1", "Sketcher 2", "Fattal 1", "Fattal 2"};


    public String[] BLUR_CATEGORY = {"Blur", "Lens Blur", "Smart Blur", "Motion blur", "Focal Zoom", "Radial Blur"};


    public void clickBlurEffect() {
        clickEffectByName("Blur");
    }


    public boolean isOilPaintingEffectsNamePresent() {
        return utils.findElementByText(ADAPTER_TEXT_ID, "OilPainting");
    }

    public boolean isBlurEffectNamePresent() {
        return utils.findElementByText(ADAPTER_TEXT_ID, "Blur");
    }


    public void chooseArtisticCategoryByName() {

        if (!isArtisticCategoryPresent()) {
            for (int i = 0; i < 3; i++) {
                utils.horizontalSwipeFromCenterToRight(EFFECTS_BOTTOM_PANEL);
            }
        }
        int repeat = 3;
        while (!isArtisticCategoryPresent() && repeat > 0) {
            utils.horizontalSwipeFromCenterToLeft(EFFECTS_BOTTOM_PANEL, 0);
            repeat--;
        }

        utils.clickElementByText(EFFECTS_CATEGORY_NAME, "ARTISTIC");

    }

    public boolean isArtisticCategoryPresent() {
        return utils.findElementByText(EFFECTS_CATEGORY_NAME, "ARTISTIC");
    }

    public boolean isBlurCategoryPresent() {
        return utils.findElementByText(EFFECTS_CATEGORY_NAME, "BLUR");
    }

    public void swipeSeekBarToRight() {
        utils.horizontalSwipeFromCenterToRight(SEEK_BAR, 0);
    }


    public void clickSetSizeButton() {
        utils.clickIdButton(SET_SIZE_BUTTON);
    }

    public boolean isChooseImageSizePopupPresent() {
        return utils.isElementPresent(SET_SIZE_BUTTON);
    }


    public void chooseBlurCategoryByName() {

        if (!isBlurCategoryPresent()) {
            for (int i = 0; i < 3; i++) {
                utils.horizontalSwipeFromCenterToRight(EFFECTS_BOTTOM_PANEL);
            }
        }
        int repeat = 3;
        while (!isBlurCategoryPresent() && repeat > 0) {
            utils.horizontalSwipeFromCenterToLeft(EFFECTS_BOTTOM_PANEL);
            repeat--;
        }

        utils.clickElementByText(EFFECTS_CATEGORY_NAME, "BLUR");
    }

    public void clickEffectsButton() {

        utils.clickIdButton(EFFECTS_BUTTON);
    }

    public void clickDrawCategoryButton() {
        utils.clickIdButton(DRAW_CATEGORY_BUTTON);
    }

    public void clickGoldPopupSkipButton() {
        utils.clickIdButton(NEGATIVE_BUTTON);
    }

    public boolean isPicsArtGoldPopupPresent() {
        return utils.isElementPresent(NEGATIVE_BUTTON);
    }

    public boolean isSubscriptionOfferScreenPresent() {
        return utils.isElementPresent(SHOP_SUBSCRIPTION_FRAGMENT);
    }


    public void clickXButtonInOfferScreen() {

        utils.clickIdButton(SUBSCRIPTION_OFFER_CLOSE_BUTTON);
    }

    public void clickAllPhotoButton() {
        utils.clickByIndex(CREATE_FLOW_CARD_TEXT, 0);
    }

    public void clickArrowButton() {
        utils.clickIdButton(ARROW_BUTTON);
    }

    public void clickFreeToEditButton() {
        utils.clickByIndex(FOLDER_NAME, 0);
    }

    public void clickOnPhoto() {
        utils.clickByIndex(GRID_IMAGE_ITEM, 4);
    }

    public boolean isEditorScreenPresent() {//todo rename
        return utils.isElementPresent(EDITOR_BOTTOM_PANEL);
    }

    public boolean isEffectsButtonPresent() {
        return utils.isElementPresent(EFFECTS_BUTTON);
    }

    public boolean isDrawCategoryPresent() {
        return utils.isElementPresent(DRAW_CATEGORY_BUTTON);
    }

    public void swipeEditorPanelToLeft() {
        utils.horizontalSwipeFromCenterToLeft(EDITOR_BOTTOM_PANEL);

    }

    public void swipeEffectsThumbsToRight() {
        utils.horizontalSwipeFromCenterToRight(EFFECT_THUMBS_RECYCLER_VIEW, 0);
    }

    public void clickDrawingBrushItem(int index) {
        utils.clickByIndex(DRAWING_BRUSH_ITEM, index);
    }


    public void drawWithBrush() {
        utils.horizontalSwipeFromCenterToLeft(DRAWING_LAYERS_CONTAINER);
    }
}
