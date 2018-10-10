package com.mercadolibre.www.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

import java.util.concurrent.TimeUnit;

/**
 * Created by kprox
 */
public abstract class BasePage extends FluentWebDriverPage {

    /**
     * Public constructor
     *
     * @param driverProvider
     */
    public BasePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    /**
     * Maximize the browser and access the previously set URL
     */
    public void go() {
        manage().window().maximize();
        get(getPageURL());
        manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    /**
     * Returns the page URL
     *
     * @return
     */
    protected abstract String getPageURL();
}
