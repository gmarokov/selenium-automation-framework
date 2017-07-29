package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Browser;


public class Pages
{
    /// TODO: Get page generic
    //private static T GetPage(Class<T> pageInstance)
    //{
    //      return pageInstance.newInstance();
    //}

    public static HomePage homePage()
    {
        return PageFactory.initElements(Browser.Driver(), HomePage.class);
    }
}
