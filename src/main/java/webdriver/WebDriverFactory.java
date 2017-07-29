package webdriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utilities.Browser;

/*
 * Factory to instantiate a WebDriver object. It returns an instance of the driver (local invocation).
 */
public class WebDriverFactory {

    /* Browsers constants */
    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";
    public static final String INTERNET_EXPLORER = "ie";
    public static final String SAFARI = "safari";

    private WebDriverFactory(){}

    /*
     * Factory method to return a WebDriver instance given the browser to hit
     *
     * @param browser : Browser representing the local browser to hit
     *
     * @return WebDriver instance
     */
    public static WebDriver getInstance(String browserName) {

        WebDriver webDriver = null;

        if (CHROME.equals(browserName)) {
            ChromeDriverManager.getInstance().setup();
            webDriver = new ChromeDriver();
        }
        else if (FIREFOX.equals(browserName)) {
            FirefoxDriverManager.getInstance().setup();
            webDriver = new FirefoxDriver();

        }
        else if (INTERNET_EXPLORER.equals(browserName)) {
            InternetExplorerDriverManager.getInstance().setup();
            webDriver = new InternetExplorerDriver();
        }
        else {
            throw new IllegalArgumentException("Blah! Unsupported browser!");
        }

        return webDriver;
    }
}
