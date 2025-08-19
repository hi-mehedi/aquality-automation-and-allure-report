package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class JavaScriptScrollPage extends Form {
    public JavaScriptScrollPage() {
        super(By.xpath(""), "");
    }

    private List<ILabel> getResultElements() {
        return AqualityServices.getElementFactory().findElements(By.className("jscroll-added"), ElementType.LABEL);
    }

    public void getResult(int index) {
        List<ILabel> results = getResultElements();
        if (!results.isEmpty()) {
            results.get(index).state().waitForDisplayed();
            results.get(index).getText();
        } else {
            throw new RuntimeException("No search results found to get Text.");
        }
    }

    public void getResultByIndex(int index) throws InterruptedException {
        while (true) {
            List<ILabel> results = getResultElements();

            if (results.size() > index) {
                results.get(index).state().waitForDisplayed();
                Thread.sleep(1000);
                results.get(index).getText();
                break;
            } else {
                JavascriptExecutor js = (JavascriptExecutor) AqualityServices.getBrowser().getDriver();
                js.executeScript("window.scrollBy(0, 500);");

                AqualityServices.getBrowser().waitForPageToLoad();
            }
        }
    }
}
