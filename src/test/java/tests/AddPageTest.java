package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddPage;
import pages.HomePage;

import static io.qameta.allure.Allure.step;

public class AddPageTest extends BaseTest{
    HomePage homePage = new HomePage();
    AddPage addPage = new AddPage();

    @Test
    public void TestAdd(){
        step("Click Add and Remove Page");
        homePage.clickaddandRemovelink();
        step("Check Add and Remove Page is Displayed");
        Assert.assertTrue(addPage.isAddPageDisplayed(), "Add Page is not displayed");
        step("Click Add element");
        addPage.clickElementBtn();
        step("Click Remove Element");
        addPage.clickDeleteElement();
    }
}
