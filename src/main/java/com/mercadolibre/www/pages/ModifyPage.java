package com.mercadolibre.www.pages;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.cssSelector;

/**
 * Created by kprox
 */
public class ModifyPage extends BasePage {

    private static final String PAGE_URL = "https://vender.mercadolibre.com.ar/item/update?itemId=MLA750018526";

    //SELECTORS
    private By localPickupCheckbox = cssSelector("input#local_pickup");
    private By saveButton = cssSelector("input.syi-action-button__primary.ui-btn");

    /**
     * Public constructor
     *
     * @param driverProvider
     */
    public ModifyPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    @Override
    protected String getPageURL() {
        return PAGE_URL;
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
