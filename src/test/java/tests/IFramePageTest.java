package tests;

import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.IFramePage;

import static io.qameta.allure.Allure.step;

public class IFramePageTest extends BaseTest{
    public static final String text = "Your content goes here.";
    HomePage homePage = new HomePage();
    IFramePage iFramePage = new IFramePage();

    @Test
    public void Test(){
        step("Click Iframe Page Link");
        homePage.clickIframeLink();
        step("Iframe page displayed");
        Assert.assertTrue(iFramePage.isIframePageDisplayed(), "Page is not displayed");
        step("Click i frame Link");
        iFramePage.clickFrameLink();
        step("Switch to iframe");
        iFramePage.switchIframes();
        step("Get text from Iframe page");
        iFramePage.getText();
        step("Text is same");
        Assert.assertEquals(iFramePage.getText(),text , "Text is not Same");
        step("Switch to default content");
        AqualityServices.getBrowser().getDriver().switchTo().defaultContent();
    }
}
