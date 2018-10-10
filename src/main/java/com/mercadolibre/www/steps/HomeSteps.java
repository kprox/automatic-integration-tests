package com.mercadolibre.www.steps;

import com.mercadolibre.www.pages.HomePage;
import com.mercadolibre.www.utils.Config;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kprox
 */
public class HomeSteps extends BaseSteps<HomePage> {

    /**
     * Public constructor
     *
     * @param page
     * @param config
     */
    public HomeSteps(HomePage page, Config config) {
        super(page, config);
    }

    @Given("I am on Home page")
    public void accessPage() {
        page.go();
    }

    @When("I click on Login button")
    public void clickOnLoginButton() {
        page.getLoginButton().click();
    }

    @Then("the Nickname shows a valid test user nickname")
    public void validateUserNickname() {
        validateUserNickname(config.getTestUserNickname());
    }

    @Then("the Nickname shows $nickname as user name")
    public void validateUserNickname(String nickname) {
        assertEquals("User nickname doesn't match", nickname, page.getNicknameText().getText());
    }
}
