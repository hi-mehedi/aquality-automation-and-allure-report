package tests;

import aquality.selenium.browser.AqualityServices;
import utils.EnvDataReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public abstract class BaseTest {

    @BeforeMethod
    public void setup() {
        step("Browser maximize");
        getBrowser().maximize();
        step("Get Link");
        getBrowser().goTo(EnvDataReader.getEnvData().getHost());
    }

    @AfterMethod
    public void teardown() {
        step("Close Browser");
        if (AqualityServices.isBrowserStarted()) {
            getBrowser().quit();
        }
    }
}
