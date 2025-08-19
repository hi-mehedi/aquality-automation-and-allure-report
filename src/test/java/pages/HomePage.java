package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class HomePage extends Form {
    private final IButton addAndRemove = getElementFactory().getButton(By.xpath("//a[@href='/add_remove_elements/']"), "add and remove");
    private final IButton forgotLink = getElementFactory().getButton(By.xpath("//a[@href='/forgot_password']"), "Forgot Button Link");
    private final IButton alertLink = getElementFactory().getButton(By.xpath("//a[@href='/javascript_alerts']"), "Alert Link");
    private final IButton iframeLink = getElementFactory().getButton(By.xpath("//a[@href='/frames']"), "I frame Link");
    private final IButton scrollLink = getElementFactory().getButton(By.xpath("//a[@href='/infinite_scroll']"), "Scroll Link");

    public HomePage(){
        super(By.id("content"), "Home Page");
    }

    public boolean isHomePageDisplayed(){
        return state().waitForDisplayed();
    }
    public  void clickaddandRemovelink(){
        addAndRemove.click();
    }

    public void clickForgotBtn(){
        forgotLink.click();
    }

    public void clickAlertLink(){
        alertLink.click();
    }

    public void clickIframeLink(){
        iframeLink.click();
    }

    public void clickScrollLink(){
        scrollLink.click();
    }
}
