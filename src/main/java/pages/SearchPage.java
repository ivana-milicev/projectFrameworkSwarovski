package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SearchPage extends BasePage {

//    Locators:

    private By searchInputFieldLocator = By.id("swa-search-layer-input");
    private By searchResultsPageLocator = By.className("//*[@class=\"swa-plp-top-teaser-content-title-small\"]");

//    Constructor:

    public SearchPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

//    Actions:

    public void searchAction (String inputText) {
        wait.until(ExpectedConditions.elementToBeClickable(searchInputFieldLocator)).sendKeys(inputText);
        driver.findElement(searchInputFieldLocator).submit();
    }

    public String searchResultsPageCheck () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchResultsPageLocator));
        return driver.findElement(searchResultsPageLocator).getText();
    }






}
