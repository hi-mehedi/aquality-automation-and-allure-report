package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPage;
import pages.HomePage;

import static io.qameta.allure.Allure.step;

public class ForgotPageTest extends BaseTest{
    public static  final  String email = "mehedihasan@gmail.com";
    HomePage homePage = new HomePage();
    ForgotPage forgotPage = new ForgotPage();

    @Test
    public void  Test(){
        step("Click Forgot Page Link");
        homePage.clickForgotBtn();
        step("Forgot page Displayed");
        Assert.assertTrue(forgotPage.isForgotPageDisplayed(), "Forgot page is not displayed");
        step("Input email");
        forgotPage.inputTextField(email);
        step("Click forgot Button");
        forgotPage.clickForgotBtn();
    }
}
