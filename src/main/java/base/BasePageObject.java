package base;

import drivers.WebDriverPool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageObject {

  public WebDriver getDriver() {
    return WebDriverPool.driver;
  }

  public WebElement find(By locator) {
    return getDriver().findElement(locator);
  }

  public void click(By locator) {
    find(locator).click();
  }

  public void type(By locator, CharSequence... text) {
    WebElement el = find(locator);
    el.clear();
    el.sendKeys(text);
  }

  public void clear(By locator) {
    find(locator).clear();
  }

  public String getText(By locator) {
    return find(locator).getText();
  }

  public boolean isDisplayed(By locator) {
    return find(locator).isDisplayed();
  }

  public void openPage(String url) {
    getDriver().get(url);
  }

}
