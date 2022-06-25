package pages;

import static locators.SearchResultPageLocator.LABEL_RESULT_TITLE;

import base.BasePageObject;

public class SearchResultPage extends BasePageObject {

  public String getResultTitleText() {
    return getText(LABEL_RESULT_TITLE);
  }

}
