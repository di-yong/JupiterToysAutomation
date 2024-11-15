package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;


@CucumberOptions(
  features = "src/test/java/features/ContactPageErrorValidation.feature",
  glue = {"utils", "steps"},
  plugin = {"pretty", "html:target/cucumer-html-report", "json:cucumber.json"}
)

@Test
public class TestRunner extends AbstractTestNGCucumberTests{
}
