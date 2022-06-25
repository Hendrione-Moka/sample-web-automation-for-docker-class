package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogleTest {


  @Test
  public void searchGoogleAndValidateResult() {
    //selenium -> Webdriver -> Browser
    //setup Webdriver
    WebDriverManager.chromedriver().setup();
    //inisialisasi session di webdriver.
    ChromeDriver driver = new ChromeDriver();
    //buka browser
    driver.get("https://www.google.com/");

    //input search find -> action
    By locatorInputSearch = By.name("q");
    WebElement inputSearch = driver.findElement(locatorInputSearch);
    inputSearch.sendKeys("Gojek" );
    inputSearch.clear();
    inputSearch.sendKeys("Gojek" + Keys.ENTER);

    By locatorResultTitle = By.cssSelector("h2[data-attrid='title']");
    WebElement labelResultTitle = driver.findElement(locatorResultTitle);
    String title = labelResultTitle.getText();
    //Junit Assert.assertTrue() //Junit 4
    Assertions.assertEquals("Gojek", title);

    //Quit
    driver.quit();
  }

}
