package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LogInPage extends BasePage {

//    Locators:

    public By emailInputFieldLocator = By.id("id=\"sacLoginForm-j_username\"");
    public By errorMessageLocator = By.xpath("//*[text()=\"Your email address or password was incorrect.\"]");
    public By continueButtonLocator = By.xpath("//*[text()=\"Continue\"]");
    public By passwordInputFieldLocator = By.id("sacLoginForm-j_password");
    public By loginButtonLocator = By.xpath("//*[text()=\"Login\"]");
    public By myAccountPageHeadingLocator = By.className("h1");
    public By registerPageHeadingLocator = By.xpath("//*[text()=\"Register\"]");

//    Constructor:

    public LogInPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

//    Actions:

    public void loginFunctionality (String emailInput, String passwordInput) {
        driver.findElement(emailInputFieldLocator).sendKeys(emailInput);
        driver.findElement(continueButtonLocator).click();
        driver.findElement(passwordInputFieldLocator).sendKeys(passwordInput);
        driver.findElement(loginButtonLocator).click();
    }

    public String myAccountPageCheck () {
        return driver.findElement(myAccountPageHeadingLocator).getText();
    }

    public String errorMessageAppearance () {
        return driver.findElement(errorMessageLocator).getText();
    }

}
