package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DesiredCapsManager {
    public static AndroidDriver<MobileElement> driver;
    private static AppiumDriverLocalService service;


    //todo nenc anel vor server sarqi u run lini

    @BeforeSuite
    public static void setUp() {
        DesiredCapabilities desiredCapabilities = initDesiredCapability();
        String appiumServiceUrl = initService();
        initDriver(appiumServiceUrl, desiredCapabilities);
    }

    private static void initDriver(String appiumServiceUrl, DesiredCapabilities desiredCapabilities) {
        try {
            URL myURLObject = new URL(appiumServiceUrl);
            driver = new AndroidDriver<>(myURLObject, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    private static DesiredCapabilities initDesiredCapability() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        File classPathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classPathRoot, "sada");
//        File app = new File(appDir,"asdasd");
//        capabilities.setCapability("app", app.getAbsolutePath());

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

        return capabilities;
    }

    private static String initService() {
        service = AppiumDriverLocalService.buildDefaultService();
        if (service == null) {
            throw new AppiumServerHasNotBeenStartedLocallyException("An appium server node is not started!");
        }
        service.start();
        String appiumServiceUrl = service.getUrl().toString();
        System.out.println("Appium Service Address : - " + appiumServiceUrl);

        return appiumServiceUrl;
    }

    @AfterSuite //todo kardal inchna quit anum u sergin asel
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        if (service != null) {
            service.stop();
        }
    }
}