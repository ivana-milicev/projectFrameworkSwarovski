package appTests;

import org.junit.Assert;
import org.junit.Test;
import pages.BasePage;
import pages.HomePage;
import pages.ResultsPage;
import pages.SearchPage;

import java.time.Duration;

public class SearchTest extends BaseTest {

//    Locators:

    BasePage basePage = new BasePage(driver, Duration.ofSeconds(10));
    HomePage homePage = new HomePage(driver, Duration.ofSeconds(10));
    SearchPage searchPage = new SearchPage(driver, Duration.ofSeconds(10));
    ResultsPage resultsPage = new ResultsPage(driver, Duration.ofSeconds(10));

//    Tests:


    @Test
    public void searchTest() {
        homePage.clickOnSearchButton();
        searchPage.searchAction("swan earring");
        Assert.assertTrue(searchPage.searchResultsPageCheck().contains("swan"));
    }
}
