package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElement;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class IFramePage extends Form {
    private final IButton iframeLink1 = getElementFactory().getButton(By.xpath("//a[@href='/iframe']"), "Click Frame Link");
    private final ITextBox textBody = getElementFactory().getTextBox(By.id("tinymce"), "Get Text");
    private final IElement iframeGet = getElementFactory().getLabel(By.id("mce_0_ifr"),"I frame");

    public IFramePage(){
        super(By.xpath("//a[@href='/iframe']"), "I Frame Page");
    }

    public boolean isIframePageDisplayed(){
        return state().waitForDisplayed();
    }

    public void clickFrameLink(){
        iframeLink1.click();
    }

    public void switchIframes(){
        AqualityServices.getBrowser().getDriver().switchTo().frame(iframeGet.getElement());
    }

    public String getText(){
        return textBody.getText();
    }
}
