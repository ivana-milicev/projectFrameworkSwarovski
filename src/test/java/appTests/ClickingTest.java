package appTests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ResultsPage;

import java.time.Duration;

public class ClickingTest extends BaseTest {

//    Locators:

    HomePage homePage = new HomePage(driver, Duration.ofSeconds(20));
    ResultsPage resultsPage = new ResultsPage(driver, Duration.ofSeconds(20));

//    Tests:

    @Test
    public void clickingTest() {
        homePage.clickOnHamburgerMenu();
        homePage.clickOnJewelryCategory();
        homePage.clickOnEarringsCategory();
        homePage.clickOnstudEarringsCategory();

        String headingText = resultsPage.resultPageHeadingCheck();
        System.out.println("Result heading text: " + headingText);

        Assert.assertTrue("Result heading should contain 'Result'", headingText.contains("Result"));
    }

}