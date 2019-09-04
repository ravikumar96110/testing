package mybdcrunner;

import cucumber.api.CucumberOptions;

@RunWith(cucumber.class)
@CucumberOptions(features="C:\\Users\\training_b6b.01.07\\eclipse-workspace\\mydemo_1\\my_features\\feature99\\bdc_demo_01.feature",glue="bdcstepdefinitions",plugin= {"pretty","html:target/cucumber-html-report","json:target/SriniDemo-JSON-report"))
public class BDCRUNNER {
}
