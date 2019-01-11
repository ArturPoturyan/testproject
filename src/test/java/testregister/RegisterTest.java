package testregister;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import teststeps.RegisterSteps;
import utils.DesiredCapsManager;

public class RegisterTest extends DesiredCapsManager {
//    RegisterSteps registerSteps = new RegisterSteps();


    RegisterSteps registerSteps;

    @BeforeMethod
    public void setup() {
        registerSteps = new RegisterSteps();

    }

    @Test
    public void verifyFunctionalityOfRegister() throws InterruptedException {
        registerSteps.register();
        registerSteps.register();
        registerSteps.register();
        registerSteps.register();
    }
}
