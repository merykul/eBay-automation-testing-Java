package runners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import utils.ConfigProperties;
import utils.TestNgListener;

import java.time.Duration;

@Listeners(TestNgListener.class)
public class BaseTestRunner {
    protected WebDriver driver;
    protected static final ConfigProperties configProperties = new ConfigProperties();

    @BeforeSuite
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public void setDriver(ITestContext context) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        context.setAttribute("myDriver", driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(configProperties.getBaseWebUrl());
    }

    @AfterSuite
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}
