package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends Form {
    private final IButton alertBtn = getElementFactory().getButton(By.xpath("//button[@onclick='jsPrompt()']"),
            "Click Alert Button");
    private final IButton secondAlertBtn = getElementFactory().getButton(By.xpath("//button[@onclick='jsConfirm()']"),
            "Click Second Alert Button");

    public JavaScriptAlertsPage(){
        super(By.id("content"), "JavaScript Alert Page");
    }

    public boolean isJavaScriptAlertPageDisplayed(){
        return state().waitForDisplayed();
    }

    public void  clickAlertBtn(){
        alertBtn.click();
    }

    public boolean isSecondAlertBtnEnabled(){
        return secondAlertBtn.state().isEnabled();
    }

    public void clickSecondAlert(){
        secondAlertBtn.click();
    }
}
