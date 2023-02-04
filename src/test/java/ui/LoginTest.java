package ui;

import io.qameta.allure.Description;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import runners.BaseTestRunner;

public class LoginTest extends BaseTestRunner {
    @BeforeClass
    public void setUp(ITestContext context) {
        setDriver(context);
    }

    @BeforeMethod
    public void goToHomePage() {
        driver.get(configProperties.getBaseWebUrl());
    }

    @Test
    @Description("Test if user can login with valid data")
    public void registrationNewAccount() {

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
