package forGitANDJenkins;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class firstREPO {


@Given("^First given$")
public void first_given() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("First Given for pulling");
    
}

@When("^First when$")
public void first_when() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("First When");
    
}

@Then("^First then$")
public void first_then() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("First Then");
    
}


@Given("^Second given$")
public void second_given() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Second Given");
}

@When("^Second when$")
public void second_when() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Second When");
    
}

@Then("^Second then$")
public void second_then() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Second Then");

}





}
