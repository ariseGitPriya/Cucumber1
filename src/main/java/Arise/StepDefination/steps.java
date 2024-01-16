package Arise.StepDefination;

import Arise.Base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {

    @Given("Launch the brawser and navigates to login")
    public void launch_the_brawser_and_navigates_to_login() {
        System.out.println("Brawser is launching.....");
        BaseTest.launchBrawser();
        System.out.println("Brawser is Launched...");
    }

    @When("Enter the username and passward")
    public void enter_the_username_and_passward() {

        System.out.println("When: Enters the  valid Username and Passward");

    }
    @Then("User should navigates to home page")
    public void user_should_navigates_to_home_page() {

        System.out.println("Then : user should be on home page");

    }

    @When("Enter the invalid username and passward")
    public void enter_the_invalid_username_and_passward() {

        System.out.println("When : Enter the invalid username and passward");
    }
    @Then("user should get the error message")
    public void user_should_get_the_error_message() {

        System.out.println("Then : user should get the error message" );
    }


    @Given("Launch the brawser and navigates to Registration")
    public void launch_the_brawser_and_navigates_to_registration() {
        BaseTest.launchBrawser();
        System.out.println("Brawser is Launching....Step 1");
    }
    @When("Enter valid EmailId")
    public void enter_valid_email_id() {
        System.out.println("Enter valid EmailId...Step 2");
    }
}
