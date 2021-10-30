package api.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @Given("User should be logged in and should be present at its own wall")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user_should_be_logged_in_and_should_be_present_at_its_own_wall");
    }
    @When("I type the message in the text box")
    public void i_type_the_message_in_the_text_box() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i_type_the_message_in_the_text_box");
    }
    @When("User supply the youtube link in the text box")
    public void user_supply_the_youtube_link_in_the_text_box() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user_supply_the_youtube_link_in_the_text_box");
    }
    @When("Click on Post button")
    public void click_on_post_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click_on_post_button");
    }
    @Then("the message should get posted")
    public void the_message_should_get_posted() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_message_should_get_posted");
    }

    @Then("The video should get posted on the user wall")
    public void the_video_should_get_posted_on_the_user_wall() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_video_should_get_posted_on_the_user_wall");
    }
    @Then("the video should have proper thumbnail.")
    public void the_video_should_have_proper_thumbnail() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_video_should_have_proper_thumbnail");
    }

}
