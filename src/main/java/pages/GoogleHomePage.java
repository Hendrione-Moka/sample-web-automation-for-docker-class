package pages;

import static locators.GoogleHomePageLocator.INPUT_SEARCH;

import base.BasePageObject;
import org.openqa.selenium.Keys;

public class GoogleHomePage extends BasePageObject {

  public void inputKeywordAndEnter(String keyword) {
    type(INPUT_SEARCH, keyword + Keys.ENTER);
  }

  public void openPage() {
    openPage("https://www.google.com/");
  }

}
