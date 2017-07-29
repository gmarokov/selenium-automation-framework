package pages;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Browser;

public class HomePageTest extends TestBase{

    @Test
    public void testH1Existing() throws InterruptedException {
        Assert.assertTrue(Browser.getTitle() != null);
    }

    @Test
    public void test2() throws InterruptedException {
        Assert.assertTrue(true);
    }
}
