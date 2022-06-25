package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleHomePage;

public class GoogleHomePageStepDefs {

  private GoogleHomePage googleHomePage = new GoogleHomePage();

  @Given("user open google home page")
  public void userOpenGoogleHomePage() {
    googleHomePage.openPage();
  }
  @When("user search with keyword {string}")
  public void userSearchWithKeyword(String keyword) {
    googleHomePage.inputKeywordAndEnter(keyword);
  }
}
