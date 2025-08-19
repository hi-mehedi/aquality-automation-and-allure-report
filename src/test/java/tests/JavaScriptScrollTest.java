package tests;

import aquality.selenium.browser.AqualityServices;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JavaScriptScrollPage;

import static io.qameta.allure.Allure.step;

public class JavaScriptScrollTest extends BaseTest{
    HomePage homePage = new HomePage();
    JavaScriptScrollPage javaScriptScrollPage = new JavaScriptScrollPage();

    @Test
    public void Test() throws InterruptedException {
        step("Click unlimited scroll page");
        homePage.clickScrollLink();
        step("Get text in first index");
        javaScriptScrollPage.getResult(0);
        step("Get text is seven index");
        javaScriptScrollPage.getResultByIndex(7);
    }
}
