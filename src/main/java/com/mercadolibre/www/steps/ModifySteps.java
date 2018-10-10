package com.mercadolibre.www.steps;

import com.mercadolibre.www.model.FieldState;
import com.mercadolibre.www.pages.ModifyPage;
import com.mercadolibre.www.utils.Config;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

/**
 * Created by kprox
 */
public class ModifySteps extends BaseSteps<ModifyPage> {

    /**
     * Public constructor
     *
     * @param page
     * @param config
     */
    public ModifySteps(ModifyPage page, Config config) {
        super(page, config);
    }

    @Given("I am on Modify page")
    @When("I go to Modify page")
    public void accessPage() {
        page.go();
    }

    @When("I click on Local Pickup checkbox")
    public void clickOnLocalPickupCheckbox() {
        page.getLocalPickupCheckbox().click();
    }

    @When("I uncheck the Local Pickup checkbox")
    public void uncheckLocalPickupCheckbox() {
        if (Boolean.valueOf(page.getLocalPickupCheckbox().getAttribute("value"))) {
            page.getLocalPickupCheckbox().click();
        }
    }

    @When("I click on Save button")
    public void clickOnSaveButton() {
        page.getSaveButton().click();
    }

    @Then("the Local Pickup checkbox is $state")
    public void verifyLocalPickupCheckboxState(FieldState state) {
        switch(state) {
            case checked:
                assertTrue("Local Pickup checkbox was unchecked", Boolean.valueOf(page.getLocalPickupCheckbox().getAttribute("value")));
                break;
            case unchecked:
                assertFalse("Local Pickup checkbox was checked", Boolean.valueOf(page.getLocalPickupCheckbox().getAttribute("value")));
                break;
            default:
                fail("Invalid Field State");
                break;
        }
    }
}
