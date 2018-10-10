package com.mercadolibre.www.pages;

import com.mercadolibre.www.utils.Config;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.cssSelector;

/**
 * Created by kprox
 */
public class ModifyPage extends BasePage {

    private static final String PAGE_URL = "https://vender.mercadolibre.com.ar/item/update?itemId=";

    //SELECTORS
    private By localPickupCheckbox = cssSelector("input#local_pickup");
    private By saveButton = cssSelector("input.syi-action-button__primary.ui-btn");

    /**
     * Public constructor
     *
     * @param driverProvider
     */
    public ModifyPage(WebDriverProvider driverProvider, Config config) {
        super(driverProvider, config);
    }

    /**
     * Overloaded version of go method with parameters
     *
     * @param itemId
     */
    public void goWithItemId(String itemId) {
        super.go(getPageURL(itemId));
    }

    @Override
    protected String getPageURL() {
        return new StringBuilder(PAGE_URL).append(config.getTestItemId()).toString();
    }

    /**
     * Overloaded version receiving parameters
     *
     * @param itemId
     * @return
     */
    private String getPageURL(String itemId) {
        return new StringBuilder(PAGE_URL).append(itemId).toString();
    }

    /**
     * Returns the local pickup checkbox element
     *
     * @return
     */
    public WebElement getLocalPickupCheckbox() {
        return findElement(localPickupCheckbox);
    }

    /**
     * Returns the save button element
     *
     * @return
     */
    public WebElement getSaveButton() {
        return findElement(saveButton);
    }
}
