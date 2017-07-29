package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage {

    private final String H1_TAG = "h1";

    @FindBy(how = How.TAG_NAME, using = H1_TAG)
    @CacheLookup
    private WebElement h1Element;

    public HomePage(){ }

    public String getH1() {
        return h1Element.getText();
    }
}
