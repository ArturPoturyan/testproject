package utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.ServerSocket;

public class AppiumServerJava {
    private AppiumDriverLocalService service;
    private AppiumServiceBuilder builder;
    private DesiredCapabilities cap;


    private void startServer() {
        cap = new DesiredCapabilities();
        cap.setCapability("noReset", "false");
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("0.0.0.0");
        builder.usingPort(4723);
        builder.withCapabilities(cap);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
        service = AppiumDriverLocalService.buildService(builder);
        service.start();

    }

    public void stopService() {
        service.stop();

    }

    public boolean checkIfServerIsRunnning(int port) {
        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);
            serverSocket.close();


        } catch (IOException e) {
            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }

    public static void main(String[] args) {
        AppiumServerJava appiumServer = new AppiumServerJava();
        int port = 4723;
        if (!appiumServer.checkIfServerIsRunnning(port)) {
            appiumServer.startServer();
            appiumServer.stopService();
        } else {
            System.out.println("Appium Server already running on Port - " + port);
        }
    }
}
