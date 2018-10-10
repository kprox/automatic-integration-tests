package com.mercadolibre.www.pages;

import com.mercadolibre.www.utils.Config;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.cssSelector;

/**
 * Created by kprox
 */
public class LoginPage extends BasePage {

    private static final String PAGE_URL = "https://www.mercadolibre.com.ar/";

    //SELECTORS
    private By usernameField = cssSelector("input#user_id");
    private By passwordField = cssSelector("input#password");
    private By continueButton = cssSelector("input.ui-button.ui-button--primary");
    private By loginButton = cssSelector("button.ui-button.ui-button--primary");

    /**
     * Public constructor
     *
     * @param driverProvider
     */
    public LoginPage(WebDriverProvider driverProvider, Config config) {
        super(driverProvider, config);
    }

    @Override
    protected String getPageURL() {
        return PAGE_URL;
    }

    /**
     * Returns the Username field element
     *
     * @return
     */
    public WebElement getUsernameField() {
        return findElement(usernameField);
    }

    /**
     * Returns the Password field element
     *
     * @return
     */
    public WebElement getPasswordField() {
        return findElement(passwordField);
    }

    /**
     * Returns the Continue button element
     *
     * @return
     */
    public WebElement getContinueButton() {
        return findElement(continueButton);
    }

    /**
     * Returns the Login button element
     *
     * @return
     */
    public WebElement getLoginButton() {
        return findElement(loginButton);
    }
}
