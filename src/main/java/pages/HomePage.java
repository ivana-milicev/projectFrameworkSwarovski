package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HomePage extends BasePage {

//    Locators:

    private By searchButtonLocator = By.xpath("//*[@aria-label=\"icon-search image\"]");
    private By logInButtonLocator = By.xpath("//*[@class=\"swa-header__right-actions\"]//*[@aria-label=\"Login\" and @title=\"Login\"]");
    private By hamburgerMenuLocator = By.xpath("//*[@aria-label=\"burger-mobile image\"]");
    private By jewelryCategoryLocator = By.xpath("//*[text()=\"Jewelry\"]");
    private By earringsCategoryLocator = By.xpath("//*[text()=\"Earrings\" and @class=\"swa-cms-link-component__content\"]");
    private By studEarringsCategoryLocator = By.xpath("//*[text()=\"Stud earrings\" and @class=\"swa-cms-link-component__content\"]");

//    Constructor:

    public HomePage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

//    Actions:

    public void clickOnSearchButton () {
        wait.until(ExpectedConditions.elementToBeClickable(searchButtonLocator)).click();
    }

    public void clickOnLogInButton () {
        wait.until(ExpectedConditions.elementToBeClickable(logInButtonLocator)).click();
    }

    public void clickOnHamburgerMenu () {
        wait.until(ExpectedConditions.elementToBeClickable(hamburgerMenuLocator)).click();
    }

    public void clickOnJewelryCategory () {
        wait.until(ExpectedConditions.elementToBeClickable(jewelryCategoryLocator)).click();
    }

    public void clickOnEarringsCategory () {
        wait.until(ExpectedConditions.elementToBeClickable(earringsCategoryLocator)).click();
    }

    public void clickOnstudEarringsCategory () {
        wait.until(ExpectedConditions.elementToBeClickable(studEarringsCategoryLocator)).click();
    }







}
