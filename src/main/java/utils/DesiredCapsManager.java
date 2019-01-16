package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DesiredCapsManager {
    protected AndroidDriver<MobileElement> driver;

    @BeforeSuite
    public void init() {
        setUp();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    //todo nenc anel vor server sarqi u run lini

    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        String apk = "/Users/arturpoturyan/Downloads/picsart-11.4-unsigned-15-signed.apk";//todo nenc grel vor sagh komperi vra ashxati
        capabilities.setCapability(MobileCapabilityType.UDID, "b15ffa8f");
        capabilities.setCapability("deviceName", "A7");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0.1");
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
        }

    }


    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        driver.quit();//todo kardal inchna quit anum u sergin asel

    }
}