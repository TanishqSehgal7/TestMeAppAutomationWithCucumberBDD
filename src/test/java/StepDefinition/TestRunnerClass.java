package StepDefinition;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C://Users//Tanishq Sehgal//eclipse-workspace-new//CucumberTestMeAppImplementation//src//test//java//Features",
glue= {"StepDefinition"},
monochrome=true,
plugin= {"pretty", "html:target//HTMLReport//Report.html",
"pretty", "json:target//JSONReport//Report.json",
"pretty", "junit:target//XMLReport//Report.xml"}, 
tags ="@Login")
public class TestRunnerClass {

}
