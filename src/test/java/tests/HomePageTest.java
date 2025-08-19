package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import static io.qameta.allure.Allure.step;

public class HomePageTest extends BaseTest{
    HomePage homePage = new HomePage();

    @Test
    public void Test(){
        step("Home Page Displayed");
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Home Page is not displayed");
    }
}
