package tests;

import drivers.WebDriverPool;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.GoogleHomePage;
import pages.SearchResultPage;

public class SearchGoogleTestWithPageObject {

  private GoogleHomePage googleHomePage = new GoogleHomePage();
  private SearchResultPage searchResultPage = new SearchResultPage();

  @BeforeEach //@Before
  public void openBrowser() {
    WebDriverPool.initialize();
  }

  @AfterEach //@After
  public void quitBrowser() {
    WebDriverPool.destroy();
  }

  @Test
  public void searchGoogleGojekAndValidateResult() {
    googleHomePage.openPage();
    googleHomePage.inputKeywordAndEnter("Gojek");
    String title = searchResultPage.getResultTitleText();
    Assertions.assertEquals("Gojek", title);
  }

  @Test
  public void searchGoogleTokopediaAndValidateResult() {
    googleHomePage.openPage();
    googleHomePage.inputKeywordAndEnter("Tokopedia");
    String title = searchResultPage.getResultTitleText();
    Assertions.assertEquals("Tokopedia", title);
  }

}
