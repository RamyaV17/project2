package cucumberrrr3;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class scenario1 {
	@Given("^User must br registered$")
	public void user_must_br_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user");
	}

	@When("^login using <username> and name(\\d+)$")
	public void login_using_username_and_name(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user");
	}

	@Then("^user must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user");
	}

	@When("^login using <username> and xyz(\\d+)$")
	public void login_using_username_and_xyz(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user");
	}

	}
