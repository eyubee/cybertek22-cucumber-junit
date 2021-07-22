package com.cybertek.step_definitions;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableStepDefinitions {
    @Then("user should below words display")
    public void user_should_below_words_display(List<String> listOfFruits) {
        System.out.println("list Of Fruits = " + listOfFruits.size());
        System.out.println("list Of Fruits = " + listOfFruits);
    }
    @Given("user is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {
       String url= ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
    }
    @When("user entres username and password as below")
    public void user_entres_username_and_password_as_below(Map <String, String> loginInfo) {
        System.out.println("username"+loginInfo.get("username"));
        System.out.println("password"+loginInfo.get("password"));
    }
    @Then("user should see title is something")
    public void user_should_see_title_is_something() {
        System.out.println("title verification");
    }
}
