package pages;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy (xpath = "//input[@class='gLFyf gsfi']")
	WebElement searchBox ;
	
	@FindBy (xpath = "//ul[@role='listbox']/li")
	List<WebElement> suggestedList ;
	
	boolean elementFound ;
	
	public void SearchWithAnItem(String Searched)
	{
		setTextBox(searchBox, Searched);
	}
	
	public void SelectFromSuggestedList(String SearchedItem)
	{
		for (WebElement webElement : suggestedList )
		{
			if (webElement.getText().toString().equals(SearchedItem))
			{
				clickButton(webElement);
				elementFound = true ;
				break ;
			}		
		}
		
		if (elementFound == false)
		{
			System.out.println("Item Was Not Found In The Suggested List");
		}

	}
}
