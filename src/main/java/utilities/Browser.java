package utilities;

import org.openqa.selenium.WebDriver;
import webdriver.WebDriverFactory;

import java.util.concurrent.TimeUnit;

/*
 * Bean representing a browser. It contains name, version and platform fields.
 */
public class Browser {

    private static String baseUrl = PropertyLoader.loadProperty("site.url");
    private static String BrowserName = PropertyLoader.loadProperty("browser.name");
    private static String BrowserVersion = PropertyLoader.loadProperty("browser.version");
    private static WebDriver webDriver;

    public static void Initialize()
    {
        webDriver = WebDriverFactory.getInstance(BrowserName);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goTo("");
    }

    public static String getTitle()
    {
        return webDriver.getTitle();
    }

    public static WebDriver Driver()
    {
        return webDriver;
    }

    public static void goTo(String url)
    {
        webDriver.get(baseUrl + url);
    }

    public static void close()
    {
        webDriver.close();
    }
}
