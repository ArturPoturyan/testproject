package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class DesiredCapsManager {
    protected AndroidDriver<MobileElement> driver;

    public DesiredCapsManager() {
        setUp();
    }

    @BeforeClass
    public void setUp() {

        String apk = "/Users/arturpoturyan/Downloads/11.3_ON.apk";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.UDID, "a8e4926b");
        capabilities.setCapability("deviceName", "S4");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.0.1");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability("app", apk);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
                "com.picsart.studio");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
                "com.socialin.android.photo.picsinphoto.MainPagerActivity");

        try {
            driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            e.printStackTrace();
        }

    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }
}