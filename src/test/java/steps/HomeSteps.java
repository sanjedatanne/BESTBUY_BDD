package steps;




import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reporting.Logs;

public class HomeSteps extends BaseClass{

	@Given("user navigate to best buy")
	public void user_navigate_to_best_buy() {
		Logs.log("Before Hook");
	}

	@Given("search laptop")
	public void search_laptop() {
		homePage.laptopSearch();
	}		

	@When("click the laptop selected")
	public void click_the_laptop_selected() {
	   homePage.clickLaptop();
		
	}

	@When("click warrenty")
	public void click_warrenty() {
	    homePage.warranty();
	}

	@When("add to chart")
	public void add_to_chart() {
		homePage.addToCart();
	    
	}

	@Then("go to chart")
	public void go_to_chart() {
		homePage.goToCart();
	   
	}

	@Then("checkout")
	public void checkout() {
	   homePage.checkOutItems();
	}

	
}
