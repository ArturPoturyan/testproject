package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;


public class EditorScreen implements CommonValues {


    private AppiumDriver driver;
    private Utils utils;


    public EditorScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);
    }


    //Buttons


    private By EFFECTS_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_effect");
    private By CATEGORY_NAME = By.id(APP_PACKAGE_NAME + ":id/category_name");
    private By APPLY_DONE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/button_done");
    private By EDITOR_NEXT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_share");
    private By CREATE_FLOW_PHOTOS_CATEGORY = By.id(APP_PACKAGE_NAME + ":id/image");
    private By DRAW_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_draw");
    private By OPEN_PICS_ART_DRAWING_BUTTON = By.id(APP_PACKAGE_NAME + ":id/open_picsart_drawing");
    private By DRAW_BRUSH_BUTTON = By.id(APP_PACKAGE_NAME + ":id/mode_draw");
    private By DRAWING_BRUSH_ITEM = By.id(APP_PACKAGE_NAME + ":id/drawing_brush_normal");
    private By OK_BUTTON = By.id(APP_PACKAGE_NAME + ":id/ok");
    private By UNDO_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_undo");
    private By POSITIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_positive");
    private By ADD_OBJECT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_add_objects");
    private By DRAWING_ADD_PHOTO_BUTTON = By.id(APP_PACKAGE_NAME + ":id/drawing_add_photoID");
    private By BTN_ACTION_DONE = By.id(APP_PACKAGE_NAME + ":id/btn_action_done");
    private By BUTTON_STICKER = By.id(APP_PACKAGE_NAME + ":id/btn_sticker");
    private By ITEM_IMAGE = By.id(APP_PACKAGE_NAME + ":id/item_image");
    private By STICKER_IMAGE_PARENT_LAYOUT = By.id(APP_PACKAGE_NAME + ":id/stickerImageParentLayout");
    private By CATEGORY_LIST = By.id(APP_PACKAGE_NAME + ":id/categories_list");
    private By DONE_BTN = By.id(APP_PACKAGE_NAME + ":id/btn_done");


    //Views
    private By EDITOR_BOTTOM_PANEL = By.id(APP_PACKAGE_NAME + ":id/panel_bottom");
    private By SEEK_BAR = By.className("android.widget.SeekBar");
    private By ADAPTER_TEXT_ID = By.id(APP_PACKAGE_NAME + ":id/adapter_text_id");
    private By DRAWING_LAYERS_CONTAINER = By.id(APP_PACKAGE_NAME + ":id/drawing_layers_container");
    private By EFFECTS_BOTTOM_PANEL = By.id(APP_PACKAGE_NAME + ":id/effects_category_list");
    private By CREATE_FLOW_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/recycler_view");
    private By EFFECT_THUMBS_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/effects_thumbs_recycler_view");
    private By SIMPLE_PROGRESS = By.id(APP_PACKAGE_NAME + ":id/simple_progress");
    private By STORAGE_PERMISSION_POPUP = By.id(APP_PACKAGE_NAME + ":id/pop_up_layout");
    private By PHOTO_ACCESS_PERMISSION_POPUP = By.id("com.android.packageinstaller:id/dialog_container");
    private By PERMISSION_ALLOW_BUTTON = By.id("com.android.packageinstaller:id/permission_allow_button");
    private By CREATE_FLOW_SCREEN = By.id(APP_PACKAGE_NAME + ":id/recycler_view");
    private By BACK_IMAGE_BUTTON = By.className("android.widget.ImageButton");
    private By SHOP_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_shop");
    private By FRAME_LAYOUT = By.className("android.widget.FrameLayout");



    public boolean isShopButtonPresent() {
        return utils.isElementPresent(SHOP_BUTTON);
    }

    public void clickShopButton() {
        utils.clickById(SHOP_BUTTON);
    }


    public void clickStickerApplyButton() {
        utils.clickById(DONE_BTN);
    }

    public boolean isStickerButtonPresent() {
        return utils.isElementPresent(BUTTON_STICKER);
    }

    public void clickRecentCategoryButton() {
        utils.clickElementByText(CATEGORY_NAME, "Recent");

    }

    public void clickStickerCategoryByIndex() {
        utils.clickElementOfListIndex(CATEGORY_LIST, FRAME_LAYOUT, 1);

//        driver.findElement(CATEGORY_LIST).findElements((FRAME_LAYOUT)).get(index).click();//todo harcnel vonc karelia aaranzdnacnel

//        utils.clickByIndex(CATEGORY_LIST, index);
    }


    public boolean isStickerCategoryListPresent() {
        return utils.isElementPresent(CATEGORY_LIST);
    }

    public boolean isRecentCategoryButtonPresent() {
        return utils.isElementByTextPresent(CATEGORY_NAME, "Recent");
    }

    public boolean isDiscoverCategoryButtonPresent() {
        return utils.isElementByTextPresent(CATEGORY_NAME, "Discover");
    }

    public void clickDiscoverCategoryButton() {
        utils.clickElementByText(CATEGORY_NAME, "Discover");

    }

    public void clickOnStickerFromRecentCategory() {
        utils.clickByIndex(ITEM_IMAGE, 0);
    }

    public void clickOnStickerFromDiscoverCategory() {
        utils.clickByIndex(STICKER_IMAGE_PARENT_LAYOUT, 1);
    }

    public void clickOnStickerInEditor() {
        if (isRecentCategoryButtonPresent()) {
            clickRecentCategoryButton();
            clickOnStickerFromRecentCategory();
        } else {//todo isDiscover not checking
            clickDiscoverCategoryButton();
            clickOnStickerFromDiscoverCategory();
        }
    }

    public void clickStickerButton() {
        utils.clickById(BUTTON_STICKER);

    }

    public void clickButtonActionDone() {
        utils.clickById(BTN_ACTION_DONE);
    }


    public boolean waitUntilProgressBarIsDisappear() {
        return utils.isElementPresent(SIMPLE_PROGRESS);
    }


    public void clickDrawingAddPhotoButton() {
        utils.clickById(DRAWING_ADD_PHOTO_BUTTON);
    }

    public void clickAddPhotoButton() {
        utils.clickById(ADD_OBJECT_BUTTON);
    }

    public boolean isStoragePermissionPopupPresent() {

        return utils.isElementPresent(STORAGE_PERMISSION_POPUP);
    }

    public void clickPermissionLetIsGoButton() {
        utils.clickById(POSITIVE_BUTTON);
    }

    public boolean isDevicePhotosPermissionPopupPresent() {
        return utils.isElementPresent(PHOTO_ACCESS_PERMISSION_POPUP);
    }

    public void clickPermissionAllowButton() {
        utils.clickById(PERMISSION_ALLOW_BUTTON);
    }

    public boolean isCreateFlowScreenPresent() {
        return utils.isElementPresent(CREATE_FLOW_SCREEN);
    }

    public void clickBackImageButton() {
        utils.clickById(BACK_IMAGE_BUTTON);
    }


    public void scrollVerticalCreateFLowScreen() {
        utils.scrollVerticalFromCenterToUp(CREATE_FLOW_RECYCLER_VIEW);

    }


    public boolean isNoneTextPresent() {
        return utils.isElementByTextPresent(ADAPTER_TEXT_ID, "None");
    }

    public void clickEffectByName(String name) {

        utils.clickElementByText(ADAPTER_TEXT_ID, name);

    }

    public void clickNoneText() {
        clickEffectByName("None");
    }



    public void clickUndoButton() {
        utils.clickById(UNDO_BUTTON);

    }

    public boolean isUndoButtonEnabled() {
        return utils.isElementEnabled(UNDO_BUTTON);
    }

    public void clickSetButton() {
        utils.clickById(OK_BUTTON);
    }


    public void clickDrawBrashMode() {
        utils.clickById(DRAW_BRUSH_BUTTON);

    }


    public boolean isBrushButtonPresent() {
        return utils.isElementPresent(DRAW_BRUSH_BUTTON);
    }

    public void clickPicsArtDrawingButton() {
        utils.clickById(OPEN_PICS_ART_DRAWING_BUTTON);
    }

    public void clickCreateFlowImage() {
        utils.clickByIndex(CREATE_FLOW_PHOTOS_CATEGORY, 2);
    }


    public void clickEditorNextButton() {
        utils.clickById(EDITOR_NEXT_BUTTON);

    }

    public void clickApplyDoneButton() {
        utils.clickById(APPLY_DONE_BUTTON);
    }

    public String[] ARTISTIC_CATEGORY = {"OilPainting", "Polygon", "Poster", "Halftone Dots", "Motion", "Shear",
            "Pastel", "Comic", "Gouache", "Old Paper", "Neon", "Watercolor", "Sketcher", "Contour", "Pencil", "Oil",
            "Cartoonizer", "Sketcher 1", "Sketcher 2", "Fattal 1", "Fattal 2"};


    public String[] BLUR_CATEGORY = {"Blur", "Lens Blur", "Smart Blur", "Motion blur", "Focal Zoom", "Radial Blur"};


    public void clickBlurEffect() {
        clickEffectByName("Blur");
    }


    public boolean isOilPaintingEffectsNamePresent() {
        return utils.isElementByTextPresent(ADAPTER_TEXT_ID, "OilPainting");
    }

    public boolean isBlurEffectNamePresent() {
        return utils.isElementByTextPresent(ADAPTER_TEXT_ID, "Blur");
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

        utils.clickElementByText(CATEGORY_NAME, "ARTISTIC");

    }

    public void chooseMagicCategoryByName() { //TODO Sergin harcnel sarqel mihat method click category by name

        if (!isMagicCategoryPresent()) {
            for (int i = 0; i < 3; i++) {
                utils.horizontalSwipeFromCenterToRight(EFFECTS_BOTTOM_PANEL);
            }
        }
        int repeat = 3;
        while (!isMagicCategoryPresent() && repeat > 0) {
            utils.horizontalSwipeFromCenterToLeft(EFFECTS_BOTTOM_PANEL, 0);
            repeat--;
        }

        utils.clickElementByText(CATEGORY_NAME, "MAGIC");

    }

    public boolean isArtisticCategoryPresent() {
        return utils.isElementByTextPresent(CATEGORY_NAME, "ARTISTIC");
    }

    public boolean isMagicCategoryPresent() {
        return utils.isElementByTextPresent(CATEGORY_NAME, "MAGIC");
    }

    public boolean isBlurCategoryPresent() {
        return utils.isElementByTextPresent(CATEGORY_NAME, "BLUR");
    }

    public void swipeSeekBarToRight() {
        utils.horizontalSwipeFromCenterToRight(SEEK_BAR, 0);
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

        utils.clickElementByText(CATEGORY_NAME, "BLUR");
    }

    public void clickEffectsButton() {

        utils.clickById(EFFECTS_BUTTON);
    }

    public void clickDrawButton() {
        utils.clickById(DRAW_BUTTON);
    }


    public boolean isEditorScreenPresent() {
        return utils.isElementPresent(EDITOR_BOTTOM_PANEL);
    }

    public boolean isEffectsButtonPresent() {
        return utils.isElementPresent(EFFECTS_BUTTON);
    }

    public boolean isDrawButtonPresent() {
        return utils.isElementPresent(DRAW_BUTTON);
    }

    public void swipeEditorPanelToLeft() {
        utils.horizontalSwipeFromCenterToLeft(EDITOR_BOTTOM_PANEL);

    }

    public void swipeEditorPanelToRight() {
        utils.horizontalSwipeFromCenterToRight(EDITOR_BOTTOM_PANEL);
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
