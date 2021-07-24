package com.cybertek.step_definitions;

import com.cybertek.pages.DropdownsPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class DataTableStepDefinitions {
    DropdownsPage dropdownsPage= new DropdownsPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }


    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List <String> expectedList) {

        Select dropdownSelect= new Select(dropdownsPage.monthDropDown);
        List<WebElement> actualMonthsOptions = dropdownSelect.getOptions();

    }

    LibraryLoginPage libraryLogin= new LibraryLoginPage();
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
        String username= loginInfo.get("username");
        libraryLogin.email.sendKeys(username);
        String password= loginInfo.get("password");
        libraryLogin.password.sendKeys(password);
        libraryLogin.signInButton.click();

    }
    @Then("user should see title is something")
    public void user_should_see_title_is_something() {
       String actualTitle= Driver.getDriver().getTitle();
       String expectedTitile= "Login - Library";
        Assert.assertEquals("title is the same ",expectedTitile,actualTitle);
    }
}
