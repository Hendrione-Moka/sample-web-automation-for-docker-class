package locators;

import org.openqa.selenium.By;

public interface SearchResultPageLocator {
  By LABEL_RESULT_TITLE = By.xpath("//h2[@data-attrid='title']");
}
