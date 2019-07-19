package cucumberrrr3;

import java.util.List;
import java.util.Map;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenario2 {
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^login using below credentials$")
	public void login_using_below_credentials(DataTable dt) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	  //  throw new PendingException();
		
		List<Map<String,String>> credential =dt.asMaps(String.class,String.class);
		for(int i=0; i< credential.size();i++)
		{
				System.out.println(credential.get(i).get("username")+"\t"+credential.get(i).get("password"));
			}
	}

	@Then("^User must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

  
}
