package pages;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageBase {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//div[@class='v7W49e']/div")
	List<WebElement> searchResults ;
	
	public void SelectTheResultNumber(int SelectSearchNumber)
	{

		clickButton(searchResults.get(SelectSearchNumber));

	}

}

