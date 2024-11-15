package utils;

import constants.Constant;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class ChromeDriver {
  public static WebDriver driver;

  @Before
  public static void driverSetup() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    driver = new org.openqa.selenium.chrome.ChromeDriver();
    driver.get(Constant.WEBSITE_URL);
    Thread.sleep(2000);

  }
  @After
  public static void driverQuit() {
    driver.quit();
  }
}
