package com.mercadolibre.www.steps;

import com.mercadolibre.www.pages.LoginPage;
import com.mercadolibre.www.utils.Config;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

import static junit.framework.TestCase.fail;

/**
 * Created by kprox
 */
public class LoginSteps extends BaseSteps<LoginPage> {

    /**
     * Public constructor
     *
     * @param page
     * @param config
     */
    public LoginSteps(LoginPage page, Config config) {
        super(page, config);
    }

    @Given("I logged in using an impersonalization link")
    @When("I login using an impersonalization link")
    public void loginWithLink() {
        String link = config.getLinkFromSystemProps();

        if (link != null) {
            System.out.println("/// LINK: " + link);
            page.go(link);
        } else {
            fail("Couldn't access impersonalization link");
        }
    }

    @When("I use a test username")
    public void loginWithTestUsername() {
        inputUsername(config.getTestUsername());
    }

    @When("I use a test user password")
    public void loginWithTestUserPassword() {
        inputPassword(config.getTestUserPassword());
    }

    @When("I enter $username in Username field")
    public void inputUsername(String username) {
        page.getUsernameField().sendKeys(username);
    }

    @When("I enter $password in Password field")
    public void inputPassword(String password) {
        page.getPasswordField().sendKeys(password);
    }

    @When("I click Continue")
    public void clickOnContinueButton() {
        page.getContinueButton().click();
    }

    @When("I click Login")
    public void clickOnLoginButton() {
        page.getLoginButton().click();
    }
}
