package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LogInPage extends BasePage {

    public By emailInputFieldLocator = By.id("sacLoginForm-j_username");


    public LogInPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }
}
