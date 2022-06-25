package steps;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.SearchResultPage;

public class SearchResultPageStepDefs {

  private SearchResultPage searchResultPage = new SearchResultPage();

  @Then("user see search result title {string}")
  public void userSeeSearchResultTitle(String keyword) {
    String title = searchResultPage.getResultTitleText();
    Assertions.assertEquals(keyword, title);
  }

}
