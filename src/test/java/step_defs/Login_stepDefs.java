package step_defs;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Login_stepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user type in valid credentials: {string} and {string}")
    public void theUserTypeInValidCredentialsAnd(String userName, String password) {
        loginPage.loginMtd(userName, password);
    }
}
