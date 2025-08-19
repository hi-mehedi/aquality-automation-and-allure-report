package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ForgotPage extends Form {
    private final ITextBox textField = getElementFactory().getTextBox(By.id("email"), "Input email");
    private final IButton forgotBtn = getElementFactory().getButton(By.id("form_submit"), "Click forgot Button");
    public  ForgotPage(){
        super(By.id("form_submit"), "Forgot Page");
    }

    public boolean isForgotPageDisplayed(){
        return state().waitForDisplayed();
    }

    public void inputTextField(String text){
        textField.clearAndType(text);
    }

    public void clickForgotBtn(){
        forgotBtn.click();
    }
}
