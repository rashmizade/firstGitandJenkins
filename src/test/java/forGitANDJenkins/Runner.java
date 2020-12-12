package forGitANDJenkins;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "Features",
	glue = {"forGitANDJenkins"},
	tags={"@tag1"})


public class Runner {

}


