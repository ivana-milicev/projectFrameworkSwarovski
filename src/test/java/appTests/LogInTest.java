package appTests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;

import java.time.Duration;

public class LogInTest extends BaseTest {

//    Locators:

    HomePage homePage = new HomePage(driver, Duration.ofSeconds(20));
    LogInPage logInPage = new LogInPage(driver, Duration.ofSeconds(20));

//    Tests:

    @Test
    public void validLogInTest() {
        homePage.clickOnLogInButton();
        logInPage.loginFunctionality("ivanans90@hotmail.com", "swarovskiPass456");

        String headingText = logInPage.myAccountPageCheck();
        System.out.println("My Account page heading text: " + headingText);

        Assert.assertTrue("Result heading should contain 'My Account'", headingText.contains("My Account"));
    }

    @Test
    public void testInvalidEmail() {
        homePage.clickOnLogInButton();
        logInPage.loginFunctionality("ivanans@hotmail.com", "swarovskiPass456");

        Assert.assertEquals("Register", logInPage.registerPageHeadingLocator);
    }

    @Test
    public void testInvalidPassword() {
        homePage.clickOnLogInButton();
        logInPage.loginFunctionality("ivanans@hotmail.com", "swarovskiPass789");

        Assert.assertEquals("Your email address or password was incorrect.", logInPage.errorMessageLocator);
    }

    @Test
    public void exampleTestInvalidPassword() {
        homePage.clickOnLogInButton();
        logInPage.loginFunctionality("ivanans@hotmail.com", "swarovskiPass789");

        Assert.assertEquals("Your email address or password was incorrect.", logInPage.errorMessageLocator);



}