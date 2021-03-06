package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.SearchResultPage;
import tests.TestBase;
import utilities.Helper;

public class SearchGoogle extends TestBase {
	
	HomePage homeObject = new HomePage(driver);
	SearchResultPage SearchResultObject;
	Helper HelperObject ;

	@Given("^User write \"([^\"]*)\" in the searched box$")
	public void user_write_in_the_searched_box(String searchedItem) { 
		homeObject.SearchWithAnItem(searchedItem);
		
	}

	@When("^User select \"([^\"]*)\" from the Suggested List$")
	public void user_select_from_the_Suggested_List(String selectedItem) {
		homeObject.SelectFromSuggestedList(selectedItem);
	}

	@Then("^User select result number \"([^\"]*)\" from the result List$")
	public void user_select_result_number_from_the_result_List(int resultNumber) {
		SearchResultObject.SelectTheResultNumber(resultNumber);
	}

}
