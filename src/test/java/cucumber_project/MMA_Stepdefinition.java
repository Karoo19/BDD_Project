package cucumber_project;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MMA_Stepdefinition {

	
	@Given("I am interested in learning Gym")
	public void i_am_interested() {
		System.out.println(" I am interested in learning Gym");
	}
	
	@And("I went online to find different MMA Gyms nearBy my area")
	public void online_gym() {
		System.out.println("I went online to find different MMA Gyms nearBy my area");
	}
	
	@And("I shortlisted 2 MMA Gym")
	public void list_gym() {
		System.out.println("I shortlisted 2 MMA Gym");
	}
	
	
	@And("I went to see the 1st Gym")
	public void listsof_gym() {
		System.out.println("I went to see the 1st Gym");
	}
	
	
	
	@And("I took the annual membership for Gym")
	public void member_ship() {
		System.out.println("I went online to find different MMA Gyms nearBy my area");
	}
	
	
	
	@When("My friends got to hear about this Gym")
	public void friends_gym() {
		System.out.println("My friends got to hear about this Gym");
	}
	
	
	
	@Then("3 Of them decided to join")
	public void join_gym() {
		System.out.println("3 Of them decided to join");
	}
	
	
	
	@But("I asked for referral discount")
	public void discount_by_referral() {
		System.out.println("I asked for referral discount");
	}
}
