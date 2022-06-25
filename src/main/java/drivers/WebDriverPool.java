package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.Map;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverPool {

  public static RemoteWebDriver driver;

  public static void initialize() {
    WebDriverManager.chromedriver().setup();
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("browserName", "firefox");
    capabilities.setCapability("browserVersion", "101.0");
    capabilities.setCapability("selenoid:options", Map.<String, Object>of(
        "enableVNC", true,
        "enableVideo", false
    ));

    try {
      driver = new RemoteWebDriver(
          URI.create("http://localhost:4444/wd/hub").toURL(),
          capabilities
      );
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  }

  public static void destroy() {
    driver.quit();
  }

}
