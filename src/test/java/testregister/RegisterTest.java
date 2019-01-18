package testregister;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import teststeps.RegisterSteps;
import utils.DesiredCapsManager;


public class RegisterTest {


    private RegisterSteps registerSteps;

    @BeforeClass
    public void setup() {
        DesiredCapsManager.setUp();
        registerSteps = new RegisterSteps();

    }

    @Test
    public void verifyFunctionalityOfRegister() throws InterruptedException {
        registerSteps.register();
    }
}
