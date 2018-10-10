package com.mercadolibre.www.pages;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.cssSelector;

/**
 * Created by kprox
 */
public class HomePage extends BasePage {

    private static final String PAGE_URL = "https://www.mercadolibre.com.ar/";

    //SELECTORS
    private By loginButton = cssSelector("a.option-login");
    private By nicknameText = cssSelector("span.nav-header-username");

    /**
     * Public constructor
     *
     * @param driverProvider
     */
    public HomePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    @Override
    protected String getPageURL() {
        return PAGE_URL;
    }

    /**
     * Returns the login button element
     *
     * @return
     */
    public WebElement getLoginButton() {
        return findElement(loginButton);
    }

    /**
     * Returns the Nickname text element
     *
     * @return
     */
    public WebElement getNicknameText() {
        return findElement(nicknameText);
    }
}
