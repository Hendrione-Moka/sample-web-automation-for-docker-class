package hooks;

import drivers.WebDriverPool;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebdriverHook {

  @Before(order = 1)
  public void openBrowser() {
    WebDriverPool.initialize();
  }

  //semakin kecil maka semakin di prioritaskan
  // 1 2 3 4 test 4 3 2 1

  @After(order = 1)
  public void quitBrowser() {
    WebDriverPool.destroy();
  }

}
