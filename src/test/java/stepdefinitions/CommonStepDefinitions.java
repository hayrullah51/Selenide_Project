package stepdefinitions;

import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class CommonStepDefinitions {

    @Given("User goes to {string}")
    public void user_goes_to(String string) {
        open(string);

    }
}
