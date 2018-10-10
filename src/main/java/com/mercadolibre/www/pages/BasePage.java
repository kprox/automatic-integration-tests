package com.mercadolibre.www.pages;

import com.mercadolibre.www.utils.Config;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

import java.util.concurrent.TimeUnit;

/**
 * Created by kprox
 */
public abstract class BasePage extends FluentWebDriverPage {

    protected Config config;

    /**
     * Public constructor
     *
     * @param driverProvider
     */
    public BasePage(WebDriverProvider driverProvider, Config config) {
        super(driverProvider);
        this.config = config;
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
     * Maximize the browser and access the provided URL
     */
    public void go(String URL) {
        manage().window().maximize();
        get(URL);
        manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    /**
     * Returns the page URL
     *
     * @return
     */
    protected abstract String getPageURL();
}
