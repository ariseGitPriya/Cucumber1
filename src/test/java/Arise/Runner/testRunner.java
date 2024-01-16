package Arise.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Arise/Feature",
        glue = "Arise/StepDefination",
        monochrome = true,
        tags = "@login"

)
public class testRunner extends AbstractTestNGCucumberTests {
}
