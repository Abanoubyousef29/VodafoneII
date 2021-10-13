package tests;


import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchResultPage;
import utilities.Helper;

public class Task1 extends TestBase {
	
	HomePage homeObject;
	SearchResultPage SearchResultObject;
	Helper HelperObject ;
	
	@Test
	public void SearchFunction()
	{
		homeObject = new HomePage(driver);
		SearchResultObject = new SearchResultPage(driver);
		
		homeObject.SearchWithAnItem("selenium webdriver");
		homeObject.SelectFromSuggestedList("selenium webdriver download");
		
		//SelectTheResultNumber is a method where you can send the number of the link to opened
		SearchResultObject.SelectTheResultNumber(5);	
	}
	
}
