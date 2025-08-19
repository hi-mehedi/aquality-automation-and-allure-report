package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class AddPage extends Form {
    private final IButton elementButton = getElementFactory().getButton(By.xpath("//button[@onclick='addElement()']"), "Add element Button");
    private final IButton deleteButton = getElementFactory().getButton(By.xpath("//button[@onclick='deleteElement()']"), "Delete Button");
    public AddPage (){
        super(By.xpath("//button[@onclick='addElement()']"), "Add Page");
    }

    public boolean isAddPageDisplayed(){
        return state().waitForDisplayed();
    }

    public void clickElementBtn(){
        elementButton.click();
    }

    public void clickDeleteElement(){
        deleteButton.click();
    }
}
