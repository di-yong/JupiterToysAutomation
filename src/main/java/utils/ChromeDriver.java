package utils;

import constants.Constant;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class ChromeDriver {
  public static WebDriver driver;

  @BeforeAll
  public static void driverSetup() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    driver = new org.openqa.selenium.chrome.ChromeDriver();
    driver.get(Constant.WEBSITE_URL);
    Thread.sleep(2000);

  }
  @AfterAll
  public static void driverQuit() {
    driver.quit();
  }
}
