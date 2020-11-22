package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/feature"
,glue= {"stepdef"},plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },monochrome = true
)
public class RunnerClass {

}
