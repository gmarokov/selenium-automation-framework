package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{

    HomePage homePage;

    @Parameters({ "path" })
    @BeforeClass
    public void testInit(@Optional("firefox") String path) {
        // Load the page in the browser
        webDriver.get(websiteUrl + path);
        //Get Login Page instance with elements.
        homePage = PageFactory.initElements(webDriver, HomePage.class);
    }


    @Test
    public void testH1Existing() throws InterruptedException {
        Assert.assertTrue(homePage.getTitle() != null);
    }

    @Test
    public void test2() throws InterruptedException {
        Assert.assertTrue(true);
    }

}
