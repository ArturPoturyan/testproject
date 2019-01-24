package testregister;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.RegisterSteps;
import utils.DesiredCapsManager;


public class RegisterTest extends DesiredCapsManager {


    private RegisterSteps registerSteps;

    @BeforeClass
    public void setup() {
        registerSteps = new RegisterSteps(driver);

    }

    @Test
    public void verifyFunctionalityOfRegister() throws InterruptedException {
        registerSteps.register();

    }
}
